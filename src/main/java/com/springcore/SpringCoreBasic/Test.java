package com.springcore.SpringCoreBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		Student st = new Student();
//		st.setId(1);
//		st.setName("sanat");
//		st.setAddress("patna");
//		System.out.println(st);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans has been loaded....");
//		Student st = context.getBean("student",Student.class);
//		System.out.println(st);
//		
//		Student st1 = context.getBean("student1",Student.class);
//		System.out.println(st1);
//		
//		Student st2 = context.getBean("conStudent",Student.class);
//		System.out.println(st2);
		
//		Student st2 = context.getBean("conStudent1",Student.class);
//		System.out.println(st2);
//		
//		Student st3 = context.getBean("conStudent2",Student.class);
//		System.out.println(st3);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}

}
