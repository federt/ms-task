package com.task.ms_task.services;

import com.task.ms_task.dtos.TaskDto;
import java.util.List;

public interface TaskService {
    TaskDto addTask(TaskDto taskDto);
    TaskDto updateTask(TaskDto taskDto);
    TaskDto getTask(Long id);
    void deleteTask(Long id);
    List<TaskDto> getTasks();
}
