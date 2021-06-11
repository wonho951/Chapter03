package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {		
		//String 자주쓰는 메소드 소개.
		//concat
		String a = new String(" abcd");
		String b = new String(",efg ");	//엄밀히 말하면 뒤에 공백도 출력됨
		
		
		a.concat(b);	//concat = 합치라는 뜻.
		
		System.out.println(a.concat(b));
		System.out.println(a);	//합쳤어도 원본은 안망가짐.
		System.out.println(b);
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		
		a = a.concat(b);	//a+b를 다시 a에 담으셈 -->문자열 붙이기
		System.out.println(a);	//a값이 합친채 고정됨.
		////////////////////////////////////////
		
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		
		//tirm --> 공백을 삭제
		a = a.trim();		
		System.out.println("----" + a + "----");	//--> 공백이 사라진후 출력
		System.out.println(a);
		
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		///////////////////////////
		//replace --> 바꾸기
		a = a.replace("ab", "12");	//ab를 12로 바꿔친다.
		System.out.println(a);
		
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		//////////////////////////
		//split
		String[] sArray = a.split(",");	// "," 기준으로 좌우로 짤라라 배열이기 떄문에 배열로 자료형 선언
								//12cd efg사이에 ,가 있기때문에 ,사라지고 쪼개짐
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		///////////////////////////
		//charAt --> 배열안에 있는 값이라고 생각하고 문자열 쪼개줌.
		String str = "Hello java!";
		
		System.out.println(str.charAt(6));
		
		
		
		///////////////////////////
		//substring --> 자료형 한개
		String result = str.substring(3);
		System.out.println(result);	//3번째 방부터 끝까지 출력
		
		//substring --> 자료형 두개인거
		String result2 = str.substring(3, 7);	//시작점, 끝--> x~x까지 끊는다.
		System.out.println(result2);	//3~7번방까지만 출력
		
		
		
		
		
		
	}

}
