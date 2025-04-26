package com.Task_Tracker.Task_Tracker.dto;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

public record TaskListDto(
        ObjectId id,
        String title,
        String description,
        Integer count,
        Double progress,
        List<TaskDto> taskLists
)

 {
}
