package com.silasbuarue.gerenciadortarefas.model.service;

import com.silasbuarue.gerenciadortarefas.model.entities.Task;
import com.silasbuarue.gerenciadortarefas.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public void saveTask(Task task){
        taskRepository.save(task);
    }

}
