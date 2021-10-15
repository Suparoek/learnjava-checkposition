package com.Labee.learnOop;
public class Day9 {
	public static void main (String[] arges) {
		Employee dang = new Employee("Dang","Red","Programmer",10000);
		System.out.println("dang.firstname");
		System.out.println("dang.lastname");
		dang.hello();
		dang.checkposition();
		int salary = dang.getSalary();
		System.out.println(salary);
		showEmployee();
				
	}
	public static void showEmployee() {
		Employee[] emp = new Employee[3];
		for(int i=0; i<emp.length;i++) {
			emp[i] = new Employee("name"+i,"lastname"+i,"positon"+i,i*10000);
		}
		System.out.println(emp[1].firstname);
		System.out.println(emp[1].lastname);
		emp[1].checkposition();
		System.out.println(emp[2].getSalary());
		
	}
}
