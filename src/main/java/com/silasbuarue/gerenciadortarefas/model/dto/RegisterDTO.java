package com.silasbuarue.gerenciadortarefas.model.dto;

import com.silasbuarue.gerenciadortarefas.model.enuns.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
