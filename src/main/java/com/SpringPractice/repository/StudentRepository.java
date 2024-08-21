package com.SpringPractice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.SpringPractice.model.Student;

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }

    public void updateStudent(Student student) {
        getStudentById(student.getId()).ifPresent(existingStudent -> {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            existingStudent.setEmail(student.getEmail());
        });
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}

