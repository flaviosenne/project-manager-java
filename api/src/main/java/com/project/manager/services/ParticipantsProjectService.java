package com.project.manager.services;

import com.project.manager.domain.ParticipantsProject;
import com.project.manager.repositories.ParticipantsProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantsProjectService {

    private final ParticipantsProjectRepository participantsProjectRepository;

    public List<ParticipantsProject> findAll(){
        return this.participantsProjectRepository.findAll();
    }
}
