package com.xmlannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testxmlant {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-xmlant.xml");
		
		Car car=ctx.getBean("car",Car.class);
		System.out.println(car);
		
		Bike bike=ctx.getBean("bike", Bike.class);
		System.out.println(bike);
		
		Bus bus1=ctx.getBean("bus1",Bus.class);
		System.out.println(bus1);

		Bus bus2=ctx.getBean("bus2",Bus.class);
		System.out.println(bus2);

	}

}
