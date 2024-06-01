package com.revision;

public class Multiple_inheritance_class2 implements Multiple_inheritance , Multiple_inheritance_class1{

	@Override 
	public void name() {
		System.out.println("FRANKLIN");
	}
	@Override
	public void number() {
		System.out.println(8778727024l);
	}
	@Override
	public void city() {
		System.out.println("TIRUCHIRAPALLI");
	}
	@Override
	public void area() {
		System.out.println("GH");
	}
	
	public static void main(String[] args) {
		
		Multiple_inheritance_class2 info = new Multiple_inheritance_class2();
		
		info.city();
		info.area();
		info.name();
		info.number();
	}
}
