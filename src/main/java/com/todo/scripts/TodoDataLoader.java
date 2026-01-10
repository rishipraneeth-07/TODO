package com.todo.scripts;

import com.todo.service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoDataLoader implements CommandLineRunner {
    private TodoService todoService;
    public TodoDataLoader(TodoService todoService) {
        this.todoService = todoService;
    }

    @Override
    public void run(String... args) throws Exception {
        todoService.createTodo("Creating Todo using Spring", "Understand controllers and services");
        todoService.createTodo("Learn JPA", "Understand entities and repositories");
        todoService.createTodo("Build Todo App", "Complete backend project");

    }
}
