package az.edu.itbrains.personal.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/resume")
    public String resume(){
        return "resume.html";
    }

    @GetMapping("/projects")
    public String projects(){
        return "projects.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }

}
