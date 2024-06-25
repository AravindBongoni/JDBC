package com.preparedstatement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext  c= new ClassPathXmlApplicationContext("employee.xml");
		EmployeeDAO1 dao = (EmployeeDAO1) c.getBean("edao");
		dao.bypreparedstatement(new Employee(4,"nani",4500f,"Developer"));

	}

}
