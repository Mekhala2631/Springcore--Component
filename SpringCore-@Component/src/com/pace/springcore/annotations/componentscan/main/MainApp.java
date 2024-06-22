package com.pace.springcore.annotations.componentscan.main;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pace.springcore.annotations.componentscan.Customer;
import com.pace.springcore.annotations.componentscan.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner scnr = new Scanner(System.in);
		Customer customer = (Customer) context.getBean("customer");//reference is like class name with first alphabet in lower case
        Employee employee = (Employee) context.getBean("employee");
		customer.showCustomerDetails();
		employee.showEmpDetails();

	}

}