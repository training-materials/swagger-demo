package com.example.swagger.repositories;

import com.example.swagger.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
