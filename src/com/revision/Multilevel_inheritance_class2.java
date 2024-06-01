package com.revision;

public class Multilevel_inheritance_class2 extends Multilevel_inheritance_class1{

	
	private void drinks() {
		System.out.println("JD");
	}
	private void side_dish() {
		System.out.println("Pickle");
	}
	
	public static void main(String[] args) {
		
		Multilevel_inheritance_class2 details = new Multilevel_inheritance_class2();
		
		details.toy();
		details.car();
		details.phone();
		details.flower();
		details.drinks();
		details.side_dish();
	
    }
}	
