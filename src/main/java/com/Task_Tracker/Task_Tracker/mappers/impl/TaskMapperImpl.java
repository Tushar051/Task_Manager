package com.Task_Tracker.Task_Tracker.mappers.impl;

import com.Task_Tracker.Task_Tracker.domain.dto.TaskDto;
import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {


    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getCreated(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
