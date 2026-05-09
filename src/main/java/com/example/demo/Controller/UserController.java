package com.example.demo.Controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    UserService userService;

  public UserController(UserService userService){
      this.userService = userService;
  }
    @GetMapping ("/user/{id}")
    public User retornaUsuarioPorId(@PathVariable int id) {
       return userService.buscarPorId(id);
    }
}
