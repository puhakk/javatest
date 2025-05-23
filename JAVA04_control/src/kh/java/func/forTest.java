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
		for (int i = 0; i < 7 ; i++) {
			System.out.println("안녕하세요");
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력하시겠습니까?");
		int num = sc.nextInt();
		
		System.out.println("2단 입니다.");
		for (int i = 0; i < ; i++) {
			
		}
	}
}
