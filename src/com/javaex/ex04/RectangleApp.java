package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {

        Rectangle a = new Rectangle(6, 4);
        Rectangle b = new Rectangle(6, 4);
        Rectangle c = new Rectangle(12, 2);
        Rectangle d = new Rectangle(3, 8);
        Rectangle e = new Rectangle(12, 4);
				
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equals(e));
        System.out.println(d.equals(e));

        
        
        
        //System.out.println(a.toString());//재정의 안하면 Object에 있는거 출력됨.
        System.out.println(a.toString());	//걍 a만 찍는거랑 똑같음.
        System.out.println(a);
        //주소만 찍겠다는 뜻. 
        //println의 내부에서는 자연스럽게 toString을 찾음.
        //자식쪽에 toString이 있다면 자식에 있는 toString이 찍히고
        //자식쪽에 toString이 없다면 Object에 있는 toString찍음.
		
	}

}
