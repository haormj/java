package com.haormj.composite;

public class Employee implements Company {

	private String name;
	private String sex;
	private String position;
	private int salary;

	public Employee(String name, String sex, String position, int salary) {
		super();
		this.name = name;
		this.sex = sex;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		String info = "";
		info += "名称:" + this.name;
		info += "\t性别:" + this.sex;
		info += "\t职位:" + this.position;
		info += "\t薪水:" + this.salary;
		return info;
	}

}
