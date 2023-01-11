package com.demo.redis.controller;

import com.demo.redis.model.Student;
import com.demo.redis.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo repo;
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return repo.save(student);
    }

    @GetMapping("/students")
    public Iterable<Student> gellAll(){
        return repo.findAll();
    }

}
