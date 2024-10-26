package com.task.ms_task.services;

import com.task.ms_task.dtos.TaskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TaskServiceImp implements TaskService {
    @Override
    public TaskDto addTask(TaskDto taskDto) {
        return null;
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto) {
        return null;
    }

    @Override
    public TaskDto getTask(Long id) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public List<TaskDto> getTasks() {
        return null;
    }

}
