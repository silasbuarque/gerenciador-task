package com.silasbuarue.gerenciadortarefas.controller;

import com.silasbuarue.gerenciadortarefas.model.entities.Task;
import com.silasbuarue.gerenciadortarefas.model.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/save")
    public void saveTask(@RequestBody Task task){
        taskService.saveTask(task);
    }

}
