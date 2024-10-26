package com.task.ms_task.mapper;

import com.task.ms_task.dtos.TaskDto;
import com.task.ms_task.entities.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);
    Task toTask(TaskDto taskDto);
}
