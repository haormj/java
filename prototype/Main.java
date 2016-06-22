package com.haormj.prototype;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	Map<String, String> students = new LinkedHashMap<String, String>();

	public static void main(String[] args) {
		Mail mail = new Mail("通知", "今天下午开会,大家都要来哦");
		mail.setTail("互相转告");
		Main main = new Main();
		Map<String, String> students = main.getStudents();
		for (String name : students.keySet()) {
			Mail m = mail.clone();
			m.setAppellation(name);
			m.setReceiver(students.get(name));
			main.sendMail(m);
		}
	}

	public Map<String, String> getStudents() {
		students.put("郝世杰", "haormj@qq.com");
		students.put("hello", "hello@qq.com");
		students.put("world", "world@qq.com");
		return students;
	}

	public void sendMail(Mail mail) {
		System.out.println(
				"标题:" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t正文:" + mail.getContent() + "...已发送!");
	}

}
