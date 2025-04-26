package com.Task_Tracker.Task_Tracker.services;


import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.dto.TaskDto;
import com.Task_Tracker.Task_Tracker.mapper.TaskMapper;
import com.Task_Tracker.Task_Tracker.repository.TaskRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    public TaskDto createTask(TaskDto taskDto){
        Task task = taskMapper.fromDto(taskDto);
        Task savedTask = taskRepository.save(task);
        return taskMapper.toDto(savedTask);
    }

    public TaskDto getTaskById(ObjectId id){
        List<Task> task = taskRepository.findAllById(Collections.singleton(id));
        return taskMapper.toDto((Task) task);
    }


    public List<TaskDto> getAllTask(){
        return taskRepository.findAll()
                .stream()
                .map(taskMapper::toDto)
                .collect(Collectors.toList());
    }


    public TaskDto updateTask(ObjectId id, TaskDto taskDto) {
        Task existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));

        existingTask.setTitle(taskDto.title());
        existingTask.setDescription(taskDto.description());
        existingTask.setStatus(taskDto.status());
        // Update other fields if needed

        Task updatedTask = taskRepository.save(existingTask);
        return taskMapper.toDto(updatedTask);
    }

    public void deleteTask(ObjectId id){
        taskRepository.deleteById(id);
    }
}
