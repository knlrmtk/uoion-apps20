package com.uoion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) throws Exception {

        model.addAttribute("appName", "UOION Spring Boot Application");
        model.addAttribute("version", "1.0.0");
        model.addAttribute("javaVersion", System.getProperty("java.version"));
        model.addAttribute("hostname", InetAddress.getLocalHost().getHostName());

        return "index";
    }

}
