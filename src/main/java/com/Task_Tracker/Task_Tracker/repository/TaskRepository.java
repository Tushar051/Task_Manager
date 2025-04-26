package com.Task_Tracker.Task_Tracker.repository;

import com.Task_Tracker.Task_Tracker.domain.entities.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, ObjectId> {

}
