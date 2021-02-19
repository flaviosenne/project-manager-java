package com.project.manager.repositories;



import java.util.List;

import com.project.manager.domain.ParticipantsProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ParticipantsProjectRepository extends JpaRepository<ParticipantsProject, Integer> {

    @Query(value = "Select new com.project.manager.domain.BIByParticipantsProject(User.name)" +
    "from ParticipantsProject "+
    "inner join User "+
    "on User.participants_id = ParticipantsProject.id "+
    "inner join Project "+
    "on Project.participants_id = ParticipantsProject.id "+
    "where User.id = ?1")
    List<ParticipantsProject> findAllUsersByIdProject(Long id); 
}
