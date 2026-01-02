package com.example.demo.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
class StudentController {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Pradeep",
                        "pradeep.mala@gmail.com",
                        LocalDate.of(2000, Month.MAY,20),
                        24
                )
        );
    }
}
