package com.JavaAssessments.service;

import java.util.List;
import java.util.Optional;

import com.JavaAssessments.model.Student;
import com.JavaAssessments.repository.StudentRepository;

public class StudentService {
	
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void createStudent(Student student) {
        repository.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    public Optional<Student> findStudentById(int id) {
        return repository.getStudentById(id);
    }

    public void updateStudent(Student student) {
        repository.updateStudent(student);
    }

    public void deleteStudent(int id) {
        repository.deleteStudent(id);
    }
}
