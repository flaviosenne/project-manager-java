package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @JsonProperty("id")
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonProperty("name")
    @Column(name = "name")
    private String name;

    @JsonProperty("email")
    @Column(name = "email")
    private String email;

}
