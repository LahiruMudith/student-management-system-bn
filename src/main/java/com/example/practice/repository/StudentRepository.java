package com.example.practice.repository;

import com.example.practice.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
}