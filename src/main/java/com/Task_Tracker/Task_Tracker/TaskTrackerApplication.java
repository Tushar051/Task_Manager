package com.Task_Tracker.Task_Tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.Task_Tracker.Task_Tracker.repository")
@ComponentScan(basePackages = {"com.Task_Tracker.Task_Tracker.mapper"})
@ComponentScan(basePackages = "com.Task_Tracker.Task_Tracker.controller")
@SpringBootApplication
public class TaskTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskTrackerApplication.class, args);
	}

}
