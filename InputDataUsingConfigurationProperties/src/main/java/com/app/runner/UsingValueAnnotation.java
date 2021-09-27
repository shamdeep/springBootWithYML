package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UsingValueAnnotation implements CommandLineRunner {

	// @Value("${my.random.stringval}")
	// @Value("${my.random.stringval}")
	// @Value("${random..value}")
	@Value("${my.random.uuid-type}")
	private String code;
	@Value("${my.random.num}")
	// @Value("${my.random.num-rang}")
	// @Value("${my.random.num-rang-from-to}")
	private int num;
	@Value("${my.random.bignum}")
	private long numbig;

	public UsingValueAnnotation() {
		// TODO Auto-generated constructor stub
	}

	public UsingValueAnnotation(String code, int num, long numbig) {
		super();
		this.code = code;
		this.num = num;
		this.numbig = numbig;
	}

	
	@Override
	public String toString() {
		return "UsingValueAnnotation [code=" + code + ", num=" + num + ", numbig=" + numbig + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" Using @ Value Annotations");
		System.out.println(this);
	}

}
