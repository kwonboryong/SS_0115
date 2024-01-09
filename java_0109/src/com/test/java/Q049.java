package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q049 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행: ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = num; i > 0; i--) {
			
			for (int j = 0; j <= num-i; j++) {
				System.out.print(" ");
			}
				
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}
}
