package com.example.practice.controller;

import com.example.practice.model.Student;
import com.example.practice.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
        return ResponseEntity.ok(service.createStudent(student));
    }
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(service.getAllStudents());
    }
    @GetMapping("/search")
    public ResponseEntity<List<Student>> searchStudents(@RequestParam String keyword) {
        return ResponseEntity.ok(service.searchStudent(keyword));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        return service.getStudentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id, @Valid @RequestBody Student student) {
        return ResponseEntity.ok(service.updateStudent(id, student));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
