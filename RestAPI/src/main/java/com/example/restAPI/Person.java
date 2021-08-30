package com.example.restAPI;

public class Person {
	private String name;
	private int age;
	private String company;
	private String companyId;
	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Person(String name, int age, String company, String companyId) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
		this.companyId = companyId;
	}
}
