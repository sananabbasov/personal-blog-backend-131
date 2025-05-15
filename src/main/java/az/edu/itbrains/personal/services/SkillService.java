package az.edu.itbrains.personal.services;

import az.edu.itbrains.personal.dtos.skill.SkillDto;

import java.util.List;

public interface SkillService {
    List<SkillDto> getAllSkills();
}
