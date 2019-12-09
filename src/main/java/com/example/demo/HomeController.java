package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform") // display template formtemplate.html to user
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform") //
    public String loadFromPage(@RequestParam("email") String email, Model model){
        model.addAttribute("emailLogin", email);
        return "confirm";
    }
}
