package com.test.java.bbb.ccc;

import com.test.java.aaa.Red;

//  패키지가 달라고 자식 클래스에는 공개.
// 다른 패키지 + 자식 클래스
public class Blue extends Red {

	
	public void test() {
		
		this.a = 10;
		//this.b = 22;
		this.c = 30;
		this.d = 355;
		
		
		
	}
}
