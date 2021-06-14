package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		//wrapper class
		Integer i01 = new Integer(10);	// --> Integer 곧 자바에서 없어질듯
		Integer i02 = new Integer(7);	// --> 정석 사용법, 개념잡을때 이게 맞음 ㅇㅇ
		
		
		
		//int result = 10 + 7;	-->	이렇게 쓰던애
		//Integer result = new Integer(10) + new Integer(7);
		Integer result = i01 + i02;	//둘다 같은 뜻. --> int result =10 + 7;
		System.out.println(result);
		
		
		int i10 = 7;
		Integer i11 = 10;	    //Interger i11 = new Integer(10);	--> 주소 들어감. 둘다 같음.
		
		
		Integer i100 = 15;	//--> 박싱 된상태.
		int i101 = i100;	//--> i100과 i101은 자료형이 다름. 그러나 i100의 값을 int자료형인 i101에 넣어줌. 
							//--> integer의 박스 까서 int에 넣어줌. --> 언박싱
		
		System.out.println(i101);
		
		
	}

}
