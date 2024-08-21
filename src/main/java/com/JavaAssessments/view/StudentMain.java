package com.JavaAssessments.view;

import com.JavaAssessments.controller.StudentController;
import com.JavaAssessments.model.StudentView;
import com.JavaAssessments.repository.StudentRepository;
import com.JavaAssessments.service.StudentService;

public class StudentMain {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(service, view);

        controller.start();
    }
}
