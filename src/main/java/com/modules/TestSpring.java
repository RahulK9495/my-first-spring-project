package com.modules;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-boot.xml");
		
		Employee emp=context.getBean(Employee.class);
		System.out.println(emp);
	
		Student std = context.getBean(Student.class);
		System.out.println(std);
		
		Car car=context.getBean(Car.class);
		System.out.println(car);
	}
	
}
