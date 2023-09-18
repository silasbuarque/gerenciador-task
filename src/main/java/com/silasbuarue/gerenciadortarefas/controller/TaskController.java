package com.silasbuarue.gerenciadortarefas.controller;

import com.silasbuarue.gerenciadortarefas.model.entities.Task;
import com.silasbuarue.gerenciadortarefas.model.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("task/save")
    public ResponseEntity<Void> saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @DeleteMapping("task/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        return taskService.deleteTask(id);
    }

    @GetMapping("task/find-all")
    public List<Task> findAll(){
        return taskService.findAll();
    }

    @GetMapping("task/find-all/{id}")
    public Optional<Task> findById(@PathVariable Long id){
        return taskService.findById(id);
    }


}
