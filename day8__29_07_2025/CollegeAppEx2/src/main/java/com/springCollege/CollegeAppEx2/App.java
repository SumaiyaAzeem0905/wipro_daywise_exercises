package com.springCollege.CollegeAppEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    System.out.println("--- Property-based DI ---");
    College college = (College) context.getBean("college");
    System.out.println(college);

    ((ClassPathXmlApplicationContext) context).close();
}}
