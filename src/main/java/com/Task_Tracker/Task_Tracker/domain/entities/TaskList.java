package com.Task_Tracker.Task_Tracker.domain.entities;


import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Collation
@Document(collection = "task_lists")
public class TaskList {

    @Id
    private String id;

    @Nonnull
    private String title;

    @Nonnull
    private String description;

    @Nonnull
    private List<Task> tasks; // 👈 mapping by 'taskList' (the field name inside Task)

    @Nonnull
    private LocalDateTime created;

    @Nonnull
    private LocalDateTime updated;

    public TaskList(String id, @Nonnull String title, @Nonnull String description, @Nonnull List<Task> tasks, @Nonnull LocalDateTime created, @Nonnull LocalDateTime updated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.tasks = tasks;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(@Nonnull List<Task> tasks) {
        this.tasks = tasks;
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
}

