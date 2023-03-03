package com.ssgh.blog.controller;

import com.ssgh.blog.service.AdminUserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminUserService adminUserService;

    @GetMapping("/login")
    public String login() {
        return "admin/login";
    }

    @GetMapping({"/", "/index", "/index.html", ""})
    public String index(HttpServletRequest request) {
        request.setAttribute("path", "index");
//        request.setAttribute("categoryCount",);
        return "admin/index";
    }
}
