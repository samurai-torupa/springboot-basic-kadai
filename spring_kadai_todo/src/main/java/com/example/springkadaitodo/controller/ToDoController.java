package com.example.springkadaitodo.controller;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ToDoController {

    private final ToDoService todoService;

    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public String showTodoList(Model model) {

        List<ToDo> todoList = todoService.findAll();

        model.addAttribute("todoList", todoList);

        return "todoView";
    }
}