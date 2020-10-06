package com.itwillbs.javaTest;

 class MyPoint{
	private int a,b;
	
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		//return "MyPoint("+a+","+b+")";
		return getClass().getName()+"("+a+","+b+")";
	}
	
	
}

public class EX4 {
	
	

	public static void main(String[] args) {
		
		MyPoint a = new MyPoint(3,20);
		System.out.println(a);
		
	}

}
