package com.example.todolist.user.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist.user.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
 
}
