package com.handess.springbootapp.controller;

import com.handess.springbootapp.bean.GlobalConfig;
import com.handess.springbootapp.bean.MenuConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
    @Autowired
    private GlobalConfig globalConfig;

    @Autowired
    private MenuConfig menuConfig;

    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", globalConfig.getName());
        model.addAttribute("website", globalConfig.getWebsite());
        model.addAttribute("facebook", globalConfig.getFacebook());
        model.addAttribute("message", message);
        model.addAttribute("menus", menuConfig.getMenus());
        return "index";
    }
}
