package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Tat ca cac class trong com => deu la bean dc spring quan ly
//Khi danh dau la @Controller => Class nay (Tang may) -> la tang controller
//Dung de trao doi giua client @ server
public class HelloController {
    //    Client & Server giao tiep thong qua phuong thuc HTTP
//    Co 4 loai HTTP co ban:
//    GET <=>  READ
//    POST <=> CREATE
//    PUT <=> UPDATE
//    DELETE <=> DELETE
//    GET: Hien thi/ Lay du lieu
//    POST: Xu ly
//    Khi dung @Controller  => Mo hinh trong project MVC
//    => Tat ca request trong controller luon luon tra ve 1 view <=> RETURN STRING
    @GetMapping("/login")
    public String hienThiLogin() {
//        model.addAttribute("mess","Hello world");
        return "login";
    }

    @PostMapping("/ket-qua")
    public String login(@RequestParam("user") String username, @RequestParam("pass") String password, Model model) {

        model.addAttribute("mess", "User:" + username + "Pass:" + password);
        return "ket-qua";
    }
}
