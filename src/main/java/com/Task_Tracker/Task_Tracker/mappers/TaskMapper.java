package com.Task_Tracker.Task_Tracker.mappers;

import com.Task_Tracker.Task_Tracker.domain.dto.TaskDto;
import com.Task_Tracker.Task_Tracker.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
