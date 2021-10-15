package com.Labee.learnOop;

public class Programmer extends Employee {

	public Programmer(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
	}
	@Override
	 public int getSalary() {
			return super.getSalary();
	}
	public  void createwebsite(String template,String titleName) {
		
		System.out.println("website is template:"+template+"website title:" +titleName);
	}
	public void installWindows(String version,String productKey) {
		System.out.println("Windows version:"+version+" productkey:"+productKey);
	}
	

}
