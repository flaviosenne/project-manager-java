package com.project.manager.repositories;



import java.util.List;

import com.project.manager.domain.ParticipantsProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ParticipantsProjectRepository extends JpaRepository<ParticipantsProject, Integer> {

    @Query(value = "select p from ParticipantsProject p " +
    " where p.user.id = :id ")
    List<ParticipantsProject> findAllUsersByIdProject(Long id); 
}
