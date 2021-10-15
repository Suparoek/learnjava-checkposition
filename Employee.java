package com.Labee.learnOop;

public class Employee {
	public String firstname;
	public String lastname;
	public String position;
	private int salary;
	
	public Employee(String firstnameInput,String lastnameInput,String positionInput,int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		position = positionInput;
		salary = salaryInput;
		
	}
	public void hello () {
		System.out.println("Hello"+firstname);
	}
	
	public String checkposition() {
		String txt;
		if(position == "CEO" || position =="IT" || position =="Programmer") {
				txt = "เป็นพนักงานบริษัท";
		}else {
				txt = "ไม่ใช่พนักงานขของบริษัท";
		}
		return txt;
	}
	
	public int getSalary() {
		return salary;
	}
	
}
