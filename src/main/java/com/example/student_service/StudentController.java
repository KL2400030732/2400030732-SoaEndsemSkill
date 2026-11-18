package com.example.student_service;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class StudentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/student")
    public String getStudent() {
        return "Student Service running on port: " + port;
    }
}