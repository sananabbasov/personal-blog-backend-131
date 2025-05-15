package az.edu.itbrains.personal.services.impls;

import az.edu.itbrains.personal.dtos.project.ProjectDto;
import az.edu.itbrains.personal.models.Project;
import az.edu.itbrains.personal.repositories.ProjectRepository;
import az.edu.itbrains.personal.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public List<ProjectDto> getAllProjects() {

        List<Project> projectList = projectRepository.findAll();
        List<ProjectDto> projectDtoList =
                projectList.stream()
                .map(project -> new ProjectDto(project.getId(), project.getName(), project.getDescription(),project.getPhotoUrl()))
                .toList();

        return projectDtoList;
    }
}
