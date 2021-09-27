package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/*CommandLineRunner with Ordered implementations Manual Approach*/
@Component
public class SpringBootCommandLineRunner implements CommandLineRunner, Ordered {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hii CommandLine Runner");
	}

	@Override
	public int getOrder() {
		return 50;
	}
}
