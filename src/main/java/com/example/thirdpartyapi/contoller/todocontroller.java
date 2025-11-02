package com.example.thirdpartyapi.contoller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.thirdpartyapi.model.Todo;
import com.example.thirdpartyapi.service.todoservice;

@RestController

public class todocontroller {
	
	@Autowired
	todoservice todoservice;
	
	@GetMapping("/a")
	public void abc() {
		RestTemplate restTemplate = new RestTemplate();
		Todo[] todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", Todo[].class);
		todoservice.insertdata(Arrays.asList(todo));
	}

}
