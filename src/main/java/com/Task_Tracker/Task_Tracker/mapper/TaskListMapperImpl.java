package com.Task_Tracker.Task_Tracker.mapper;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskStatus;
import com.Task_Tracker.Task_Tracker.dto.TaskListDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class TaskListMapperImpl implements TaskListMapper{

    private final TaskMapper taskMapper;

    public TaskListMapperImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }


    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        TaskList taskList = new TaskList();
        taskList.setId(taskListDto.id());
        taskList.setTitle(taskListDto.title());
        taskList.setDescription(taskListDto.description());

        if (taskListDto.taskLists() != null) {
            List<Task> tasks = taskListDto.taskLists()
                    .stream()
                    .map(taskMapper::fromDto)
                    .toList();
            taskList.setTasks(tasks);
        } else {
            taskList.setTasks(List.of()); // empty list
        }

        taskList.setCreated(LocalDateTime.now());
        taskList.setUpdated(LocalDateTime.now());
        return taskList;
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {

        return new TaskListDto(
                taskList.getId(),
                taskList.getTitle(),
                taskList.getDescription(),

                taskList.getTasks() != null ? taskList.getTasks().size() : 0,
                calculateTaskListProgress(taskList.getTasks()),
                taskList.getTasks() != null ?
                        taskList.getTasks().stream()
                                .map(taskMapper::toDto)
                                .toList()
                        : null
        );
    }

    private Double calculateTaskListProgress(List<Task> tasks) {
        if (tasks == null || tasks.isEmpty()) {
            return 0.0;
        }

        long closedTasks = tasks.stream()
                .filter(task -> task.getStatus() == TaskStatus.CLOSED)
                .count();

        return (double) closedTasks / tasks.size();
    }
}

