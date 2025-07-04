package by.kostya.megachat.service;


import by.kostya.megachat.db.repository.UserRepository;
import by.kostya.megachat.dto.UserReadDto;
import by.kostya.megachat.mapper.UserReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserReadMapper userReadMapper;

    public List<UserReadDto> findAll(){
        return userRepository.findAll().stream().map(userReadMapper::toDTO).toList();
    }
}
