package com.webapp.controllers;

import com.webapp.services.ErNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ErNewController {

    private final ErNewService erNewService;

    @Autowired
    public ErNewController(ErNewService erNewService) {
        this.erNewService = erNewService;
    }

    @PostMapping("/getAdress")
    public String getAddressByAccount(@RequestParam String account, Model model) {
        String adress = erNewService.getAdressByAccount(account);
        model.addAttribute("adress", adress);
        return "index.html";  // «амените на им€ вашей страницы с адресом
    }
}
