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
		
		
		
		int i10 = 7;	//i10. --> 이런거 없음,자료형이 int이고 값이 있기때문에.
		i01.intValue();	//-->	메소드가 보임. 메모리에 박스 형태로 올라가있음--> 메모리맵 생각좀하자 제발.
		
		
		
		//박싱
		Integer i11 = 10;	    //Interger i11 = new Integer(10);	--> 주소 들어감. 둘다 같음.
		
		
		//언박싱
		int i101 = i11;	//--> i100과 i11은 자료형이 다름. 그러나 i11의 값을 int자료형인 i101에 넣어줌. 
							//--> integer의 박스 까서 int에 넣어줌. --> 언박싱
		
		System.out.println(i101);
		
		
		//Integer의 메소드	
		//"12345" --> 12345 예제
		System.out.println("-문자열을 정수로 바꾸는거---------------------------");
		
		Integer i999 = new Integer(999);	//	static이기 때문에 굳이 메모리에 올릴 필요가 없음.
		int num = i999.parseInt("12345");	//	문자열 12345가 int형인 숫자 12345로 바뀜.-->문자열 안에 숫자 말고 문자가 들어가면 안됨.
		System.out.println(num);
		
		
		//"12345" --> 12345 실제 사용
		int num2 = Integer.parseInt("12345");	// --> 실제로는 이렇게 사용함. 가장 많이 사용함.
		System.out.println(num2);
		
		
	}

}
