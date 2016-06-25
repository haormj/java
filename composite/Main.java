package com.haormj.composite;
/**
 * 这个是程序的入口
 */
public class Main {

	public static void main(String[] args) {
		// ceo
		ConcreteCompany root = new ConcreteCompany("郝世杰", "男", "CEO", 100000);
		// 部门经理
		ConcreteCompany develop = new ConcreteCompany("hao", "男", "研发部经理", 10000);
		ConcreteCompany sale = new ConcreteCompany("shi", "女", "销售部经理", 15000);
		ConcreteCompany finance = new ConcreteCompany("jie", "男", "财务部经理", 10000);
		root.add(develop);
		root.add(sale);
		root.add(finance);

		// 具体员工
		// 研发
		Employee ed1 = new Employee("h", "男", "研发部", 5000);
		Employee ed2 = new Employee("a", "男", "研发部", 5000);
		Employee ed3 = new Employee("o", "男", "研发部", 5000);
		develop.add(ed1);
		develop.add(ed2);
		develop.add(ed3);
		// 销售
		Employee es1 = new Employee("s", "女", "销售部", 5000);
		Employee es2 = new Employee("h", "女", "销售部", 5000);
		Employee es3 = new Employee("i", "女", "销售部", 5000);
		sale.add(es1);
		sale.add(es2);
		sale.add(es3);
		// 财务
		Employee ef1 = new Employee("j", "男", "财务部", 5000);
		Employee ef2 = new Employee("i", "女", "财务部", 5000);
		Employee ef3 = new Employee("e", "男", "财务部", 5000);
		finance.add(ef1);
		finance.add(ef2);
		finance.add(ef3);
		display(root);
	}

	public static void display(ConcreteCompany root) {
		System.out.println(root.getInfo());
		for (Company c : root.getChild()) {
			if (c instanceof Employee) {
				System.out.println(c.getInfo());
			} else {
				display((ConcreteCompany) c);
			}
		}
	}

}
