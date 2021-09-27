package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {

	@Value("${my.info.product.id}")
	private int prodId;
	@Value("${my.info.product.code}")
	private String prodCode;
	@Value("${my.info.product.model-version}")
	private double modelver;
	@Value("${my.info.product.release_dtl_enable}")
	private boolean isDetEnable;
	@Value("${my.info.product.start-key}")
	private char startKey;

	public SpringBootRunnerWithInputData() {
		// TODO Auto-generated constructor stub
	}

	public SpringBootRunnerWithInputData(int prodId, String prodCode, double modelver, boolean isDetEnable,
			char startKey) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.modelver = modelver;
		this.isDetEnable = isDetEnable;
		this.startKey = startKey;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public double getModelver() {
		return modelver;
	}

	public void setModelver(double modelver) {
		this.modelver = modelver;
	}

	public boolean isDetEnable() {
		return isDetEnable;
	}

	public void setDetEnable(boolean isDetEnable) {
		this.isDetEnable = isDetEnable;
	}

	public char getStartKey() {
		return startKey;
	}

	public void setStartKey(char startKey) {
		this.startKey = startKey;
	}

	@Override
	public String toString() {
		return "SpringBootRunnerWithInputData [prodId=" + prodId + ", prodCode=" + prodCode + ", modelver=" + modelver
				+ ", isDetEnable=" + isDetEnable + ", startKey=" + startKey + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
