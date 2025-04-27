package com.Task_Tracker.Task_Tracker.mapper;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.dto.TaskDto;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper{

    @Override
    public Task fromDto(TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.id());
        task.setTitle(taskDto.title());
        task.setDescription(taskDto.description());
        task.setStatus(taskDto.status());
        task.setCreated(taskDto.created());
        task.setUpdated(taskDto.updated());

        return task;
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getCreated(),
                task.getUpdated()
        );
    }
}
