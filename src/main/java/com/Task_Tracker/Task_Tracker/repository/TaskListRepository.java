package com.Task_Tracker.Task_Tracker.repository;

import com.Task_Tracker.Task_Tracker.domain.entities.TaskList;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskListRepository extends MongoRepository<TaskList, String> {

}
