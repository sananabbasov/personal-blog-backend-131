package az.edu.itbrains.personal.services;

import az.edu.itbrains.personal.dtos.language.LanguageDto;

import java.util.List;

public interface LanguageService {
    List<LanguageDto> getAllLanguages();
}
