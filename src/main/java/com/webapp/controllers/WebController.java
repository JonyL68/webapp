package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class LoginController {

    @GetMapping("/")
    public String login() {
        return "index.html"; // Имя вашего шаблона страницы входа (например, login.html)
    }
}
