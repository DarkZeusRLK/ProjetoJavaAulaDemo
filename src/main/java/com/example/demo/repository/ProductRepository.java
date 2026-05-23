package com.example.demo.repository;
import com.example.demo.entity.Produto;
import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Produto,Integer> {

}
