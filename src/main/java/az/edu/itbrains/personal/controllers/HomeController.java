package az.edu.itbrains.personal.controllers;


import az.edu.itbrains.personal.dtos.banner.BannerHomeDto;
import az.edu.itbrains.personal.dtos.experience.ExperienceDto;
import az.edu.itbrains.personal.dtos.language.LanguageDto;
import az.edu.itbrains.personal.dtos.project.ProjectDto;
import az.edu.itbrains.personal.dtos.skill.SkillDto;
import az.edu.itbrains.personal.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    private final BannerService bannerService;
    private final ExperienceService experienceService;
    private final SkillService skillService;
    private final LanguageService languageService;
    private final ProjectService projectService;

    public HomeController(BannerService bannerService, ExperienceService experienceService, SkillService skillService, LanguageService languageService, ProjectService projectService) {
        this.bannerService = bannerService;
        this.experienceService = experienceService;
        this.skillService = skillService;
        this.languageService = languageService;
        this.projectService = projectService;
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
        List<SkillDto> skills = skillService.getAllSkills();
        List<LanguageDto> languages = languageService.getAllLanguages();

        model.addAttribute("experiences",experiences);
        model.addAttribute("skills",skills);
        model.addAttribute("languages",languages);

        return "resume.html";
    }

    @GetMapping("/projects")
    public String projects(Model model){
        List<ProjectDto> projectDtoList = projectService.getAllProjects();
        model.addAttribute("projects",projectDtoList);
        return "projects.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }

}
