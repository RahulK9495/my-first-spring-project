package com.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-scope.xml");
		
		Employee emp = context.getBean(Employee.class, "emp");
		
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());

		Employee emp2 = context.getBean(Employee.class, "emp");

		System.out.println(emp2);
		System.out.println(emp2.hashCode());
		
		System.out.println(emp == emp2);
	}

}
