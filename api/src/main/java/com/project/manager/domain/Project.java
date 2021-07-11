package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "projects")
public class Project {
    @JsonProperty(value = "id")
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @JsonProperty(value = "title")
    @Column(name = "title")
    private String title;


    @JsonProperty(value = "description")
    @Column(name = "description")
    private String description;

    @JsonProperty(value = "userLead")
    @Column(name = "user_lead")
    private Integer userLead;

    @JsonProperty(value = "dateStart")
    @Column(name = "date_start")
    private LocalDate dateStart;
    
    @JsonProperty(value = "dateEnd")
    @Column(name = "date_end")
    private LocalDate dateEnd;

    @JsonProperty(value = "status")
    @Column(name = "status")
    private String status;
  
}
