package az.edu.itbrains.personal.controllers;


import az.edu.itbrains.personal.models.Banner;
import az.edu.itbrains.personal.models.Experience;
import az.edu.itbrains.personal.repositories.BannerRepository;
import az.edu.itbrains.personal.repositories.ExperienceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    private final BannerRepository bannerRepository;
    private final ExperienceRepository experienceRepository;

    public HomeController(BannerRepository bannerRepository, ExperienceRepository experienceRepository) {
        this.bannerRepository = bannerRepository;
        this.experienceRepository = experienceRepository;
    }


    @GetMapping("/")
    public String index(Model model){
        Banner findBanner = bannerRepository.findById(1L).orElseThrow();
        model.addAttribute("banner",findBanner);
        return "index.html";
    }

    @GetMapping("/resume")
    public String resume(Model model){
        List<Experience> findExperiences = experienceRepository.findAll();


        model.addAttribute("experiences", findExperiences);
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
