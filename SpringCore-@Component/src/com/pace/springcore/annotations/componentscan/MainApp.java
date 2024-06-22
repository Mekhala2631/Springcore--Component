package com.pace.springcore.annotations.componentscan;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner scnr = new Scanner(System.in);
		Customer customer = (Customer) context.getBean("customer");//reference is like class name with first alphabet in lower case
      	Employee employee = (Employee) context.getBean("employee");
      	customer.setId(1001);
      	customer.setName("Abhiveera");
      	customer.setCity("Bengaluru");
		System.out.println("Customer Details");
		customer.showCustomerDetails();
		
		employee.setId(101);
		employee.setName("Kumar");
		employee.setSalary(1200000.00f);
		System.out.println("Employee Details");
		employee.showEmpDetails();

	}

}