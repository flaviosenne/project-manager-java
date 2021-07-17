package com.project.manager.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.manager.domain.Project;
import com.project.manager.domain.User;
import lombok.*;
import java.time.LocalDate;

@Builder
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
    @JsonProperty(value = "id")
    private Integer id;

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "dateStart")
    private LocalDate dateStart;

    @JsonProperty(value = "dateEnd")
    private LocalDate dateEnd;

    @JsonProperty(value = "status")
    private String status;

    public static Project fromDomain(ProjectDto projectDto, User user){
        return Project.builder()
                .id(projectDto.getId())
                .dateEnd(projectDto.getDateEnd())
                .dateStart(projectDto.getDateStart())
                .description(projectDto.getDescription())
                .status(projectDto.getStatus())
                .title(projectDto.getTitle())
                .user(user)
                .build();
    }

    public static ProjectDto fromDto(Project project){
        return ProjectDto.builder()
                .id(project.getId())
                .dateEnd(project.getDateEnd())
                .dateStart(project.getDateStart())
                .description(project.getDescription())
                .status(project.getStatus())
                .title(project.getTitle())
                .build();
    }
}
