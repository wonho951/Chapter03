package com.javaex.ex03;

public class Rectangle {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//메소드 g/s
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
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	//메소드 - 일반
	public boolean equals(Object obj) {
		
		Rectangle r = (Rectangle)obj; //r은 비교대상
		
		int thisArea = this.width * this.height;
		
		if (this.width == r.width && this.height == r.height) {
			return true;			
		} else {
			return false;
		}
		
	}
	
	
}
