package com.TelegramBot.TaskManger.Services;

import com.TelegramBot.TaskManger.DTO.Mappers.UsersDTOMapper;
import com.TelegramBot.TaskManger.DTO.Records.UsersDTO;
import com.TelegramBot.TaskManger.Repositoryes.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {
    private final UsersRepository usersRepository;
    private final UsersDTOMapper usersDTOMapper;

    @Autowired
    public UsersService(UsersRepository usersRepository, UsersDTOMapper usersDTOMapper) {
        this.usersRepository = usersRepository;
        this.usersDTOMapper = usersDTOMapper;
    }

    public List<UsersDTO> getAllUsers() {
        return usersRepository.findAll()
                .stream()
                .map(usersDTOMapper)
                .collect(Collectors.toList());
    }
}
