package com.Task_Tracker.Task_Tracker.dto;

import org.bson.types.ObjectId;

import java.time.LocalDateTime;

public record TaskDto(
        ObjectId id,
        String title,
        String description,
        com.Task_Tracker.Task_Tracker.domain.entities.TaskStatus status,
        LocalDateTime created,
        LocalDateTime updated
) {
}
