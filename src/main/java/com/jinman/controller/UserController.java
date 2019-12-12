package com.jinman.controller;

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
        System.out.println(userService.queryAll().get(0).toString());
        model.addAttribute("user",userService.queryAll().get(0));
        return "index";
    }

}
