package com.TelegramBot.TaskManger.Repositoryes;

import com.TelegramBot.TaskManger.Models.GlobalTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalTasksRepository extends JpaRepository<GlobalTasks, Integer> {}