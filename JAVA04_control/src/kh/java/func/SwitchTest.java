package kh.java.func;

import java.util.Scanner;

public class SwitchTest {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이 정수를 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("111111111");
			break;
		case 2:
			System.out.println("22222222222");
			break;
		case 3:
			System.out.println("3333333333");
			break;
		default:
			System.out.println("1~3 사이  숫자를 입력하세요.");
		}
	}
	/*
	 * switch (비교할 변수 or 계산식) { case 리터럴값 : 실행코드 break; case 리터럴값 : 실행코드 break; case
	 * 리터럴값 : 실행코드 break;
	 */

	/*
	 * if(num == 1) { System.out.println("111111111111111"); }else if (num == 2) {
	 * System.out.println("222222222222"); }else if (num == 3) {
	 * System.out.println("3333333333333"); }else {
	 * System.out.println("1~2 사이 숫자를 입력하세요".); }
	 * 
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("a/b/c중 1개를 입력하세요 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("aaaaaaaaaaa");
			break;
		case 'b':
			System.out.println("bbbbbbbbbbbbbb");
			break;
		case 'c':
			System.out.println("ccccccccccccccc");
			break;
		default:
			System.out.println("a/b/c중 1개를 입력하세요!");
			break;

		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		// switch에 문자열을 쓸 수 있는 것은 자바 1.7 버전 이상인 경우에만 가능하고 그 이전 버전에서는 사용이 불가능
		switch (str) {
		case "aa":
			System.out.println("aaaaaaaaaa");
			break;
		case "bb":
			System.out.println("bbbbbbbbbb");
			break;
		case "cc":
			System.out.println("ccccccccccc");
			break;
		default:
			System.out.println("zzzzzzzzzzzzz");
			break;
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");

		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("111111111");
			break;
		case 2:
			System.out.println("2222222222");// case가 실행 되고 나서 break가 없으면 다음 case를 자동으로 실행(조건검사 안 함)
			break;
		case 3:
			System.out.println("3333333333");
			break;
		default:
			System.out.println("00000000000");
			break;

		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("장학금 지불 시스템입니다");
		System.out.print("학점을 입력하세요(A,B,C,D,F) : ");

		String str = sc.next();
		char ch = str.charAt(0);
		switch (ch) {
		case 'A':
			System.out.println("수고하셨습니다. 장학금 100%를 지급 해드리겠습니다.");
			break;
		case 'B':
			System.out.println("아쉽군요. 장학금을 50% 지급 해드리겠습니다.");
			break;
		case 'C':
			System.out.println("장학금을 바라시면 좀 더 열심히 해주세요.");
			break;
		case 'D':
			System.out.println("크흠.............");
			break;
		case 'F':
			System.out.println("학사 경고입니다!!!!!!!!!");
			break;
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("일 수를 알고 싶은 달을 입력하세요 : ");

		int mon = sc.nextInt();

		switch(mon) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.printf("%s월 달은 31일까지 있습니다",mon);
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.printf("%s월 달은 30일까지 있습니다,",mon);
		case 2 :
			System.out.printf("%s월 달은 28일까지 있습니다",mon);
			break;
		//같은 결과값이 나오는 경우 break;를 일부러 사용하지 않고 바로 결과값이 나오게 할 수 있음.
		default :
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
	}
}











































