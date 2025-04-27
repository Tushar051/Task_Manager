package com.Task_Tracker.Task_Tracker.controller;

import com.Task_Tracker.Task_Tracker.dto.TaskListDto;
import com.Task_Tracker.Task_Tracker.services.TaskListService;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/task-list")
@Slf4j
public class TaskListController {

    @Autowired
    private TaskListService taskListService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<TaskListDto> allTaskLists = taskListService.getAllTaskLists();
        if (allTaskLists != null){
            return new ResponseEntity<>(allTaskLists, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/id/{taskId}")
    public ResponseEntity<?> getTaskById(@PathVariable("taskId") String id){
        try{
            TaskListDto taskListById = taskListService.getTaskListById(new ObjectId (id));
            if (taskListById != null){
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }catch (Exception ignored){
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping("create-task")
    public ResponseEntity<?> createTask(@RequestBody TaskListDto taskList){
        try{
            TaskListDto taskList1 = taskListService.createTaskList(taskList);
            return new ResponseEntity<>(taskList1, HttpStatus.CREATED);
        }catch (Exception e){

        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


    @DeleteMapping("/id/{taskId}")
    public ResponseEntity<?> deleteById(@PathVariable("taskId") String id ){
        taskListService.deleteTaskList(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
