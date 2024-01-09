package com.test.java;

import java.util.Arrays;
import java.util.Calendar;

public class Ex27_Array {
	public static void main(String[] args) {
		
		/* 배열 (Array)
		  - 자료구조: 데이터를 저장하는 물리적인 구조
		  - 데이터의 집합 =>  변수들을 모아놓은 집합
		  - 같은 자료형을 저장하는 데이터의 집합	*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
//		m14();
		
		
		
		
		
		
	}
	
	
	

	private static void m13() {
		
		
		int nums[] = {5, 3, 1, 4, 2};
		
		String[] names = {"홍길동", "박명수", "아무개", "유재석", "박명뭐", "병아리", "도깨비", "강아지", "고양이", "집갈래"};
		
		
		// Quick Sort
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
	}




	private static void m12() {
		/* 정렬
		  - 크기 비교 후 재배치
		  
		  1. 오름차순
		   (1) 숫자: 작은 수 -> 큰 수
		   (2) 문자열: 문자코드 값 순 (가나다...)
		   (3) 날짜시간: 과거-> 미래
		  
		  
		  2. 내림차순
		   (1) 숫자: 큰 수 -> 작은 수
		   (2) 문자열: 문자코드 값의 역순
		   (3) 날짜시간: 미래 -> 과거
		   
		  정렬 구현
		  1. 직접 구현 => 정렬 알고리즘
		  2. JDK 구현된 기능
		  
		  
		  버블 정렬 + swap
		  - swap: 두 공간의 데이터를 서로 바꾸는 작업*/
		
		int a = 18;
		int b = 5;
		//int temp;
		
		//temp = a;
		a = b;
		//b = temp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		

		// 버블 정렬: 가지고 있는 (배열 길이 - 1)을 해야 함
		int nums[] = {5, 3, 1, 4, 2}; // 원본
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) { 
				// nums.length-1-i = i가 0일때 j가 0123, i가 1일때 j가 012... 
				
				// 오름차순
				if (nums[j] > nums[j+1]) { // j와 j의 다음 숫자를 비교해서 j가 크면 둘이 자리 바꿈
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
//				// 내림차순
//				if (nums[j] < nums[j+1]) { // j와 j의 다음 숫자를 비교해서 j가 작으면 둘이 자리 바꿈
//					int temp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = temp;
				}
			}
		System.out.println(Arrays.toString(nums));

		
		
		
		// String은 참조형 -> 주소값끼리는 비교 X => 첫 번째 글자의 문자코드값을 비교
		
