package az.edu.itbrains.personal.services.impls;

import az.edu.itbrains.personal.dtos.experience.ExperienceDto;
import az.edu.itbrains.personal.models.Experience;
import az.edu.itbrains.personal.repositories.ExperienceRepository;
import az.edu.itbrains.personal.services.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public List<ExperienceDto> getAllExperiences() {

        List<Experience> findExperiences = experienceRepository.findAll();
        List<ExperienceDto> experienceDtoList = new ArrayList<>();

        for (Experience experience : findExperiences) {
            ExperienceDto experienceDto = new ExperienceDto();
            experienceDto.setId(experience.getId());
            experienceDto.setPosition(experience.getPosition());
            experienceDto.setDescription(experience.getDescription());
            experienceDto.setCompany(experience.getCompany());
            experienceDto.setStartDate(experience.getStartDate());
            experienceDto.setEndDate(experience.getEndDate());
            experienceDto.setCity(experience.getCity());
            experienceDtoList.add(experienceDto);
        }

        return experienceDtoList;
    }
}
