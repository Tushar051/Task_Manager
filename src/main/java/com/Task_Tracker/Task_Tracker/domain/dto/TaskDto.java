package com.Task_Tracker.Task_Tracker.domain.dto;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskPriority;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskStatus;
import org.bson.types.ObjectId;
import java.time.LocalDateTime;


public record TaskDto(
        ObjectId id,
        String title,
        String description,
        LocalDateTime dueDate,
        LocalDateTime created,
        TaskPriority priority,
        TaskStatus status
) {

}
