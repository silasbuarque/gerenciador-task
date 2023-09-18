package com.silasbuarue.gerenciadortarefas.controller;

import com.silasbuarue.gerenciadortarefas.model.entities.Task;
import com.silasbuarue.gerenciadortarefas.model.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save")
    public ResponseEntity<Void> saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        return taskService.deleteTask(id);
    }

}
