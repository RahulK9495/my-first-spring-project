package com.zeroxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages ="com.zeroxml")
public class JavaBasedConfig {

	@Bean(name="bike2")
	@Scope(scopeName = "prototype")
	public Bike getBike2()
	{
		return new Bike(23, "yamaha", "sports");
	}
	
	@Bean(name ="bus1",initMethod="myInitmethod")
	public Bus getBus1()
	{
		return new Bus(123, "express");
	}
	
	@Bean(name="engine")
	public Engine getEngine()
	{
		return new Engine(1324, "V type");
	}
}
