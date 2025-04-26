package com.Task_Tracker.Task_Tracker.services;

import com.Task_Tracker.Task_Tracker.dto.TaskListDto;
import org.bson.types.ObjectId;

import java.util.List;


public interface TaskListService {

    TaskListDto createTaskList(TaskListDto taskListDto);

    TaskListDto getTaskListById(ObjectId id);

    List<TaskListDto> getAllTaskLists();

    TaskListDto updateTaskList(ObjectId id, TaskListDto taskListDto);

    void deleteTaskList(String id);




}
