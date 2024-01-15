package com.test.java.cast;

import java.util.Scanner;

public class Q088 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String content = scan.nextLine();
		
		String[] stops = {"바보", "멍청이"};
		int count = 0;
		
		int index = -1;
		String txt = "";
		
		
		for (int i = 0; i < stops.length; i++) {
			
			while ((index = content.indexOf(stops[i], index)) > -1) { // 금지어 위치를 index에 저장해서 문장 안에 있나 검사
				count++;
				index = index + stops[i].length(); // ?
			}
		}

		
		for (int i = 0; i < stops.length; i++) { // ?
			content = content.replace(stops[i], getMaskedText(stops[i]));
		}
		
		// 출력
		System.out.println(content);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n", count);
		
	}

	
	private static String getMaskedText(String stops) {
		
		String temp = "";
		
		for (int i = 0; i < stops.length(); i++) { // 금지어 길이만큼 * 처리하기
			temp += "*";
		}
		
		return temp;
	}

}

