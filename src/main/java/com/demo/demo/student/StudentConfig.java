package com.demo.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student israel = new Student("Israel", "israel@hotmail.com", LocalDate.of(1999, 10, 23));
            Student monse = new Student("Monse", "monse@hotmail.com", LocalDate.of(1999, 06, 13));

            repository.saveAll(
                    List.of(israel, monse)
            );
        };
    }

}
