package com.Task_Tracker.Task_Tracker.mapper;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import com.Task_Tracker.Task_Tracker.dto.TaskListDto;
import org.springframework.stereotype.Component;

@Component
public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
