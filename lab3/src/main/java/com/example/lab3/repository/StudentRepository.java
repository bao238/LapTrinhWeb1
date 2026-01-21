package com.example.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab3.model.Student;

public interface StudentRepository
        extends JpaRepository<Student, Integer> {
}
