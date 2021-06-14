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
		
		
		//정수--> 문자열로 바꾸는거 예제
		System.out.println("-정수를 문자열로 바꾸는거---------------------------");
		
		String str = new String("hi");
		String strResult = str.valueOf(123456);	//123456 --> "123456"으로 바꿈.
		System.out.println(strResult);
		
		
		//정수--> 문자열로 바꾸는거 실제사용
		String strResult2 = String.valueOf("123456");
		System.out.println(strResult2);
		
		
		
		// 정수--> 문자열로 많이 사용
		System.out.println("-정수를 문자열로 바꾸는거(개발자들이 많이 사용)---------------------------");
		String strResult3 = "" + 9876;		//9876 --> "9876" --> 어색해하지 말것.
		System.out.println(strResult);
		
		
		String str2 = "hi";	//new String("hi")랑 비스무리 하지만 주소찾는중
		
		
		//문자입력시 프로그램 종료된다고 가정할때
		System.out.println("---------------------------");
		
		String yn = "y";	//사용자가 입력한 값.
		//String yn = new String("y"); --> 이거랑 같음.
		yn=null;	//-->yn의 값이 y가 아닌 다른값이 들어갈때를 가정.
		
		
		
		if(yn.equals("y")) {	//이렇게 많이 비교함. y값이 비어있을때는 위험함.
			System.out.println("게임 다시 시작");
		}
		
		//더 안전한 경우(equals())사용팁. --> null포인트 상황이 발생하지 않는다.
		if("y".equals(yn)) {	//입력된 값과 yn을 비교함.
			System.out.println("게임 다시 시작");
		}
		
		
		
		
		//다른 기본 자료형
		Byte b = new Byte((byte)3);	//쓸일 거의 없음.
		Short s = new Short((short)1);
		
		
		
		
		
		
	}

}
