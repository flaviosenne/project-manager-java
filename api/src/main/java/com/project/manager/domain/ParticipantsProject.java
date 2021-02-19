package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @OneToMany(mappedBy = "participants", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonProperty("projects")
    @JsonManagedReference("projects")
    private List<Project> project;

    @OneToMany(mappedBy = "participants", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonProperty("users")
    @JsonManagedReference("users")
    private List<User> user;

 
}
