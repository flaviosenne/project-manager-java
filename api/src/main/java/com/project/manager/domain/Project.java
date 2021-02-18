package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "projects")
public class Project {
    @JsonProperty(value = "id")
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonProperty(value = "title")
    @Column(name = "title")
    private String title;

    @JsonProperty(value = "owner")
    @Column(name = "owner")
    Integer owner;

    @JsonProperty(value = "dateStart")
    @Column(name = "date_start")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate dateStart;
    
    @JsonProperty(value = "dateEnd")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    @Column(name = "date_end")
    private LocalDate dateEnd;

    @JsonProperty(value = "status")
    @Column(name = "status")
    private String status;

  
}
