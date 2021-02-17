package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "participants")
public class ParticipantsProject {
    @JsonProperty(value = "id")
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonProperty(value = "projects")
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<Project> project;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonProperty(value = "users")
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<User> user;

 
}
