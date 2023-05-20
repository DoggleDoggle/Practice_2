package org.primitive.elementary.first;

public class FirststepDemo2 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+",y:"+y);
		
		//x:3,y:5 출력
		
		int temp = x;  //x에는 3이라는 값이 들어있음 3을 temp에 넣음 temp=3
		x = y;			// y 에는 5가 들어있고 5를 x에 넣음
		y = temp;		//temp에는 3이 들어있음  따라서 y = 3
		System.out.println("x:"+x+",y:"+y);  //x:5,y:3 츨력
		
		System.out.println("==============================================");
		
		int value = 10;
		int sum = value +20;
		System.out.println(sum);
		

	}

}
