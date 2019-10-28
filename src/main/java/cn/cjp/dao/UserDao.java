package cn.cjp.dao;

import cn.cjp.entity.User;

public interface UserDao {

    User selectUserByName(String username);
}
