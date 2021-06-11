package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p03 = p00;
		
		
		//getClass(): 클래스 정보
		System.out.println("===getClass()==============");
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("===========================");
		System.out.println("");
		
		
		
		//hashCode(): 주소--->주소에 대응되는 값
		System.out.println("===hashCode()==============");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("===========================");
		System.out.println("");
		
		
		
		
		//toString(): 객체의 정보
		System.out.println("===toString()==============");
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("===========================");
		System.out.println("");		
		
		
		
		
		
		//equals(): 객체가 같은지 비교
		System.out.println("===equals()==============");
		System.out.println(p01.equals(p02));
		System.out.println(p00.equals(p01));	//x, y의 값은 같음. 근데 false나옴. 정우성의 키, 유희열의 키 이걸로 생각해보기.
							//자료의 값이 같아도 다를 수 있으니까 좀 심오함.
		System.out.println(p00==p01);	//주소가 같냐고 물어봤는데 다름.
		System.out.println(p01==p02);	//주소가 같냐고 물어봤는데 다름.
		System.out.println(p00==p03);	//주소가 같냐고 물어봤는데 같음.
		System.out.println("===========================");
		System.out.println("");
		
		
		
	}

}
