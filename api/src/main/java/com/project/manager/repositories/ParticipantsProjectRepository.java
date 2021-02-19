package com.project.manager.repositories;



import com.project.manager.domain.ParticipantsProject;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParticipantsProjectRepository extends JpaRepository<ParticipantsProject, Integer> {

    // @Query(value = "Select * participants_user inner join user on user.id =  participants_user.user_id where user_id = ?1")
    // List<ParticipantsProject> findAllByUser(Long id); 
}
