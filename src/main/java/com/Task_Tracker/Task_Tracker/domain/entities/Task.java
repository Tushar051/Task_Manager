package com.Task_Tracker.Task_Tracker.domain.entities;

import jakarta.annotation.Nonnull;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDateTime;

@Collation
@Document(collection = "tasks")
public class Task {

    @Id
    @Field(targetType = FieldType.OBJECT_ID)
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

    @Nonnull
    public ObjectId getId() {
        return id;
    }

    public void setId(@Nonnull ObjectId id) {
        this.id = id;
    }

    @Nonnull
    public String getTitle() {
        return title;
    }

    public void setTitle(@Nonnull String title) {
        this.title = title;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nonnull String description) {
        this.description = description;
    }

    @Nonnull
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(@Nonnull LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Nonnull
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(@Nonnull TaskStatus status) {
        this.status = status;
    }

    @Nonnull
    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(@Nonnull TaskPriority priority) {
        this.priority = priority;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    @Nonnull
    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(@Nonnull LocalDateTime created) {
        this.created = created;
    }

    @Nonnull
    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(@Nonnull LocalDateTime updated) {
        this.updated = updated;
    }

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

    public Task(){
    }
}
