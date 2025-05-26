package kh.java.func;

import java.util.Scanner;

public class forTest {
	public void test() {
		/*
		 * for문 사용 방법 초기값 설정 : 반복횟수를 조절하기 위한 변수 선언 및 초기화 작업 조건식 : 반복문의 수행여부를 결정하는 조건식
		 * (최종적으로 boolean형 데이터로 연산이 끝나며, true 코드 실행, false면 for종료) 증감식 : 초기값에서 사용하는 변수를
		 * 조작해서 조건식을 이용해서 횟수를 조절하기 위한 증가/감소 구문 for(초기값 설정; 조건식; 조건변화를 위한 증감식){
		 */
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			System.out.println("Hi");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
	}

	public void test1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번 출력 하시겠습니까? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void test3() {
		for (int i = 0; i < 7; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력하시겠습니까?");
		int num = sc.nextInt();

		System.out.println("2단 입니다.");
		for (int i = 0; i < 9; i++) {
			System.out.println("2 * " + (i + 1) + " = " + (2 * i + 2));
		}
	}

	public void exam1() {
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 입력 받은 정수의 총 함은 누적해서 저장하기 위한 변수 / 시작은 0

		for (int i = 0; i < 5; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num; // sum = sum + num;

		}
		System.out.println("입력하신 변수의 총 합은 : " + sum);

	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.print("첫 번째 수 입력 : ");
		int num = sc.nextInt();

		System.out.print("두 번째 수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = num; i <= num1; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", num, num1, sum);
	}

	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			if(i%2 == 0) {
			sum += i;
			}
		System.out.println("총 합은 : "+sum);
		
		}
	}
		public void exam4() {
			for(int i = 5; i>0; i--) {
				System.out.println(i + "_HI");
			
			
			}
		}
	}

