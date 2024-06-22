package com.pace.springcore.annotations.componentscan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private float salary;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public void showEmpDetails() {
		System.out.println("Employee name : " + name);
		System.out.println("Employee salary : " + salary); 
	}

}
