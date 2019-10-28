package cn.cjp.dao;

import cn.cjp.entity.Users;

public interface UsersDao {

    int insertUser(Users users);

        Users selectUsersByName(String username);
}
