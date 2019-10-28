package cn.cjp.service;

import cn.cjp.entity.User;

public interface UserService {

    User selectUserByName(String username);
}
