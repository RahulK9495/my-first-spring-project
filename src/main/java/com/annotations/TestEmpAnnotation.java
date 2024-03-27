package com.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpAnnotation {

	public static void main(String[] args) {
		
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfigurations.class);
		
		Employee emp = ctx.getBean("emp", Employee.class);
		
		System.out.println(emp);

		Employee emp1 = ctx.getBean("emp1", Employee.class);
		
		System.out.println(emp1);
		
		Student std = ctx.getBean("std", Student.class);
		System.out.println(std);
	}
}
