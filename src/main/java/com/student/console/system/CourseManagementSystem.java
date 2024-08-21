package com.student.console.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManagementSystem {
	
    private static List<Course> courseList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        while (true) {
        	
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    viewCourses();
                    break;
                case 3:
                    searchCourse();
                    break;
                case 4:
                    editCourse();
                    break;
                case 5:
                    deleteCourse();
                    break;
                case 6:
                    System.out.println("Exiting the system!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- Course Management System ---");
        System.out.println("1. Add Course");
        System.out.println("2. View Courses");
        System.out.println("3. Search Course");
        System.out.println("4. Edit Course");
        System.out.println("5. Delete Course");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addCourse() {
        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Course Fees: ");
        double courseFees = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Course Duration: ");
        String courseDuration = scanner.nextLine();
        System.out.print("Enter Course Detail: ");
        String courseDetail = scanner.nextLine();

        Course course = new Course(courseId, courseName, courseFees, courseDuration, courseDetail);
        courseList.add(course);
        System.out.println("Course added successfully.");
    }

    private static void viewCourses() {
        if (courseList.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course course : courseList) {
                System.out.println(course);
            }
        }
    }

    private static void searchCourse() {
        System.out.print("Enter Course ID to search: ");
        String courseId = scanner.nextLine();

        for (Course course : courseList) {
            if (course.getCourseId().equalsIgnoreCase(courseId)) {
                System.out.println(course);
                return;
            }
        }
        System.out.println("Course not found.");
    }

    private static void editCourse() {
        System.out.print("Enter Course ID to edit: ");
        String courseId = scanner.nextLine();

        for (Course course : courseList) {
            if (course.getCourseId().equalsIgnoreCase(courseId)) {
                System.out.print("Enter new Course Name: ");
                course.setCourseName(scanner.nextLine());
                System.out.print("Enter new Course Fees: ");
                course.setCourseFees(scanner.nextDouble());
                scanner.nextLine();
                System.out.print("Enter new Course Duration: ");
                course.setCourseDuration(scanner.nextLine());
                System.out.print("Enter new Course Detail: ");
                course.setCourseDetail(scanner.nextLine());

                System.out.println("Course updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    private static void deleteCourse() {
        System.out.print("Enter Course ID to delete: ");
        String courseId = scanner.nextLine();

        for (Course course : courseList) {
            if (course.getCourseId().equalsIgnoreCase(courseId)) {
                courseList.remove(course);
                System.out.println("Course deleted successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }
}

