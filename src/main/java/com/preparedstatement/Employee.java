package com.preparedstatement;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String desig;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Employee(int id, String name, float salary, String desig) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desig=" + desig + "]";
	}
	
	
}
