package org.example;

import org.example.config.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        EmployeeService employeeService=context.getBean(EmployeeService.class);

        employeeService.listAllEmails().forEach(System.out::println);
    }
}