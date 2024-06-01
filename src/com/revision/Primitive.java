package com.revision;

public class Primitive {
	
	public String display(){
		String name = "Franklin";
		return name;
	}
	public short numeric() {
		short num = 80;
		return num;
	}
	
	public byte small_num() {
		byte value = 1;
		return value;
	}
	
	public char letter() {
		char word = 'f';
		return word;
	}
	public long number() {
		long number = 54654845;
		return number;
	}
	public double div() {
		double div = 548.5;
		return div;
	}
	public boolean statement() {
		boolean enter = true;
		return enter;
	}
	public float division() {
		float division = 5878.5477f;
		return division;
	}
	
	public static void main(String[] args) {
		
		Primitive pv = new Primitive();
		String a = pv.display();
		System.out.println(a);
		
		short b = pv.numeric();
		System.out.println(b);
		
		byte c = pv.small_num();
		System.out.println(c);
		
		char d = pv.letter();
		System.out.println(d);
		
		long e = pv.number();
		System.out.println(e);
		
		double f = pv.div();
		System.out.println(f);
		
		boolean g = pv.statement();
		System.out.println(g);
		
		float h = pv.division();
		System.out.println(h);
	}

}
