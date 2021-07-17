package com.project.manager.services;

import com.project.manager.domain.Project;
import com.project.manager.domain.User;
import com.project.manager.repositories.ProjectRepository;
import com.project.manager.requests.ProjectDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ResponseEntity<ProjectDto> save(ProjectDto projectDto, HttpServletRequest request){
        User user = new User();
        Project projectSaved = projectRepository
                .save(ProjectDto.fromDomain(projectDto, user));

        return ResponseEntity.status(201).body(ProjectDto.fromDto(projectSaved));
    }

    public ResponseEntity<List<ProjectDto>> list(HttpServletRequest request){
        List<Project> listProject = projectRepository
                .findAll();

        List<ProjectDto> listProjectDto = new ArrayList<>();
        for(Project project: listProject){
            listProjectDto.add(ProjectDto.fromDto(project));
        }
        return ResponseEntity.status(201).body(listProjectDto);
    }

}
