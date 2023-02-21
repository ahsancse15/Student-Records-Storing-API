package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Ehsan = new Student(
                    "Ehsan",
                    "ahsanul@gmail.com",
                    LocalDate.of(1999, MAY, 1)
            );

            Student Shawon = new Student(
                    "Shawon",
                    "haque@gmail.com",
                    LocalDate.of(2004, JANUARY, 10)
            );

            repository.saveAll(
                    List.of(Ehsan, Shawon)
            );
        };
    }
}
