package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q051 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행: ");
		int num = Integer.parseInt(reader.readLine());
		
		

		for (int i = 0; i < num; i++) { // 세로
			
			for (int j = i; j < num; j++) { // 공백 가로 (왼쪽 삼각형)
				System.out.print(" ");
			}
			
				
			for (int j = 0; j <= i; j++) { // 별(*) 가로 (왼쪽 삼각형)
				System.out.print("*");
			}
			
			
			for (int j = 0; j < i; j++) {  // 별(*) 가로 (오른쪽 삼각형)
				System.out.print("*");
				
			}
				
			for (int j = 0; j < i; j++) { // 공백 가로 (오른쪽 삼각형)
				System.out.print(" ");
			}
			
//			for (int j = 0; j < num; j++) { // 별(*) 가로
//				System.out.print("*");
//			}
			
			
			
			System.out.println();
			
		}
		
	}

}
