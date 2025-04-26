package com.Task_Tracker.Task_Tracker.domain.dto;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.UUID;


public record TaskListDto(
        String id,
        String title,
        String description,
        Integer count,
        Double progress,
        List<TaskDto> tasks
) {

}
