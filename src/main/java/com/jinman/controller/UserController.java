package com.jinman.controller;

import com.jinman.model.User;
import com.jinman.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    public String test(Model model){
        int id = 1;
        User user = userService.findUserById(id);
        System.out.println("user = "+user);
        model.addAttribute("user",user);
        return "index";
    }

}
