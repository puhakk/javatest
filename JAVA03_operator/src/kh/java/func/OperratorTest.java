package kh.java.func;

import java.util.Scanner;

public class OperratorTest {
	public void test1() {
		// 산술연산자(+,-,*,/,%)
		// 대입연산자(=) : a = b; -> b라는 값을 a라는 공간(변수)에 대입
		// 복합대입 연산자 : 산술연산자와 대입연산자가 합쳐진 형태의 연산자
		// +=,-=,*=,/=,%=
		// 현재 변수에 들어있는 데이터를 산술연산해서 변수에 다시 대입하는 연산자
		int num = 10;
		System.out.println("num : " + num);
		num += 5; // num = num + 5;
		System.out.println("num : " + num);
		num *= 3; // num = num * 3;
		System.out.println("num : " + num);
	}

	public void test2() {
		int num = 10;
		// 증감연산자(++,--) : 단항연산자 -> 변수 하나에 사용하는 연산자
		System.out.println("num : " + num);
		num++;// num 변수의 값을 1 증가시킴
		System.out.println("num : " + num);
		++num;// num 변수의 값을 1 증가시킴
		System.out.println("num : " + num);
		num--;// num 변수의 값을 1 감소시킴
		System.out.println("num : " + num);
		--num;// num 변수의 값을 1 감소시킴
		System.out.println("num : " + num);
		// 증감연산자가 단독으로 사용 되면 위치가 앞/뒤 상관없이 결과가 동일
		// 변수++ : 후위연산 -> 인접연산이 있으면 인접연산을 수행하고 증감이 동작
		// ++변수 : 전위연산 -> 인접연산이 있으면 증감을 수행하고 인접연산 수행
		int num1 = 10;
		int num2 = num1++ + 2;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		int a = 10;
		int b = 10;
		int c = (a++) + (++b) + a;
		// a : 11, b : 11, c : 32
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}

	public void test3() {
		// 관계연산자(<, >, <=, >=)
		// 10 < 20 -> 맞아(true)/틀려(false)
		// 10 > 20 -> 맞아(true)/틀려(false)
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		boolean bool1 = num1 < num2;
		System.out.println("bool1 : " +bool1);
		boolean bool2 = num1 > num2;
		System.out.println("bool2 : " +bool2);
		boolean bool3 = num1 <= num2;
		System.out.println("bool3 : " +bool3);
		boolean bool4 = num1 >= num2;
		System.out.println("bool4 : " +bool4);
		boolean bool5 = num1 == num2;
		System.out.println("bool5 : " +bool5);
		boolean bool6 = num1 != num2;
		System.out.println("bool6 : " +bool6);
	}
		
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번재 정수 입력 : ");
		int num3 = sc.nextInt();
		System.out.print("네 번째 정수 입력 : ");
		int num4 = sc.nextInt();
		
		boolean result1 = num1 < num2;
		boolean result2 = num3 < num4;
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		boolean result3 = result1 && result2;
		boolean result4 = result1 || result2;
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		boolean result5 = !result1;
		System.out.println("result5 : "+result5);
	}
		
		public void test5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수 입력 : ");
			int num2 = sc.nextInt();
			/*
			 삼향연산자
			 (1) ? (2) : (3)
			 (1) : 논리값(조건식)			 
			 (2) : (1)의 논리값이 true 인 경우 여기에 있는 코드가 실행
			 (3) : (1)의 논리값이 false 인 경우 여기에 있는 코드가 실행
	        */
			int result1 = num1 > num2 ? num1 : num2;
			System.out.println("result : "+result1);
			
			boolean check = num1 > num2;
			int result2 = check ? num1 : num2;
			System.out.println("result2 : "+result2);
			
			System.out.println("result3 : "+ (num1 > num2 ? num1 : num2));
		
			String str = num1> num2 ? "num이 더 큼" : "num2가 더 큼";
			System.out.println(str);
		
			System.out.println( num1 > num2 ? num1 : "num2가 더 큼");
	
		
		
	}
}