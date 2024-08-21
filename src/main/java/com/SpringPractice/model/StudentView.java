package com.SpringPractice.model;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. View Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
    }

    public int getMenuChoice() {
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Student getNewStudentDetails() {
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        return new Student(id, name, age, email);
    }

    public int getStudentId() {
        System.out.print("Enter Student ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Student getUpdatedStudentDetails(Student existingStudent) {
        System.out.println("Editing Student: " + existingStudent);
        System.out.print("Enter new name (" + existingStudent.getName() + "): ");
        String name = scanner.nextLine();
        System.out.print("Enter new age (" + existingStudent.getAge() + "): ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new email (" + existingStudent.getEmail() + "): ");
        String email = scanner.nextLine();
        existingStudent.setName(name);
        existingStudent.setAge(age);
        existingStudent.setEmail(email);
        return existingStudent;
    }

    public void displayStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.forEach(System.out::println);
        }
    }

    public void displayStudentDetails(Student student) {
        System.out.println(student);
    }

    public void showSuccess(String message) {
        System.out.println(message);
    }

    public void showError(String message) {
        System.out.println(message);
    }

    public void showInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }
}

