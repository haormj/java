package com.haormj.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany implements Company {

	private List<Company> list = new ArrayList<Company>();

	private String name;
	private String sex;
	private String position;
	private int salary;

	public ConcreteCompany(String name, String sex, String position, int salary) {
		super();
		this.name = name;
		this.sex = sex;
		this.position = position;
		this.salary = salary;
	}

	public void add(Company company) {
		list.add(company);
	}

	public void remove(Company company) {
		list.remove(company);
	}

	public List<Company> getChild() {
		return list;
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
