package az.edu.itbrains.personal.repositories;

import az.edu.itbrains.personal.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
