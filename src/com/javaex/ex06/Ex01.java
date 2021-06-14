package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		//wrapper class
		Integer i01 = new Integer(10);	//--> Integer 곧 자바에서 없어질듯
		Integer i02 = new Integer(7);
		
		
		
		//int result = 10 + 7;	-->	이렇게 쓰던애
		//Integer result = new Integer(10) + new Integer(7);
		Integer result = i01 + i02;	//둘다 같은 뜻.
		
		
		
		System.out.println(result);
		
		
		
	}

}
