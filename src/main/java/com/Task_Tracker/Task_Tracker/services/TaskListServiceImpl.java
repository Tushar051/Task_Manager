package com.Task_Tracker.Task_Tracker.services;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import com.Task_Tracker.Task_Tracker.dto.TaskListDto;
import com.Task_Tracker.Task_Tracker.mapper.TaskListMapper;
import com.Task_Tracker.Task_Tracker.repository.TaskListRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskListServiceImpl {

    private final TaskListRepository taskListRepository;
    private TaskListMapper taskListMapper;

    @Autowired
    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }




    public TaskListDto createTaskList(TaskListDto taskListDto){
        TaskList taskList = taskListMapper.fromDto(taskListDto);
        TaskList savedTaskList = taskListRepository.save(taskList);
        return taskListMapper.toDto(savedTaskList);
    }

    public TaskListDto getTaskListById(ObjectId id) {
        TaskList taskList = taskListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaskList not found with id: " + id));
        return taskListMapper.toDto(taskList);
    }


    public List<TaskListDto> getAllTaskLists() {
        return taskListRepository.findAll()
                .stream()
                .map(taskListMapper::toDto)
                .collect(Collectors.toList());
    }


    public TaskListDto updateTaskList(ObjectId id, TaskListDto taskListDto) {
        TaskList existingTaskList = taskListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaskList not found with id: " + id));

        existingTaskList.setTitle(taskListDto.title());
        existingTaskList.setDescription(taskListDto.description());
        // You can update tasks too if needed

        TaskList updatedTaskList = taskListRepository.save(existingTaskList);
        return taskListMapper.toDto(updatedTaskList);
    }


    public void deleteTaskList(ObjectId id) {
        taskListRepository.deleteById(id);
    }

}
