package com.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("student.xml");
		StudentDAO dao = (StudentDAO) c.getBean("nani");
//		int status=dao.insert(new Student(2,"ani","19TR1A0417","ECE"));
//		System.out.println(status);
//		int status1 = dao.update(new Student(1,"raj","19TR1A0475","CSE"));
//		System.out.println(status1);
		int status2 = dao.delete(new Student(1,"raj","19TR1AO475","CSE"));
		System.out.println(status2);
	}

}
