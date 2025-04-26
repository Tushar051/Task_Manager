package com.Task_Tracker.Task_Tracker.domain.entities;

import jakarta.annotation.Nonnull;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Collation
@Data
@Document(collection = "tasks")
public class Task {

    @Id
    @Nonnull
    private ObjectId id;

    @Nonnull
    private String title;

    @Nonnull
    private String description;

    @Nonnull
    private LocalDateTime dueDate;

    @Nonnull
    private TaskStatus status;

    @Nonnull
    private TaskPriority priority;


    private TaskList taskList;

    @Nonnull
    private LocalDateTime created;

    @Nonnull
    private LocalDateTime updated;

    public Task(@Nonnull ObjectId id, @Nonnull String title, @Nonnull String description, @Nonnull LocalDateTime dueDate, @Nonnull TaskStatus status, @Nonnull TaskPriority priority, TaskList taskList, @Nonnull LocalDateTime created, @Nonnull LocalDateTime updated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
        this.taskList = taskList;
        this.created = created;
        this.updated = updated;
    }
}
