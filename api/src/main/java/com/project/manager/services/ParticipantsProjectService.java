package com.project.manager.services;

import com.project.manager.domain.ParticipantsProject;
import com.project.manager.domain.Project;
import com.project.manager.domain.User;
import com.project.manager.repositories.ParticipantsProjectRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ParticipantsProjectService {

    private final ParticipantsProjectRepository participantsProjectRepository;
    public List<ParticipantsProject> findAll(){
        return this.participantsProjectRepository.findAll();
    }

    @Transactional
    public ParticipantsProject create(ParticipantsProject participants){

        List<Project> listProjects = new ArrayList<>();
        for(Project project: participants.getProject()){
            
            listProjects.add(project);
        }
        List<User> listUsers = new ArrayList<>();
        for(User user: participants.getUser()){    
            listUsers.add(user);
        }  

        participants.setProject(listProjects);
        participants.setUser(listUsers);
        return this.participantsProjectRepository.save(participants);
    }
}
