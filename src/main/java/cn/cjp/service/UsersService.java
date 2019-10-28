package cn.cjp.service;

import cn.cjp.entity.User;
import cn.cjp.entity.Users;

public interface UsersService {

    int insertUsers(Users users);

    Users selectUsersByName(String username);
}
