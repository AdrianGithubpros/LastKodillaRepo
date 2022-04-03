package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {




    @GetMapping
    public List<Task> getTasks(){

        List<Task> list = new ArrayList<>();
        return  list;
    }
    @GetMapping
    public TaskDto getTask(Long taskId){

        return new TaskDto(taskId, "", "");
    }
    @DeleteMapping
    public void deleteTask(Long taskId){

    }
    @PutMapping
    public TaskDto updateTask(TaskDto taskDto){

        return taskDto;
    }
    @PostMapping
    public void createTask(TaskDto taskDto){

    }

}
