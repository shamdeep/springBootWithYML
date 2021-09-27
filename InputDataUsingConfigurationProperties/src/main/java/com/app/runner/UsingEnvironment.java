package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UsingEnvironment implements CommandLineRunner {

	@Autowired
	Environment environment;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----IN----- using Environment---------");
		System.out.println(environment.getProperty("my.prod.ID"));
		System.out.println(environment.getProperty("my.prod.code"));
		System.out.println(environment.getProperty("my.prod.Ty_pe"));
		System.out.println(environment.getProperty("my.prod.MOD-E_L"));
		System.out.println("----Out------ using Environment---------");
	}

}
