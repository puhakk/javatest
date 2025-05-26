package kh.java.func;

import java.util.Scanner;

public class WhlieTest {

	public void test1() {
		// 안녕하세요를 5번 반복해서 출력
		/*
		 * while(조건식) { 조건식이 true이면 실행되는 코드
		 */
		int i = 0;
		while (i < 5) {
			System.out.println("안녕하세요");
			i++;
		}

		/*
		 * for(int i = 0; i < 5; i ++) { System.out.println("안녕하세요"); }
		 */
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까?");
		int count = sc.nextInt();
		int i = 0;
		while (i < count) {
			System.out.println("안녕하세요1");
			i++;

		}

		int j = 0;
		do {
			System.out.println("안녕하세요2");
			j++;
		} while (j < count);

	}


	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		while(i < 5) {
			System.out.println("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;
			i++;
		}
	
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("두 번째 입력 : ");
		int num1 = sc.nextInt();
		int i = num;
		int sum = 0;
		
		while(i < num1+1) {
			sum += i;
			i++;
		
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d",num,num1,sum);
	}
	
	public void test5() {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while(i <= num) {
			
			sum += i;
			i++;
			i++;
			
		}
		System.out.println("짝수들의 합은 : "+sum);
	
	}
}
	
	


