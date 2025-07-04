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

        users.add(new User(1L,"Stepa","Loh"));
        users.add(new User(2L,"Stepa","Loh"));
        users.add(new User(3L,"Stepa","Loh"));

        return ResponseEntity.ok().body(users);
    }
}
