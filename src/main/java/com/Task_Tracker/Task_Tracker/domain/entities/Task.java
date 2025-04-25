package com.Task_Tracker.Task_Tracker.domain.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //If id gets null, this will create manual id
    @Column(name = "id", updatable = false, nullable = false) //Column name, not allowed to update and non-nullable
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "status", nullable = false)
    private TaskStatus status;

    @Column(name = "priority", nullable = false)
    private TaskPriority priority;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_list_id") // foreign key
    private TaskList taskList; // matches from TaskList OneToMany

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "updated", nullable = false)
    private LocalDateTime updated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(dueDate, task.dueDate) && status == task.status && priority == task.priority && Objects.equals(created, task.created) && Objects.equals(updated, task.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, dueDate, status, priority, taskList, created, updated);
    }

}
