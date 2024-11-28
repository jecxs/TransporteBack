package com.transporte.transporteback.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class RedirectController {
    @RequestMapping("/")
    public String redirect() {
        return "redirect:/swagger-ui/";
    }
}