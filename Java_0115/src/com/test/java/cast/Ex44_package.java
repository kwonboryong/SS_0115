package com.test.java.cast;

import com.test.java.aaa.Red;
import com.test.java.bbb.Yellow;

public class Ex44_package {
	public static void main(String[] args) {
		
		/* 패키지 (package)
		   - 클래스를 저장하기 위한 폴더
		   - 많은 클래스들을 체계적으로 관리하기 위한 용도
		   
		   - 파일/폴더: C:\aaa\bbb\ccc
		   - 패키지: aaa.bbb.ccc
		   - .(점): 멤버 접근 연산자
		   
		   - 모든 코드는 자신과 같은 패키지 내에 있는 모든 요소들은 인식이 가능하다.
		   => 패키지가 다르면 인식 불가능!
		   
		   - import: 패키지 표현을 생략할 수 있도록 도와주는 것
		   
		   
		   패키지 + 접근 지정자
		   1. private
		   2. public
		   3. protected
		   4. (default)
		   
		   
		 */
		
		
		com.test.java.aaa.Red r1 = new Red();
		
		Yellow y1 = new Yellow();
		
		com.test.java.aaa.Yellow y2 = new com.test.java.aaa.Yellow();
		
		
		
	}

}
