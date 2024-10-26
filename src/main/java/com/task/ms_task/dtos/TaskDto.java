package com.task.ms_task.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String deadline;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;
}
