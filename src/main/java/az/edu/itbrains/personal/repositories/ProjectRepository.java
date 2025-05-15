package az.edu.itbrains.personal.repositories;

import az.edu.itbrains.personal.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
