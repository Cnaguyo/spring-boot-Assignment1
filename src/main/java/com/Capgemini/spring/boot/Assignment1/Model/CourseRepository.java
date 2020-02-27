package com.Capgemini.spring.boot.Assignment1.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
