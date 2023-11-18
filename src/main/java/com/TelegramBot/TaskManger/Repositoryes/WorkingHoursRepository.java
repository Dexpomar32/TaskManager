package com.TelegramBot.TaskManger.Repositoryes;

import com.TelegramBot.TaskManger.Models.WorkingHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingHoursRepository extends JpaRepository<WorkingHours, Integer> {}