package com.test.java;

public class Ex26_Calendar {
	public static void main(String[] args) {
		
		/* 달력 만들기
		 1. 해당 년월의 마지막 일
		 2. 해당 년월의 1일의 요일 // 달력 만들때 날짜와 요일을 맞추기 위해 알아내야 함
		 */
		
		
		for (int i = 1; i <= 12; i++) {
		
		}
		
		int year = 2024; // 1.
		int month = 1; // 2.
		
		printMethod(year, month);
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month); // 2024년 1월 1일이 서기 1월 1일로부터 얼마나 지났는지
		
		
		
		
		for (int i = 0; i < dayOfWeek; i++) { 
			System.out.println("\t"); // 맞는 요일로 위치 맞추기
		}
		
		for (int i = 1; i <= lastDay; i++) { // 달의 1일부터 마지막 날까지 출력
			System.out.printf("%3d\t", i);
			
			// 토요일이면 줄바꿈해야 함 ( % 7 = 6)
			//if (i % 7 == 6) {
			
			if ((i + dayOfWeek) % 7 == 0) { // 토요일 위치 고정시키기
				System.out.println();
			}
			
		}
		
		
		
		
	} // main


	private static void printMethod(int year, int month) {
		System.out.println("=========================================================");
		System.out.printf("		     %d년 %02d월\n", year, month);
		System.out.println("=========================================================");
		
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t");
	}


	private static int getLastDay(int year, int month) {
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28; // 2월의 마지막 날 계산 메서드 (윤년, 평년)
		}
		return 0; // case 외의 값이 들어왔을 때 출력 (유효성 검사)
	}
	
	// 메서드명 패턴
	// 1. 반환값 get&&& : return값을 갖기 위함
	// 2. set&&&(인자값) : 인자값을 전달해서 쓰기 작업을 할 때
	// 3. boolean is&&& : return값이 boolean형일 때 (확인 받을 때)

	private static boolean isLeafYear(int year) { // 2월의 마지막 날 계산 메서드 (윤년, 평년)
		
		if (year % 4 == 0) {
			
			if (year % 100 == 0) {
				
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
				
			} else {
				return true;
			}
			
		} else {
			return false;
		}
		
	} // isLeafYear


	private static int getDayOfWeek(int year, int month) {
		
		// 서기 1년 1월 1일 ~ 2024(year)년 1월(month) 9일까지
		
		int date = 1; // 일
		int sum = 0; // 누적 변수 (합)
		
		
		// 1. 1년 1월 1일 ~ 2023년 12월 31일까지를 먼저 구하기 (1년 = 365일이니까)
		for (int i = 1; i < year; i++) { // i가 year
			sum += 365;
			
			if (isLeafYear(i)) { // 윤년
				sum++;
			}
			
		} // for
		
		
		// 2. 2024년 1월 1일 ~ 24년 3월 31일까지 -> 1달씩 구하기
		for (int i = 1; i < month; i++) {
			sum += getLastDay(year, i);
		}
	
		// 3. 2024년 1월 9일까지의 합 구하기
		sum += date;
		
		
		return sum % 7; // 요일로 만들기 -> % 7 (2가 나오면 월요일)
		
	}

}
