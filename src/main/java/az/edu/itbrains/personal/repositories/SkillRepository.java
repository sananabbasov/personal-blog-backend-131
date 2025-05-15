package az.edu.itbrains.personal.repositories;

import az.edu.itbrains.personal.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
