package com.accenture.api.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ConfigUtility {
	
	@Autowired
	private Environment env;
	
	public String getProperty(String propertyName) {
		return env.getProperty(propertyName);
	}

}
