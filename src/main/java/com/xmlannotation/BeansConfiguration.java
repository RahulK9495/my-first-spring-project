package com.xmlannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

	@Bean (name="bus1")
	public Bus getBus1()
	{
		return new Bus(1121, "express", "red");
	}

	@Bean (name="bus2")
	public Bus getBus2()
	{
		return new Bus(2324, "express-pune", "yello");
	}
		
}
