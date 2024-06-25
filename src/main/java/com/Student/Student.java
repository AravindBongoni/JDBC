package com.Student;

public class Student {
	private int id;
	private String name;
	private String hallticket;
	private String branch;
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
	public String getHallticket() {
		return hallticket;
	}
	public void setHallticket(String hallticket) {
		this.hallticket = hallticket;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int id, String name, String hallticket, String branch) {
		this.id = id;
		this.name = name;
		this.hallticket = hallticket;
		this.branch = branch;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hallticket=" + hallticket + ", branch=" + branch + "]";
	}
	
	
	
}
