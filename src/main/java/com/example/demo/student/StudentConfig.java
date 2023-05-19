package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{

            Student mary = new Student(
                            "Mary",
                            "mary@gmail.com",
                            LocalDate.of(2000, Month.APRIL, 6)
            );

            Student gideon = new Student(
                    "Gideon",
                    "gideon@gmail.com",
                    LocalDate.of(2005, Month.MAY, 6)
            );

            studentRepository.saveAll(List.of(mary, gideon));

        };
    }
}
