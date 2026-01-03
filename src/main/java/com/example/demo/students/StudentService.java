package com.example.demo.students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
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
