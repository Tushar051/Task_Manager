package com.Task_Tracker.Task_Tracker.domain.dto;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskPriority;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime created,
        TaskPriority priority,
        TaskStatus status
) {
}
