package com.example.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab3.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentViewController {

    private final StudentService service;

    public StudentViewController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public String showStudents(Model model) {
        model.addAttribute("students", service.getAll());
        return "students";
    }
}
