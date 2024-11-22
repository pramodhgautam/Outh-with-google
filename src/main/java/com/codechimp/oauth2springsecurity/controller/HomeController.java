package com.codechimp.oauth2springsecurity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(@AuthenticationPrincipal OAuth2User principal, Model model) {
        // Add user name to the model
        model.addAttribute("name", principal.getAttribute("name"));
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}