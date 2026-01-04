package com.example.demo.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student pradeep =new Student(
                    "Pradeep",
                    "pradeep.mala@gmail.com",
                    LocalDate.of(2000, MAY, 20)
            );

            Student maanazhy =new Student(
                    "Maanazhytha",
                    "maanazhy.vanaja@gmail.com",
                    LocalDate.of(2000, AUGUST, 24)
            );
            repository.saveAll(
                    List.of(pradeep,maanazhy)
            );
        };
    }
}



