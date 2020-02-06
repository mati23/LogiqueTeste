package com.logique.controller;


import com.logique.dao.UserDAO;
import com.logique.dao.UserDAOImp;
import com.logique.model.User;
import com.logique.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
public class LoginController {
    private UserService userService;

    @Autowired(required = true)
    public void setUserService(UserService userService){
        this.userService  = userService;
    }

    @GetMapping("/")
    public String index(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, HttpServletRequest request){
        HttpSession session = request.getSession();
        boolean isValid = this.userService.validateUser(user.getEmail(), user.getPasswordHash());
        if(isValid == true){
            session.setAttribute("login", user.getEmail());
        }

        return "index";
    }
}
