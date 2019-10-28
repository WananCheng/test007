package cn.cjp.controller;

import cn.cjp.entity.User;
import cn.cjp.entity.Users;
import cn.cjp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UsersController {


    @Autowired
    private UsersService usersService;


    @RequestMapping("/add")
    @ResponseBody
    public int insertUsers(Users users){
        return usersService.insertUsers(users);
    }
}
