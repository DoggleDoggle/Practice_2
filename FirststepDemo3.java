package org.primitive.elementary.first;

public class FirststepDemo3 {

	public static void main(String[] args) {
		
		
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
			
			
			System.out.println("============================================");
			
			
			int var1 = 0b1011;
			int var2 = 0206;
			int var3 = 365;
			int var4 = 0xB3;
			
			System.out.println("var1:"+var1);
			System.out.println("var2:"+var2);
			System.out.println("var3:"+var3);
			System.out.println("var4:"+var4);
			
			System.out.println("============================================");

			byte N_1 = -128;
			byte N_2 = -30;
			byte N_3 = -0;
			byte N_4 = 30;
			byte N_5 = 127;
			//byte N_6 = 128;   Type mismatch: cannot convert from int to byte
			
			System.out.println(N_1);
			System.out.println(N_2);
			System.out.println(N_3);
			System.out.println(N_4);
			System.out.println(N_5);
			
			System.out.println("================char=================================");
			
			long B_1 = 10;
			long B_2 = 20L;
			//long B_3 = 100000000000;   The literal 100000000000 of type int is out of range
			long B_4 = 100000000000L;
			
			System.out.println(B_1);
			System.out.println(B_2);
			System.out.println(B_4);
			
			System.out.println("=======================================================");
			
			char B_11='A';
			char B_12='B';
			char B_13='가';
			char B_14='각';
			
			char c = 65;  //10진수
			char d = 0x0041; // 16진수
			
			System.out.println(B_11);
			System.out.println(B_12);
			System.out.println(B_13);
			System.out.println(B_14);
			
			System.out.println(c);
			System.out.println(d);
			
			System.out.println("=========================================================");
			
			String name = "홍길동";
			String job = "프로그래머";
			System.out.println(name);
			System.out.println(job);
			
			String str = "나는 \"자바\"를 좋아합니다.";  //탈출문자
			System.out.println(str);
			
			String str_2 = "번호\t이름\t나이";
			System.out.println(str_2);
			
			String str_3="아이스크림\n초콜릿";
			System.out.println(str_3);
			
			System.out.println("==========================================================");
			System.out.println("번호\t이름\t직업");
			System.out.println("행 단위 출력\n");
			System.out.println("행 단위 출력\n");
			System.out.println("우리는\"개발자\"입니다.");
			System.out.println("풀\\꽃\\바람\\대지");
			
			System.out.println("-----------------------------------------------------------");
			//float var_11 =3.14; //컴파일 에러 Type mismatch: cannot convert from double to float
			double var_12 = 3.14;
			double var_13 = 314e-2;
			
			System.out.println(var_12);
			System.out.println(var_13);
			
			//float var_14 = 3.14; //Type mismatch: cannot convert from double to float
			float var_15 = 3.14f;
			float var_16 = 3E6F;
			
			
			
		}
		
	}

}
