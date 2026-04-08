package com.example.demo_jenkins.service;

import com.example.demo_jenkins.entity.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class StudentService {

    private final List<Student> students = List.of(
            new Student(1,"Amr",40,"Cairo"),
            new Student(2,"Alaa",38,"Tanta"),
            new Student(3,"Eslam",40,"Tanta"));

    public Student getById(int id) {
        Student student = null;
        for(Student s : students){
            if(s.getId() == id)
                student = s;
            break;
        }
        assert student != null;
        log.info("Student >>>>>>>>>>>>> {}", student.getId());
        return student;
    }

    public List<Student> getAll() {
        List<Integer> list = students.stream().map(s -> s.getId()).toList();
        log.info("Students >>>>>>>>>>>>> {}", list);
        return students;
    }
}
