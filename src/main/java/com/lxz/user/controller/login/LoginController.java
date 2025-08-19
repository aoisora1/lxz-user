package com.lxz.user.controller.login;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @PostMapping("/logout")
    public void logout() {

    }

    @ResponseBody
    @GetMapping("/test")
    public String logout(HttpServletRequest request) {
        return request.getSession().getId();
    }
}
