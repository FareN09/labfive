package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @RequestMapping("/")
    public String getMain() {
        return  "CyberPunk";
    }

    @RequestMapping("/2077")
     public String getMain(@RequestParam String parameter, Model model) {
        model.addAttribute("user_name",parameter);
        return "2077";
    }
}
