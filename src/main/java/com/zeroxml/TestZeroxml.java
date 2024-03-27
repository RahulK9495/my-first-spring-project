package com.zeroxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestZeroxml {

	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		
//		Bike bike=ctx.getBean("bike", Bike.class);
//		System.out.println(bike);
		
		Bike bike2=ctx.getBean("bike2", Bike.class);
		System.out.println(bike2);
	
		Bike bike3=ctx.getBean("bike2", Bike.class);
		System.out.println(bike3);
	
		System.out.println(bike2==bike3);
	
		
		Bus bus1=ctx.getBean("bus1",Bus.class);
		System.out.println(bus1);
	}
	
}
