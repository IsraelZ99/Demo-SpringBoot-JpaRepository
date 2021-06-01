package com.demo.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Data acces para conectar a la Base de datos
public interface StudentRepository extends JpaRepository<Student, Long> { //Long porque en el modelo el Id es de ese tipo de dato

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
        /* Student = se refiere a la clase Student la cual esta apuntando a la tabla student*/
    Optional<Student> findStudentByEmail(String email);

}
