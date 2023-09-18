package com.silasbuarue.gerenciadortarefas.repository;

import com.silasbuarue.gerenciadortarefas.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
