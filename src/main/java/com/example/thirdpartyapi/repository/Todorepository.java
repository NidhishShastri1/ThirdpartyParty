package com.example.thirdpartyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thirdpartyapi.model.Todo;

public interface Todorepository extends JpaRepository<Todo, Integer> {

}
