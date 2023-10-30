package com.webapp.controllers;

import com.webapp.services.ErNewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


    @Controller
    public class ErNewController {
        private ErNewService erNewService;

 //      public ErNewController(ErNewService erNewService) {
  //          this.erNewService = erNewService;
  //      }

    /*    @GetMapping("/user/{id}")
        public String getUser(@PathVariable Long id, Model model) {
            User user = userService.getUserById(id);
            model.addAttribute("user", user);
            return "user";
        } */
/*
        @PostMapping("/user")
        public String saveUser(User user) {
            userService.saveUser(user);
            return "redirect:/";
        } */
    }



