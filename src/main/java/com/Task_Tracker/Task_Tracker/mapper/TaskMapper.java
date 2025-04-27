package com.Task_Tracker.Task_Tracker.mapper;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.dto.TaskDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
