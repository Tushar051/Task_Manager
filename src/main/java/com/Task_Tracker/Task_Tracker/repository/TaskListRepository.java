package com.Task_Tracker.Task_Tracker.repository;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskListRepository extends MongoRepository<TaskList, ObjectId> {
}