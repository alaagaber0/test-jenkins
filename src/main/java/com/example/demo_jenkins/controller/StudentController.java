package com.example.demo_jenkins.controller;

import com.example.demo_jenkins.entity.Student;
import com.example.demo_jenkins.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getById/{id}")
    public ResponseEntity<Student> getById(@PathVariable int id){
        Student student = studentService.getById(id);
        return ResponseEntity.ok().body(student);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> students = studentService.getAll();
        return ResponseEntity.ok().body(students);
    }
    

}
