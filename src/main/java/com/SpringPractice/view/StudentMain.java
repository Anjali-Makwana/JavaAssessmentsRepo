package com.SpringPractice.view;

import com.SpringPractice.controller.StudentController;
import com.SpringPractice.model.StudentView;
import com.SpringPractice.repository.StudentRepository;
import com.SpringPractice.service.StudentService;

public class StudentMain {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(service, view);

        controller.start();
    }
}
