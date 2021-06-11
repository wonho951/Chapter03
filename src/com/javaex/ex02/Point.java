package com.javaex.ex02;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 - g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반
	@Override
	public String toString() { //Object꺼 써봐야 의미 없으므로 재정의해서 사용.(오버라이드)
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	//equals는 이것보다 더 심오한경우도 있음.
	@Override
	public boolean equals(Object obj) {  //껍데기만 알려준거
		//안에 내용 채워야함.
		
		//boolean result; //if문안에 return 어색할때 사용
		
		//여기에 있는 x의 값과 Point obj의 x값이 같냐?고 물어봄
		//여기에 있는 y의 값과 Point obj의 y값이 같냐?고 물어봄		
		if (this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
			return true;	//여기서 리턴 나오면 끝임.이게 어색하
			//result = true;
		} else {
			return false;
			//result = false;
		}
		
		/*
		 // 다른방법
		    시선을 Point p로 옮겨줌.
		 Point p = ((Point)obj);
		 
		 if (this.x == p.x && this.y == p.y) {
		 	return true;
		 }else {
			return false;
			
		}
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
