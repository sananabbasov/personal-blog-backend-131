package az.edu.itbrains.personal.services.impls;

import az.edu.itbrains.personal.dtos.skill.SkillDto;
import az.edu.itbrains.personal.models.Skill;
import az.edu.itbrains.personal.repositories.SkillRepository;
import az.edu.itbrains.personal.services.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;


    @Override
    public List<SkillDto> getAllSkills() {
        List<Skill> findSkills = skillRepository.findAll();
        List<SkillDto> skills = findSkills.stream().map(skill -> new SkillDto(skill.getId(), skill.getName())).collect(Collectors.toList());
        return skills;
    }
}
