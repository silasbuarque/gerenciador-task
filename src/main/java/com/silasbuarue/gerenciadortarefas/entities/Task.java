package com.silasbuarue.gerenciadortarefas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="task")
public class Task {

    @Id
    private Long id;
    private String title;
    private String description;
    private Date date;
    private String status;


}
