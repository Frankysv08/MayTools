package com.revision;

public class Single_inheritance_class2 extends Single_inheritance{
	
	private void fish() {
		System.out.println("Gold fish");
	}
	private void pet() {
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		
		Single_inheritance_class2 common = new Single_inheritance_class2();
		
		common.chocolate();
		common.lunch();
		common.dinner();
		common.fish();
		common.pet();
	}

}
