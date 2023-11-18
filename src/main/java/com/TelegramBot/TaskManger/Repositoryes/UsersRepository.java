package com.TelegramBot.TaskManger.Repositoryes;

import com.TelegramBot.TaskManger.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {}