package com.Labee.learnOop;

public class Day10 {
   public static void main(String[] arges) {
	
	   Employee dange = new Employee("Dang","Red","IT",1000);
	   System.out.println(dange.getSalary());
	   String checkposition = dange.checkposition();	
	   System.out.println("คุณเป็นพนักงานบริษัทหรือไม่ :"+checkposition);
	   dange.hello();
	   CEO ceo = new CEO("somchai","sudlor","ceo",30000);
	   System.out.println(ceo.getSalary());
	   ceo.hello();
	   ceo.fire(dange);
	   Programmer pro = new Programmer("test","test","IT",22000);
	   pro.getSalary();
	   pro.createwebsite("java", "learnjava");
	   pro.installWindows("11", "12soii32oiiir43l");
	   
   }
}
