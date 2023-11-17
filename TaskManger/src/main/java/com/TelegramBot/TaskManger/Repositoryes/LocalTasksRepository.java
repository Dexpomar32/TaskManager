package com.TelegramBot.TaskManger.Repositoryes;

import com.TelegramBot.TaskManger.Models.LocalTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalTasksRepository extends JpaRepository<LocalTasks, Integer> {}