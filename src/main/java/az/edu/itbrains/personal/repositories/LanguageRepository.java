package az.edu.itbrains.personal.repositories;

import az.edu.itbrains.personal.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
