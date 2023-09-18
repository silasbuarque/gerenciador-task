package com.silasbuarue.gerenciadortarefas.repository;

import com.silasbuarue.gerenciadortarefas.model.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
