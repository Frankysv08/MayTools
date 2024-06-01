package com.revision;

public class Partial_abstraction_class1 extends Partial_abstract{
	
	@Override
	public void number() {
		System.out.println(8778727024l);
	}
	
	public static void main(String[] args) {
		
		Partial_abstraction_class1 details = new Partial_abstraction_class1();
		
		details.name();
		details.number();
				
	}
	

}
