package com.revision;

public class Overriding_class1 extends Overriding {
	
	@Override
	public void fish() {
		System.out.println("Gold fish");
		super.fish();
	}
	@Override
	public void dog_breed() {
		System.out.println("German Sheperd");
		super.dog_breed();
	}
	
	public static void main(String[]args) {
		
		Overriding_class1 common = new Overriding_class1();
		
		common.fish();
		common.dog_breed();
	}

}
