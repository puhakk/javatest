package kh.java.func;

import java.util.Scanner;

public class ArithmeticTest {
	public void test1() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("첫 번째 수 입력 : ");
	 int num = sc.nextInt();
	 System.out.print("두 번재 수 입력 : ");
	 int num1 = sc.nextInt();
	 System.out.print("=================결과=================");
	 
	System.out.println();
	System.out.printf("두 수를 더한 수 : %d\n",num + num1);
	System.out.printf("두 수를 뺀 수 : %d\n",num - num1);
	System.out.printf("두 수를 곱한 수 : %d\n",num * num1);
	System.out.printf("두 수를 나눈 수 : %f.2\n",num / num1);
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		int a = 40, b = 20;
		a =+ b ;
		System.out.printf("a의 값 : %d , b의 값 : %d\n", a, b);
		a -= b ;
		System.out.printf("a의 값 : %d , b의 값 : %d\n", a, b);
		b *= a;
		System.out.printf("a의 값 : %d , b의 값 : %d/n", a, b);
		b /= a; 
		System.out.printf("a의 값 : %d , b의 값 : %d/n", a, b);
		
	}
   public void test3() {
	   Scanner sc = new Scanner(System.in);
	   int a = 10 , b = 20, c = 30, d = 40;
	   boolean result1, result2;
	   result1 = ((a < 20 && b > 10) && (c == 20 || d == 40));
	   result2 = ((a == 10 && b != 2 * 10) || (c == 20 || d == 40));
	   System.out.printf("첫 번째 결과값 %b \n", result1);
	   System.out.printf("두 번째 결과값 %b \n", result2);
	   
   }

   public void test4() {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("나이를 입력하세요 : ");
	   int num = sc.nextInt();
	   
	   
   }
   
}


