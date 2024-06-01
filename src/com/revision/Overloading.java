package com.revision;

public class Overloading {
	
	private void Employee_details() {
		System.out.println("Selvakumar");
	}
	
	private void Employee_details(String name) {
		System.out.println(name);
	}
	private void Employee_details(int number) {
		System.out.println(number);
	}
	private void Employee_details(float amount) {
		System.out.println(amount);
	}
	
	public static void main(String[] args) {
		
		Overloading details = new Overloading();
		
		details.Employee_details();
		details.Employee_details("Franklin");
		details.Employee_details(877872);
		details.Employee_details(50000);
		
	}

}
