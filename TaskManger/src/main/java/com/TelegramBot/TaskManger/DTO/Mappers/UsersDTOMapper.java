package com.TelegramBot.TaskManger.DTO.Mappers;

import com.TelegramBot.TaskManger.DTO.Records.UsersDTO;
import com.TelegramBot.TaskManger.Models.Users;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UsersDTOMapper implements Function<Users, UsersDTO> {
    @Override
    public UsersDTO apply(Users users) {
        return new UsersDTO(
                users.getName(),
                users.getSurname(),
                users.getRole(),
                users.getFunction()
        );
    }
}