package com.Capgemini.spring.boot.Assignment1.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/course")
public class CourseController {

        @Autowired
        private CourseRepository courseRepository;

        @GetMapping
        public List<Course> getCourses () {
            return courseRepository.findAll();


        }
        @PostMapping
        public void addCourse(@RequestBody Course course) {
            courseRepository.save(course);

        }
    }

