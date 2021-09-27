package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(value = "my.prod")
@Component
public class UsingApplicationProperties implements CommandLineRunner {

	private int id;
	private String code;
	private boolean type;
	private char model;
	private List<String> projname;
	private Set<String> projname1;
	private String[] projname2;

	public UsingApplicationProperties() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public char getModel() {
		return model;
	}

	public void setModel(char model) {
		this.model = model;
	}

	public List<String> getProjname() {
		return projname;
	}

	public void setProjname(List<String> projname) {
		this.projname = projname;
	}

	public Set<String> getProjname1() {
		return projname1;
	}

	public void setProjname1(Set<String> projname1) {
		this.projname1 = projname1;
	}

	public String[] getProjname2() {
		return projname2;
	}

	public void setProjname2(String[] projname2) {
		this.projname2 = projname2;
	}

	@Override
	public String toString() {
		return "UsingApplicationProperties [id=" + id + ", code=" + code + ", type=" + type + ", model=" + model
				+ ", projname=" + projname + ", projname1=" + projname1 + ", projname2=" + Arrays.toString(projname2)
				+ "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" using Configuration properties");
		System.out.println(this.toString());

	}
	

}
