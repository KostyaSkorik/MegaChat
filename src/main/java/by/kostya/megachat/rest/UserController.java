package by.kostya.megachat.rest;


import by.kostya.megachat.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        List<User> users = new ArrayList<>();

        users.add(new User(1L,"Stepa","cool guy"));
        users.add(new User(2L,"Stepa","cool guy"));
        users.add(new User(3L,"Stepa","cool guy"));

        return ResponseEntity.ok().body(users);
    }
}
