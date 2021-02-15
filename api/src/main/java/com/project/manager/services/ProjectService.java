package com.project.manager.services;

import com.project.manager.domain.Project;
import com.project.manager.repositories.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public List<Project> listAll(){
        return this.projectRepository.findAll();
    }
}
