package com.Spring.First_Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
