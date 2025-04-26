package com.Task_Tracker.Task_Tracker.repository;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends MongoRepository<Task, ObjectId> {

    List<Task> findByTaskListId (ObjectId taskListId);
    Optional<Task> findByTaskListIdAndId(UUID taskListId, ObjectId id); //it will look for single task where taskListId and Id match

}
