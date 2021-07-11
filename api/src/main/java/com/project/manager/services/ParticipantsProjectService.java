package com.project.manager.services;

import com.project.manager.domain.ParticipantsProject;
import com.project.manager.domain.Project;
import com.project.manager.domain.User;
import com.project.manager.repositories.ParticipantsProjectRepository;
import com.project.manager.repositories.ProjectRepository;
import com.project.manager.repositories.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ParticipantsProjectService {

    private final ParticipantsProjectRepository participantsProjectRepository;
    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    public List<ParticipantsProject> findAll(){
        return this.participantsProjectRepository.findAll();
    }

    @Transactional
    public ParticipantsProject save(ParticipantsProject participants){

        return this.participantsProjectRepository.save(participants);
    }

    public List<ParticipantsProject> listAllUserByIdProject(Long id){
        return this.participantsProjectRepository.findAllUsersByIdProject(id);
    }
}
