package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		/*
		Object obj01 = new Object(); //디폴트 생성자가 있다는 소리
		
		System.out.println(obj01.toString());
		*/
		
		
		
		//실험 - toString(Object의 toString 불러오기)
		Point p01 = new Point(100, 100);
		System.out.println(p01.toString()); //toSring 정의:: getClass().getName() + "@" + Integer.toHexString(hashCode())

		
		
	}

}
