package com.project.manager.repositories;

import com.project.manager.domain.ParticipantsProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantsProjectRepository extends JpaRepository<ParticipantsProject, Integer> {
}
