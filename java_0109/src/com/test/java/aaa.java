package com.test.java;

public class aaa {
	public static void main(String[] args) {
		
		
		
		
		 for (int j = 2; j <= 9; j++) {
				 System.out.println("==============");
				 System.out.printf("     %d단\n", j);
				 System.out.println("==============");
					
		  	for(int i = 1; i <= 9; i++) {
					 System.out.printf("%d * %d = %2d\n", j, i, i * j);
				}
				
			 System.out.println(); // 단마다 띄어쓰기
		 }
		
		
	}

}
