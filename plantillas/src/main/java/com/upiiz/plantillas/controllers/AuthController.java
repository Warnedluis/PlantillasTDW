package com.upiiz.plantillas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")

public class AuthController {
    //http://localhost:8080/auth/login

    //De las plantillas buscar las carpetas css,js y de plugins

    @GetMapping("/login")

    public String login()
    {
        return "login";
    }

    //http://localhost:8080/auth/register
    @GetMapping("/register")

    public String register()
    {
        return "register";
    }

    @GetMapping("/forgot-password")

    public String forgot_password()
    {
        return "forgot-password";
    }



}
