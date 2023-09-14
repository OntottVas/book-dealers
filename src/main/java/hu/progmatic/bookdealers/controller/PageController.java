package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/about")
    public String getAboutPage(){
        return "about";
    }
}
