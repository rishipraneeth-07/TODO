package com.todo.controller;

import com.todo.model.Todo;
import com.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(
                todo.getTitle(),
                todo.getDescription()
        );
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id,
                           @RequestBody Todo todo) {
        return todoService.updateTodo(
                id,
                todo.getTitle(),
                todo.getDescription(),
                todo.isDone()
        );
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    @GetMapping("/status")
    public List<Todo> getTodosByStatus(@RequestParam boolean done) {
        return todoService.getTodoByCompleted(done);
    }
}
