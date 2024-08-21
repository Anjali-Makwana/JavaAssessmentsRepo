package com.SpringPractice.controller;

import java.util.Optional;

import com.SpringPractice.model.Student;
import com.SpringPractice.model.StudentView;
import com.SpringPractice.service.StudentService;

public class StudentController {
    private final StudentService service;
    private final StudentView view;

    public StudentController(StudentService service, StudentView view) {
        this.service = service;
        this.view = view;
    }

    public void start() {
        boolean running = true;
        while (running) {
            view.showMenu();
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1 -> createStudent();
                case 2 -> viewAllStudents();
                case 3 -> viewStudentById();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> running = false;
                default -> view.showInvalidOption();
            }
        }
    }

    private void createStudent() {
        Student student = view.getNewStudentDetails();
        service.createStudent(student);
        view.showSuccess("Student created successfully!");
    }

    private void viewAllStudents() {
        view.displayStudents(service.getAllStudents());
    }

    private void viewStudentById() {
        int id = view.getStudentId();
        Optional<Student> student = service.findStudentById(id);
        student.ifPresentOrElse(
            view::displayStudentDetails,
            () -> view.showError("Student not found!")
        );
    }

    private void updateStudent() {
        int id = view.getStudentId();
        Optional<Student> student = service.findStudentById(id);
        if (student.isPresent()) {
            Student updatedStudent = view.getUpdatedStudentDetails(student.get());
            service.updateStudent(updatedStudent);
            view.showSuccess("Student updated successfully!");
        } else {
            view.showError("Student not found!");
        }
    }

    private void deleteStudent() {
        int id = view.getStudentId();
        service.deleteStudent(id);
		view.showSuccess("Student deleted successfully!");
	}
}
