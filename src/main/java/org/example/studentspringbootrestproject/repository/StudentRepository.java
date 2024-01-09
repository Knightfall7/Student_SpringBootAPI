package org.example.studentspringbootrestproject.repository;

import org.example.studentspringbootrestproject.entitty.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
