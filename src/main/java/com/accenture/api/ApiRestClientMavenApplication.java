package com.accenture.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.api.service.ApiClientServ;

@SpringBootApplication
public class ApiRestClientMavenApplication implements CommandLineRunner {

	@Autowired
	ApiClientServ apiClientServ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestClientMavenApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		apiClientServ.consumeApiFacebook(args);
	}

}
