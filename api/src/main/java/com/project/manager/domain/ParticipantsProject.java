package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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

    @JsonProperty(value = "projects")
    @Column(name = "project_id")
    private Integer projectId;

    @JsonProperty(value = "users")
    @Column(name = "user_id")
    private Integer userId;

    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @JsonBackReference(value = "projects")
    private Project project;

    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference(value = "users")
    private User user;
}
