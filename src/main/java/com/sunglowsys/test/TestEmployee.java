package com.sunglowsys.test;

import com.sunglowsys.configuration.ApplicationConfiguration;
import com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Employee employee = (Employee) context.getBean(Employee.class);
        System.out.println();
        employee.setFirstName("Govind ");
        System.out.println("Emp Name:"+employee.getFirstName());
        System.out.println();
        employee.newAddress();
    }
}
