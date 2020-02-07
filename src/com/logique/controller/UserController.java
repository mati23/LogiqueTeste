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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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
    public String compress(@ModelAttribute("url")  String url, HttpServletRequest request, RedirectAttributes redirectAttributes){
        String newUrl = this.urlService.insert(url, request.getSession().getAttribute("login").toString());
        redirectAttributes.addFlashAttribute("newlink",newUrl);
        return "redirect:/index/";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().setAttribute("login",null);
        return "redirect:/index/";
    }
    @GetMapping("/list")
    public String list(HttpServletRequest request, Map<String, Object> model){
        List<Url> listUrl = urlService.findAll();
        model.put("urls", listUrl);
        return "list";
    }
}
