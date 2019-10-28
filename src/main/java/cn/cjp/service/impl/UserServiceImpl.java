package cn.cjp.service.impl;

import cn.cjp.dao.UserDao;
import cn.cjp.entity.User;
import cn.cjp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserByName(String username) {
        return userDao.selectUserByName(username);
    }
}
