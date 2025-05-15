package az.edu.itbrains.personal.services.impls;

import az.edu.itbrains.personal.dtos.language.LanguageDto;
import az.edu.itbrains.personal.dtos.skill.SkillDto;
import az.edu.itbrains.personal.models.Language;
import az.edu.itbrains.personal.models.Skill;
import az.edu.itbrains.personal.repositories.LanguageRepository;
import az.edu.itbrains.personal.services.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;


    @Override
    public List<LanguageDto> getAllLanguages() {
        List<Language> findLanguages = languageRepository.findAll();
        List<LanguageDto> languages = findLanguages.stream().map(language -> new LanguageDto(language.getId(), language.getName())).collect(Collectors.toList());
        return languages;
    }
}
