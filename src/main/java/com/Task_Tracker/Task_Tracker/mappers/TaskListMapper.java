package com.Task_Tracker.Task_Tracker.mappers;

import com.Task_Tracker.Task_Tracker.domain.dto.TaskListDto;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