		String[] names = {"홍길동", "박명수", "아무개", "유재석", "박명뭐", "병아리", "도깨비", "강아지", "고양이", "집갈래"};
		
		
		for (int i = 0; i < names.length-1; i++	 ) {
			for (int j = 0; j < names.length-1-i; j++) {
				if (names[j].compareTo(names[j+1]) > 0) { // 오름차순 (가나다순)
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
		
		
//		String name1 = "홍길동";
//		String name2 = "아무개";
		
		// 두 단어의 첫 글자의 문자코드값 차이
		// .compareTo(비교값): 두 글자 중 누가 앞에 있는 문자인지, 둘이 같은 문자인지 확인해줌
//		System.out.println(name1.compareTo(name2)); // 4361
//		
//		System.out.println((int)'홍'); // 54861
//		System.out.println((int)'아'); // 50500
		// 문자코드 값이 클수록 뒷 순서의 문자
		
		
		
		
		
		
		
		
		

	}




	private static void m11() {
		/* 배열 초기화 리스트
		  (자동 초기화와 상관 없음)
		   - 
		   - 
		   
		   
		 */
		
		int[] nums1 = new int[5];
		
		nums1[0] = 95; // for문을 돌릴 수 있는 상황이면 이렇게 사용 (숫자가 중구난방이라 for문 사용 X)
		nums1[1] = 88;
		nums1[2] = 67;
		nums1[3] = 89;
		nums1[4] = 64;
		
		System.out.println(Arrays.toString(nums1)); 
		
		
		// 초기화 리스트
		// 1. 잘 안씀
		int[] nums2 = new int[] {95, 88, 67, 89, 64}; // 방의 길이 생략 {}; 추가
		
		System.out.println(Arrays.toString(nums2)); 
		
		// 2. 많이 씀
		int[] nums3 = {95, 88, 67, 89, 64}; // 

		
		
		String[] names1 = new String[3]; // 방의 길이 생략 {}; 추가
		
		names1[0] = "홍길동";
		names1[1] = "임꺽정";
		names1[2] = "도깨비";
		
		String[] names2 = {"홍길동", "임꺽정", "도깨비"};
		
		
		
		
	}

	private static void m10() {
		/* 배열 자동 초기화
		   - 배열은 생성 직후 모든 요소(방)가 초기화된다.
		   
		   초기화 규칙
		   1. 정수 배열: 0
		   2. 실수 배열: 0.0
		   3. 문자열: \0 (\u0000)
		   4. 논리 배열: false
		   5. 참조형 배열: null */
		
		
		int[] list1 = new int[3];
		System.out.println(Arrays.toString(list1)); // [0, 0, 0]
		
		double[] list2 = new double[3];
		System.out.println(Arrays.toString(list2)); // [0.0, 0.0, 0.0]
		
		boolean[] list3 = new boolean[3];
		System.out.println(Arrays.toString(list3)); // [false, false, false]
		
		char[] list4 = new char[3];
		System.out.println(Arrays.toString(list4)); // [null, null, null]
		
	}
	
	

	private static void m9() {
		/* Arrays 클래스
		  - 배열과 관련된 여러가지 기능을 구현한 클래스
		  - 배열을 조작하는 편리한 기능을 제공하는 역할
		 */
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		
		// 배열의 상태 확인
		
		System.out.println(nums); // 주소값이 출력됨 (쓸모없음)
		/* [I@2ff4acd0 
		   - [I : int[]
		   - @ : 아무 의미 X
		   - 2ff4acd0 : 메모리 주소*/
		
		printArray(nums); // 배열 상태 확인하는 메서드 (for문)
		
		// Arrays.toString 사용
		System.out.println(Arrays.toString(nums)); // 덤프(dump)
		
		
		// 깊은 복사
		int[] copy;
		
		copy = Arrays.copyOfRange(nums, 0, nums.length); // 원본 변수, 몇 번쨰 방에서, 몇 번째 방까지
		
		nums[0] = 100;
		System.out.println(copy[0]); // 10
		
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			
			System.out.printf("%3d", nums[i]); // 10 20 30
			
		}
	}

	
	
	private static void m8() {
		/* 배열 복사
		  1. 얕은 복사 ( Shallow Copy)
		  - 주소값 복사
		  - Side Effect 발생
		  
		  2. 깊은 복사 (Deep Copy)
		  - 실제 배열을 복사
		  - Side Effect 발생 안함  */
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3]; // 복사본 변수 생성
		
		for (int i = 0; i < nums.length; i++) {
			
			// 배열 안의 방과 방(요소)끼리의 복사 (배열의 복사 X, 값형의 복사임)
			copy[i] = nums[i];
			// int = int
			
		}
		
		nums[0] = 100;
		System.out.println(copy[0]); // 10
		// Side Effect 발생 X
		
		
		
		
		
	}

	private static void m7() {
		// TODO Auto-generated method stub
		
		int a = 10; // a는 지역변수, 값형 변수
		
		changeValue(a);
		System.out.println(a); // 10
		
		// ----------------------------------
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		changeArray(nums); // nums의 주소값 복사
		
		System.out.println(nums[0]); // 123
		
	}

	
	private static void changeArray(int[] nums) { // nums의 주소값 대입
		
		nums[0] = 123;
		System.out.println(nums[0]); // 123
		
	}

	private static void changeValue(int a) {

		a = 20;
		System.out.println(a); // 20
		
	}

	private static void m6() {
		// 배열 복사 (= 참조형 복사)
		
		// 값형의 복사
		int a = 10;
		int b;
		b = a; // 값 복사
		
		a = 20; // 원본 수정
		
		System.out.println("a: " + a); // 20
		System.out.println("b: " + b); // 10
		
		
		// 배열의 복사
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy; // copy의 자료형은 int
		
		copy = nums; // 배열 복사 (int[] = int[];)
		
		System.out.println(copy[0]); // 10
		System.out.println(copy[1]); // 20
		System.out.println(copy[2]); // 30
		
		
		nums[0] = 100; // 원본 수정 => 복사본도 수정됨
		System.out.println(copy[0]); // 100
		
		copy[1] = 200; // 복사본 수정 => 원본도 수정됨
		System.out.println(copy[1]); // 20
		// = Side Effect가 발생한다.
		
		
		
		
	}

