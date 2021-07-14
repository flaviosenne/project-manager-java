package com.project.manager.exceptions;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class ExceptionDetails {
    private String message;
    private String title;
    private int status;
    private long timestamp;
}
