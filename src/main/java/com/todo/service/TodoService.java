package com.todo.service;

import com.todo.model.Todo;

import java.util.List;

public interface TodoService {
    Todo createTodo(String title, String description);
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo updateTodo(Long id, String title, String description, boolean done);
    void deleteTodo(Long id);
    List<Todo> getTodoByCompleted(boolean done);


}
