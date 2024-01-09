package com.test.java;

import java.util.Scanner;

public class Ex28_Scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");

		String txt = "";
		while (scan.hasNext()) { 
		// scan.hasNext(): 읽어올게 남았는지를 판단해줌 (읽어올 수 있는 다음 토큰이 있는지 검사 (boolean형)
			
			txt = scan.next();
		}
		
		System.out.println("종료");
		
		
		
		// 입력 답안에 공백이 들어가면 next()도 사용 가능 (토큰: 공백으로 구분되는 단어)
//		System.out.print("입력: ");
//		String txt = scan.next();
//		System.out.println(txt);
//		
//		txt = scan.next();
//		System.out.println(txt);
//		
//		txt = scan.next();
//		System.out.println(txt);
		
		
//		// 문자열 입력
//		System.out.print("입력: ");
//		String line = scan.nextLine(); // reader.readLine();과 동일함
//		System.out.println(line);
//		
//		// 자료형별로 입력 받는 메서드 제공
//
//		System.out.print("숫자: ");
//		int num = scan.nextInt();
//		System.out.println(num + 18);
//		
//		scan.nextLine(); // 위 nextInt가 안가져간 엔터(\r\n)을 지우는 역할
//		scan.skip("\r\n");
//		
//		System.out.print("입력: ");
//		line = scan.nextLine();
//		System.out.println("마지막: " + line);
		
		
		
		
	}

	
	
}
