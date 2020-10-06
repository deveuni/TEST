package com.itwillbs.javaTest;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		
		System.out.println("사칙연산 실행하기!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		double num1 = sc.nextDouble();
		System.out.println("연산자 (+,-,*,/)를 입력하세요.");
		String Op = sc.next();
		System.out.println("두번째 숫자를 입력하세요.");
		double num2 = sc.nextDouble();
		
		if(Op.equals("+")){
			double sum = num1 + num2;
			System.out.println("num1 + num2 = "+ num1 + Op + num2 +" = "+ sum);
		}else if(Op.equals("-")){
			double sub = num1 - num2;
			System.out.println("num1 - num2 = "+ num1 + Op + num2+" = " + sub);
		}else if(Op.equals("*")){
			double mul = num1 * num2;
			System.out.println("num1 * num2 = "+ num1 + Op + num2 +" = " + mul);
		}else if(Op.equals("/")){
			double div = num1 / num2;
			System.out.println("num1 / num2 = "+ num1 + Op + num2 +" = " + div);
		}

		
		
		
	}

}
