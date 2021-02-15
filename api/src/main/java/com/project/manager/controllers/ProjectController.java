package com.project.manager.controllers;

import com.project.manager.domain.Project;
import com.project.manager.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<Project>> getAll(){
        return ResponseEntity.status(200).body(this.projectService.listAll());
    }
}
