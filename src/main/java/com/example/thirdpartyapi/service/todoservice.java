package com.example.thirdpartyapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thirdpartyapi.model.Todo;
import com.example.thirdpartyapi.repository.Todorepository;

@Service
public class todoservice {
	
//	@Autowired
//	Todo todo;
	
	@Autowired
	Todorepository todorepository;
	
	public void insertdata(List<Todo> l1) {
		/*ArrayList<Todo> list1 = new ArrayList<Todo>();
		for(Todo a : list) {
//			Todo todo = new Todo();
//			todo.setId(a.getId());
//			todo.setUserId(a.getUserId());
//			todo.setTitle(a.getTitle());
//			todo.setCompleted(a.isCompleted());
//			list1.add(todo);
//			todorepository.save(a);*/
		todorepository.saveAll(l1);
		}
		
		
	}


