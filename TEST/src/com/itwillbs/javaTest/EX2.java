package com.itwillbs.javaTest;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("정수 10개 입력 >>");
		for(int i=0; i<10; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++){
			if(arr[i] % 3 == 0){
				System.out.println(arr[i] + " ");
			}
		}
		
		
	}

}
