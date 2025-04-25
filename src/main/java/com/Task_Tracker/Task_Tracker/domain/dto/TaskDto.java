package com.Task_Tracker.Task_Tracker.domain.dto;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskPriority;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        LocalDateTime created,
        TaskPriority priority,
        TaskStatus status
) {

}
