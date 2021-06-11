package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01 == s02);//주소가 다르기때문에 false나옴
							//단편적인 비교
		//s01 = null; ---> 주소에 갈수가 없어서 NullPointerException(에러) 나옴.
		System.out.println(s01.equals(s02));
							//equals는 논리적인 비교
		
		
		System.out.println("========================================");
		System.out.println("String 약식사용");
		System.out.println("");		
		
		String s03 = "hello";	// new String("hello") 이게 정석.
		String s04 = "hello";	// new String("hello") 이게 정석.
		//String 약식으로 사용하면 같은 값이 있는지 찾음.있으면 같은 주소를 가르킨다.
		System.out.println(s03 == s04);	//주소비교 
		System.out.println(s03.equals(s04));	//본인하고 본인 비교하는거랑 마찬가지.
		
		System.out.println(s03);
		System.out.println(s04);
		
		System.out.println("========================================");
		System.out.println("String 값 바꾼경우");
		System.out.println("");		
		
		s03 = "hello!!!!!!!!!!";
		System.out.println(s03);	//s03의 값을 바꾼대로 출력
		System.out.println(s04);	//s04는 hello 그대로 출력
		
		
		System.out.println(s03 == s04);	// s03을 수정했기때문에 s03의 새로운 주소값을 새로 만듦. 
		System.out.println(s03.equals(s04));	//s03의 주소값이 바뀌었기때문에 false출력
		

		
		
		
		
		
		
	}

}
