package com.silasbuarue.gerenciadortarefas.model.service;

import com.silasbuarue.gerenciadortarefas.model.entities.Task;
import com.silasbuarue.gerenciadortarefas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public ResponseEntity<Void> saveTask(Task task){
        taskRepository.save(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteTask(Long id) {
        if(!taskRepository.existsById(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        taskRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public List<Task> findAll() {
        List<Task> items = taskRepository.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK).getBody();
    }

    public Optional<Task> findById(Long id) {

        Optional<Task> returnTask = taskRepository.findById(id);

        return new ResponseEntity<>(returnTask, HttpStatus.OK).getBody();
    }
}
