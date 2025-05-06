package az.edu.itbrains.personal.controllers;


import az.edu.itbrains.personal.dtos.banner.BannerHomeDto;
import az.edu.itbrains.personal.dtos.experience.ExperienceDto;
import az.edu.itbrains.personal.services.BannerService;
import az.edu.itbrains.personal.services.ExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    private final BannerService bannerService;
    private final ExperienceService experienceService;

    public HomeController(BannerService bannerService, ExperienceService experienceService) {
        this.bannerService = bannerService;
        this.experienceService = experienceService;
    }


    @GetMapping("/")
    public String index(Model model){
        BannerHomeDto bannerHomeDto = bannerService.getHomeBanner();
        model.addAttribute("banner", bannerHomeDto);
        return "index.html";
    }

    @GetMapping("/resume")
    public String resume(Model model){

        List<ExperienceDto> experiences = experienceService.getAllExperiences();

        model.addAttribute("experiences",experiences);

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
