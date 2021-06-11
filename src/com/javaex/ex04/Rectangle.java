package com.javaex.ex04;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//메소드-g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	//메소드-일반 
	//데이터 테스트
	@Override //이거 없으면 Object에 있는거 나옴.
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	//메소드 - 일반
	
	//사각형 면적 값 같음을 재정의
	public boolean equals(Object ob) {
				
		Rectangle r01 = (Rectangle)ob; 
		int thisRect = this.width * this.height; //본인 가로*세로
		int thatRect = r01.width * r01.height;	//들어오는 가로*세로
		
		if (thisRect == thatRect) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
