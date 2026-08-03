package com.example.practice.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    @NotBlank(message = "Student ID is required")
    private String studentId;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "Phone is required")
    private String phone;
    @NotBlank(message = "Course is required")
    private String course;
    @NotBlank(message = "Age is required")
    private String age;
    @NotBlank(message = "Gender is required")
    private String gender;

    private LocalDate registrationDate;
}