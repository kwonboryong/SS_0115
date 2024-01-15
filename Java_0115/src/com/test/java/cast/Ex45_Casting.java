package com.test.java.cast;

public class Ex45_Casting {
	public static void main(String[] args) {
		
		/* 형변환 (Type Casting)
		  1. 값형 형변환
		  - 값형끼리만 형변환 가능(boolean형 제외)
		  - byte, short, int, long, float, double, char
		  - 문제 발생: 오버 플로우(Over flow)
		  
		  2. 참조형 형변환
		  - 클래스끼리의 형변환
		  - 
		  
		  참조형 형변환
		  - 상속 관련
		  - 상속 관계에 있는 클래스끼리만 형변환 가능
		  - 직계끼리 => 가능
		  - 병계끼리(형제) => 불가능
		  
		  1. 업캐스팅 (Up Casting)
		  - 암시적 형변환
		  - 자식 클래스 -> 부모 클래스로 형변환
		  
		  2. 다운캐스팅 (Down Casting)
		  - 명시적 형변환
		  - 부모 클래스 -> 자식 클래스로 형변환
		   
		 */
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); // 원본: 자식 객체
		
		p1 = c1; // 복사 (자식 -> 부모) -> 암시적 형변환 발생
		p1 = (Parent)c1; // 원래 코드  => 생략 가능
		
		// 갑형 형변환 검증: 데이터 복사 후 복사본의 값 확인
		

		Parent p2;
		Child c2;
		
		p2 = new Parent(); // 원본
		
		// c2 = p2;// 복사 (부모 -> 자식) -> 불가능 (명시적 형변환 필요)
		c2 = (Child)p2; // 100% 불가능
		
		c2.a = 10;
		c2.b = 20;
		c2.c = 30; // 불가능 x
		c2.d = 40; // 불가능 x
		
		// -------------------------------------
		
		Parent p3;
		Child c3;
		
		c3 = new Child(); // 원본: child
		
		// 업캐스팅
		p3 = c3; // 자식 -> 부모		
		
		
		Child c4;
		c4 = (Child)p3; // 자식 -> 부모 (p3은 위에서 자식 객체가 됨)
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
	}

}

class Parent {
	public int a;
	public int b;
}

class Child extends Parent {
	public int c;
	public int d;
	
}

