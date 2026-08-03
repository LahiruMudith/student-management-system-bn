package com.example.practice.service;

import com.example.practice.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student createStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(String id);
    public List<Student> searchStudent(String keyword);
    public Student updateStudent(String id, Student student);
    public void deleteStudent(String id);
}