	private static void m5() {
		/* 값형 vs 참조형
		  - 값형: 변수 안에 데이터 직접 저장
		  - 참조형: 데이터는 따로 생성 + 변수에 메모리 주소값 저장
		  
		  *** 원인
		  - 데이터의 크기가 일정 => 값형
		  - 데이터의 크기가 일정하지 않음 => 참조형
		  - ***변수만 보고 데이터의 길이를 추측 가능 => 값형
		  - ***변수만 보고 데이터의 길이를 추측 불가능 => 참조형
		   
		 */
		
		int a1 = 10;
		// a1의 메모리 크기 = 4byte
		int a2 = 1000000000;
		// a2의 메모리 크기 = 4byte
		
		
		String s1 = "홍길동";
		// s1의 메모리 크기 = 6byte
		String s2 = "안녕하세요";
		// s2의 메모리 크기 = 10byte
		
		int[] nums1 = new int[3]; // 12byte
		int[] nums2 = new int[5]; // 20byte
		
		
		
	}

	private static void m4() {
		// 모든 자료형으로 배열을 만들 수 있다.
		
		// 정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		// 실수 배열(float, double)
		double[] list2 = new double[4]; // 변수 선언
		list2[0] = 3.14; // 값 넣기
		System.out.println(list2[0]); // 출력
		
		// 문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'a';
		System.out.println(list3[0]);
		
		// 논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		
		// 참조형 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		
		//Calendar c1; // 안에 값 X => 변수만 만든거임
		
		Calendar c1 = Calendar.getInstance(); // Calendar.getInstance();가 실질적인 현재 시간을 생성하는 거임!!!
		
		Calendar[] list6 = new Calendar[5]; // 한꺼번에 만들기 (= 배열)
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0]);
		
		
		
	}

	private static void m3() {
		// 참조형의 특징
		// - 모든 참조형들은 공간을 초기화하지 않아도 자동 초기화가 됨
		
		int[] nums = new int[10];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]); // 초기화 안했는데 0
		// System.out.println(nums[10]); // 배열 길이: 0 ~ 9 
		// 배열의 길이 = 10
		// 첨자의 범위 = 0 ~ 9
		
		// 변수: 값을 갖고 있지 않으면 null 상태
		
		// 배열 탐색하기 (for문 사용)
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
		
		
		
	}

	private static void m2() {
		// 요구사항: 학생 3명의 국어 점수를 저장해서 총점과 평균을 구하기
		// 수정: 학생 수 30명 -> 300명 (배열 사용)
		
		
		// 배열 선언하기
		// - 자료형[] 변수명 = new 자료형 [길이];
		// - 배열타입[] 배열명 = new 배열타입[배열 길이];
		int[] kors = new int[3];
		
		// 배열의 방(요소, Element)에 접근하기 => 방 번호(index) 사용
		kors[0] = 100; // 방 하나의 자료형은 int
		kors[1] = 90;
		kors[2] = 80;
		
		
		int total = 0; // 누적
		for (int i = 0; i < kors.length; i++) {
			total += kors[i]; // 총점
		}
		
		
		double avg = (double)total / kors.length; // 속성, 필드, 프로퍼티
		
		System.out.printf("총점: %d, 평균: %.1f점\n", total, avg);
		
		
	}

	
	private static void m1() {
		// 요구사항: 학생 3명의 국어 점수를 저장해서 총점과 평균을 구하기
		// 수정: 학생 수 30명 -> 300명 (배열 사용)
		
		int kor1 = 100;
		int kor2 = 90;;
		int kor3 = 80;;
		
		int total = kor1 + kor2 + kor3; // 총점
		double avg = total / 3.0; // 평균
		
		System.out.printf("총점: %d, 평균: %.1f점\n", total, avg);
		
	}
}
