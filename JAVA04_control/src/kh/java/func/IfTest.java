package kh.java.func;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 10을 입력하세요 : ");
		int num = sc.nextInt();
		/*
		 * if(논리형데이터 or 조건식){ 논리형데이터 or 조건식의 결과가 true면 실행 될 코드(false면 실행되지 않음)
		 */
		if (num == 10) {
			System.out.println("참 잘했어요.");

		}
		System.out.println("끝!");
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===============숫자 구별 프로그램========================");
		System.out.print("임의의 정수를 입력 하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("당신이 입력한 수" + num + "은(는) 양수입니다.");
		}
		if (num == 0) {
			System.out.println("당신이 입력한 수" + num + "은(는) 0입니다.");
		}
		if (num < 0) {
			System.out.println("당신이 입력한 수" + num + "은(는) 음수입니다.");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("================두수 비교 프로그램===============");
		System.out.print("첫 번재 정수를 입력 하세요 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 정수를 입력 하세요 : ");
		int num1 = sc.nextInt();

		if (num < num1) {
			System.out.println(num + "<" + num1);
			System.out.print("두 번째수가 더 큽니다");

			System.out.println("=================두수 비교 프로그램================");
			System.out.print("첫 번째 정수를 입력 하세요 : ");
			System.out.println("두 번째 정수를 입력 하세요 : ");
		}

		if (num == num1) {
			System.out.println(num + "=" + num1);
			System.out.print("두 수가 같습니다.");

			System.out.println("=================두수 비교 프로그램================");
			System.out.print("첫 번째 정수를 입력 하세요 : ");
			System.out.println("두 번째 정수를 입력 하세요 : ");
		}
		if (num > num1) {
			System.out.println(num + "=" + num1);
			System.out.println("첫 번째 수가 더 큽니다");
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===============계산기 프로그램=================");
		System.out.print("연산자를 입력 하세요(+,-,*,/) : ");
		String str = sc.next();
		char ch = str.charAt(0);

		System.out.println("첫 번째 정수를 입력 하세요 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 정수를 입력 하세요 : ");
		int num1 = sc.nextInt();

	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력한 정수가 홀수/짝수인지 출력 (삼항연산자가 아니라 if를 이용해서)
		// -> 짝수 판별방법 -> 숫자를 2로 나눴을 때 나머지가 0이면 짝수, 아니면 홀수
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int num1Price = 15000;
		int num2Price = 5000;

		System.out.println("==============놀이공원 프로그램==============");
		System.out.print("입장하실 총 인원은 몇명입니다? : ");
		int num = sc.nextInt();

		System.out.println("어른은 몇명입니까?(1인당 " + num1Price + "원) : ");

		int num1 = sc.nextInt();

		System.out.println("아이는 몇명입니끼?(1인당 " + num2Price + "원) : ");
		int num2 = sc.nextInt();
		// 금액계산을 해서 알려줄지 아니면 인원 틀린 지 실행흐름이 달라짐
		// 총 인원 수와 어른 인원 아이 인원 합친 인원 수가 같은지 체크

		if (num == num1 + num2) {
			System.out.printf("지붏하실 총 금액은 %d원 입니다.", num1 * num1Price + num2 * num2Price);
		} else {
			System.out.println("인원 수가 맞지 않습니다.");
		}
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===============퀴즈 프로그램==================");
		int count = 0;
		System.out.println("첫 번재 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1.apple, 2.스티브잡스)? : ");
		int num = sc.nextInt();

		String endNum = "정답!!";
		String endNum1 = "땡!!";

		if (num == 1) {
			count = 1;
			System.out.println("정답!!");
		} else {
			System.out.println("땡!!");

			System.out.println("두 번째 퀴즈");
			System.out.print("바나나는 길어 길으면 기차 기차는(1.비싸, 2.빨라)? : ");
			int num1 = sc.nextInt();

			if (num1 == 2) {
				// count += 1;
				count++;
				System.out.println(endNum);

			}
			System.out.println("총" + count + " 문제를 맞췄습니다.");

		}
	}

	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("1을 입력하셨군요!!!!!!!!");
		}
		if (num == 2) {
			System.out.println("2를 입력하셨네요@@@@@@@");
		} else if (num == 3) {
			System.out.println("3이네?########");
		} else {
			System.out.println("1~3 사이의 정수를 입력하세요.");
		}

		/*
		 * if (num == 1) { System.out.println("1을 입력하셨군요!!!!!!!!"); } if (num == 2) {
		 * System.out.println("2를 입력하셨네요@@@@@@@"); } if (num == 3) {
		 * System.out.println("3이네?########"); } if (num < 1 || num > 3) {
		 * System.out.println("1~3 사이의 정수를 입력하세요.");
		 */

	}

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		if (num > 1000) {
			System.out.println("1000보다 큰 수 입니다.");
		} else if (num > 100) {
			System.out.println("100보다 큰 수 입니다.");
		} else if (num > 10) {
			System.out.println("10보다 큰 수 입니다.");
		}
	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================대/소문자 변환 프로그램==================");
		System.out.print("문자입력 : ");
		String text = sc.next();
		char ch = text.charAt(0);
		
	
		System.out.println("===========결과===========");
		
		if('A' <= ch && ch <= 'Z' ) {
			System.out.println("대문자를 입력 하였습니다.");
			//대문자 -> 소문 : 대문자 + 32
			System.out.println("소문자로 변환 : "+(char)(ch+32));
		}else if('a' <= ch  && ch <= 'z' ) {
			//소문자 -> 대문자 : 소문자 - 32
			
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : "+(char)(ch-32));
		}else {
			System.out.println("잘못 입력하셨습니다. 영문자를 입력해주세요.");
			
		}			
	}
}
	
	
	


