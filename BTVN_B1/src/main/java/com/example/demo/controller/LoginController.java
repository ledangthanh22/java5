package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String HienThiLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String user, @RequestParam("password") String pass, Model model) {
        if (user.isEmpty()) {
            model.addAttribute("messUser", "Username khong dc de trong!");
        } else if (pass.isEmpty()) {
            model.addAttribute("messPass", "Pass khong dc de trong!");
        } else if (user.equals("HangNT169") && pass.equals("123456")) {
            return "home";
        } else {
            model.addAttribute("mess", "Username hoac Password khong dung!");
        }
        return "login";
    }
}
