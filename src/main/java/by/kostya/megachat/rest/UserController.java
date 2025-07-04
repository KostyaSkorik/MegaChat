package by.kostya.megachat.rest;


import by.kostya.megachat.db.entity.User;
import by.kostya.megachat.db.repository.UserRepository;
import by.kostya.megachat.dto.UserReadDto;
import by.kostya.megachat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserReadDto>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }
}
