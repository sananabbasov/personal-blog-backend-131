package az.edu.itbrains.personal.services;

import az.edu.itbrains.personal.dtos.project.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getAllProjects();
}
