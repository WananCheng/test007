package cn.cjp.service.impl;

import cn.cjp.dao.UsersDao;
import cn.cjp.entity.PasswordHelper;
import cn.cjp.entity.Users;
import cn.cjp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl  implements UsersService {

    @Autowired
    private UsersDao usersDao;

    PasswordHelper passwordHelper = new PasswordHelper();

    @Override
    public int insertUsers(Users users) {
        //加密密码
        passwordHelper.encryptPassword(users);
        return usersDao.insertUser(users);
    }

    @Override
    public Users selectUsersByName(String username) {
        return usersDao.selectUsersByName(username);
    }
}
