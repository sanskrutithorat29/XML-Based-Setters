package com.xmlBasedSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.toString());
		
		Department department=(Department) context.getBean("department");
		System.out.println(department.toString());

	}
}
