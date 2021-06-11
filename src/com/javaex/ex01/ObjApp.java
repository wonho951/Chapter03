package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		//맛보기
		Object obj01 = new Object();
		System.out.println(obj01.hashCode());//int자료형이라 숫자출력  ---> 나중에 많이씀.
		System.out.println(obj01.getClass());//클래스에 관련된 정보
		System.out.println(obj01.toString());//object에 정의해둔 메소드.
		System.out.println(obj01.equals(obj01)); //boolean형임. true or false
		
		
		//getClass --> 클래스 정보
		System.out.println("=======obj.getClass()==========");
		System.out.println(obj01.getClass());
		System.out.println("===========================");
		
		
		//hashCode() --> 1차원적으로는 주소값(주소에 대응되는 중복되지 않는 값)
		System.out.println("=======obj.hashCode()==========");
		//System.out.println(obj01.hashCode());
		
		//여러개 올렸을때 실험 ---> 다 다른값 출력됨.
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		
		System.out.println("===========================");
		
		
		
		
		
		//toString() --> 객체의 값 정보 
		System.out.println("=======obj.hashCode()==========");
		System.out.println(obj01.toString());
		System.out.println("===========================");
		
		
		
		
		
		//equals() --> 객체가 같은지 비교
		System.out.println("=======obj.equalse(obj)==========");
		System.out.println(obj01.equals(obj01));
		System.out.println("===========================");
		
		
		
		
		
		
		
		
		
		/*
		//실험 - toString(Object의 toString 불러오기)
		Point p01 = new Point(100, 100);
		System.out.println(p01.toString()); //toSring 정의:: getClass().getName() + "@" + Integer.toHexString(hashCode())
		*/
		
		
	}

}
