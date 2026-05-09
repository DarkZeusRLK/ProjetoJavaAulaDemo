package com.example.demo.service;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
    List<User> lista =  new ArrayList<>();

    public UserService(){
        this.lista.add(new User(1, "Matheus", "matheus@gmail.com", "114.999.888-00"));
        this.lista.add(new User(2, "José", "josé@gmail.com", "114.999.888-00"));
        this.lista.add(new User(3, "Maria", "maria@gmail.com", "114.129.998-00"));
        this.lista.add(new User(4, "Luiz", "luiz@gmail.com", "114.459.771-00"));
    }
    public User buscarPorId(int id){
      for (int i = 0; i <= lista.size(); i++){
          if(this.lista.get(i).getId() == id){
              return this.lista.get(i);
          }
      }
      return null;
    }

}
