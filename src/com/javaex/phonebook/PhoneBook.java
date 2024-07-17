package com.javaex.phonebook;

public class PhoneBook {
	
	private String name;
	private String hp;
	private String company;
	public PhoneBook() {
		super();
	
	}
	public PhoneBook(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("연락처: "+hp);
		System.out.println("회사 "+company);
	}
	}
	

