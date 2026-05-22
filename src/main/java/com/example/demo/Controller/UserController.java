package com.example.demo.Controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserService userService;
    UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping ("/user/{id}")
    public User retornaUsuarioPorId(@PathVariable int id) {
       return userService.buscarPorId(id);
    }

    @PostMapping("/adduser")
    public User adicionaUsuario(@RequestBody User userTarget){
        return userRepository.save(userTarget);

    }
}

