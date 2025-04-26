package com.Task_Tracker.Task_Tracker.repository;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, UUID> {

}
