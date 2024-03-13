package org.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final UserService userService;

    @PostMapping("/user")
    public void signUp(
            @RequestParam("user-id") String userId,
            @RequestParam("password") String password
    ){
        userService.SignUp(userId, password);
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("user-id") String userId,
            @RequestParam("password") String password
    ){
        return userService.login(userId, password);


    }
    @GetMapping("/hello")
    public String get(){
        return "world!";
    }

    @GetMapping("/{message}")
    public String path(@PathVariable String message) {
        return message +"화이팅";
    }
}
