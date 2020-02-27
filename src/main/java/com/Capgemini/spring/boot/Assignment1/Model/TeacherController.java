package com.Capgemini.spring.boot.Assignment1.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getTeachers () {
        return teacherRepository.findAll();


    }
        @PostMapping
        public void addTeacher(@RequestBody Teacher teacher) {
            teacherRepository.save(teacher);

    }
}
