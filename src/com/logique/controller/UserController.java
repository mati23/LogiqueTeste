package com.logique.controller;

import com.logique.model.Url;
import com.logique.model.User;
import com.logique.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class UserController {
    @Autowired
    private UrlService urlService;
    @GetMapping("/")
    public String index(Model user){
        return "index";
    }

    @PostMapping("/compress")
    public String compress(@ModelAttribute("url")  String url,  HttpServletRequest request){
        this.urlService.insert(url, request.getSession().getAttribute("login").toString());
        return "index";
    }
}
