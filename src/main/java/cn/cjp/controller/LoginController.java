package cn.cjp.controller;

import cn.cjp.service.UserService;
import cn.cjp.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UsersService userServices;

    @RequestMapping("/index")
    public String indxPage(){
        return "login";
    }

    /// 登录
    @PostMapping("/login2333")
    public String login(String username, String password, Model model) {
        String error = "";
        if (username != null && password != null) {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                subject.login(token);
                return "redirect:/index/listStudent";
            } catch (Exception e) {
                e.printStackTrace();
                error = "密码错误，请输入正确密码";
            }
        } else {
            error = "请输入用户名和密码";
        }
        model.addAttribute("error", error);
        return "login";
    }
    //    @RequestMapping("/login")
//    public String login(String username, String password, Model model){
//        String error = "";
//        User user = userService.selectUserByName(username);
//        if(password.equals(user.getPassword())){
////            return "redirect:index/listStudent";
//            return "redirect:/index/listStudent";
//        }else{
//            error ="密码错误";
//        }
//        model.addAttribute("error",error);
//        return "login";
//    }

    @RequestMapping("/success")
    public String dPage(){
        return "success";
    }
}
