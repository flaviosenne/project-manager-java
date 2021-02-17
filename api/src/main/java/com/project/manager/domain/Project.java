package com.project.manager.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    private Date dateStart;

    @JsonProperty(value = "dateEnd")
    @Column(name = "date_end")
    private Date dateEnd;

    @JsonProperty(value = "status")
    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonProperty(value = "users")
    @JsonManagedReference(value = "users")
    private List<User> users;
}
