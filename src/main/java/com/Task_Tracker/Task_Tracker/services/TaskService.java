package com.Task_Tracker.Task_Tracker.services;

import com.Task_Tracker.Task_Tracker.dto.TaskDto;
import org.bson.types.ObjectId;

import java.util.List;

public interface TaskService {

    TaskDto createTask(TaskDto taskDto);

    TaskDto getTaskById(ObjectId id);

    List<TaskDto> getAllTasks();

    TaskDto updateTask(ObjectId id, TaskDto taskDto);

    void deleteTask(ObjectId id);
}
