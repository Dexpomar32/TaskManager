package com.TelegramBot.TaskManger.Controllers;

import com.TelegramBot.TaskManger.Models.Users;
import com.TelegramBot.TaskManger.Services.UsersService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UsersController {
    private UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostConstruct
    public void displayUsersInConsole() {
//        System.out.println(usersService.getAllUsers());
    }
}
