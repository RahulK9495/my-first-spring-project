package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.annotations")
public class BeansConfigurations {

	@Bean(name = "emp")
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		emp.setId(13);
		emp.setName("Sham");
		emp.setAddress("Mumbai");
		
		return emp;
	}
	@Bean(name = "emp1")
	public Employee getEmployee1()
	{
		Employee emp1 = new Employee();
		emp1.setId(14);
		emp1.setName("navin");
		emp1.setAddress("Baglore");
		
		return emp1;
	}
	@Bean(name="std")
	public Student getStudent()
	{
		Student std=new Student();
		std.setRoll(34);
		std.setName("Rahul");
		
		return std;
	}
	
	@Bean(name="addr1")
	@Primary
	public Address getAddress()
	{
		return new Address(12, "kolhapur");
	}
		
	@Bean(name="addr2")
	public Address getAddress2()
	{
		return new Address(45, "sangli");
	}
	
}
