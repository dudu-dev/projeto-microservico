package com.example.task_service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController{

    private List<Task> tasks;

    @GetMapping("/")
    public List<Task> getTask(){
        return tasks;
    }

    @PostMapping("/")
    public Task createTask(@RequestBody Task task){
        tasks.add(task);
        return task;
    }
}