package kh.java.func;

import java.util.Scanner;

public class LoopTest {
	public void test1() {
		// for를 이용한 무한반복 -> 초기,조건,증감 부분을 비워두면 됨
		for (;;) {
			System.out.println("무한히 반복 될 실행코드");
		}

	}

	public void test2() {
		// while를 이용한 무한반복 -> while의 조건식이 항상 true가 나올 수 있도록 처리
		while (true) {
			System.out.println("무한 히 반복 될 실행코드");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == 1) {
				break;// break는 즉시 반복문을 빠져나감
				// System.out.println("break");//break이후 코드는 동작하지 않으므로 코드작성이 불가능 -> 도달할 수 없는
				// 코드이므로
			} else if (num == 2) {
				continue;// 즉시 다음 반복회차로 이동(while에서는 조건검사, for 증감식)
				// System.out.println("continue");//continue이후 코드는 동작하지 않으므로 코드작성이 불가능
			} else {
				System.out.println("입력한 정수는 : " + num);
			}
			System.out.println("반복문 가장 마지막 부분");
		}
		System.out.println("while이 종료되면 출력되는 구문");
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "_정수입력 : ");
			int num = sc.nextInt();
			if (num == 1) {
				break;
			} else if (num == 2) {
				continue;
			} else {
				System.out.println("입력한 숫자는 : " + num);
			}
			System.out.println("반복문 가장 마지막 부분");
		}
		System.out.println("반복문이 종료되면 출력되는 부분");
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------카카오톡-------------");
			System.out.println("1. 친구목록");
			System.out.println("2. 채팅");
			System.out.println("3. 오픈채팅");
			System.out.println("4. 쇼핑");
			System.out.println("5. 종료");
			System.out.println("선택 > ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("여기에는 내 친구목록이 나올 예정");
			} else if (select == 2) {
				System.out.println("내 대화목록이 나올 예정");
			} else if (select == 3) {
				System.out.println("내가 참여한 오픈채팅 목록이 나올 예정");
			} else if (select == 4) {
				System.out.println("쇼핑 페이지가 나올 예정");
			} else if (select == 5) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		while (power) {
			System.out.println("-------------카카오톡-------------");
			System.out.println("1. 친구목록");
			System.out.println("2. 채팅");
			System.out.println("3. 오픈채팅");
			System.out.println("4. 쇼핑");
			System.out.println("5. 종료");
			System.out.println("선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("친구목록 나와라");
				break;
			case 2:
				System.out.println("채팅목록 나와라");
				break;
			case 3:
				System.out.println("쇼핑목록 나와라");
				break;
			case 4:
				System.out.println("친구목록 나와라");
				break;
			case 5:
				System.out.println("시스템이 종료됩니다.");
				power = false;// while 종료시키기 위한 값 변경
				break; // switch 종료
			// break; //while 종료 -> switch break가 동작하면 도달할 수 없는 코드라사 에러
			}// switch
		} // whlie
	}// 메소드

	public void test7() {
		// 중첩 for문
		for (int i = 0; i < 3; i++)
			;
		System.out.println(1 + "_반복문 1");
		for (int j = 0; j < 3; j++) {
			System.out.println(j + "_반복문 2");
		}
	}

	public void test8() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i : " + i + " / j : " + j);
			}
		}
	}

	public void test9() {

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 8; j++) {

				System.out.printf("%d*%d=%d\t", i + 2, j + 1, (i + 2) * (j + 1));
			}
			System.out.println();
		}
	}
	/*
	 * for(int i=0;i<9;i++) { System.out.printf("%d*%d=%d\t",3,i+1,3*(i+1)); }
	 * System.out.println(); for(int i=0;i<9;i++) {
	 * System.out.printf("%d*%d=%d\t",4,i+1,4*(i+1)); } System.out.println();
	 */

	public void test10() {

		for (int j = 0; j < 9; j++) {

			for (int i = 0; i < 8; i++) {

				System.out.printf("%d*%d=%d\t", i + 2, j + 1, (i + 2) * (j + 1));
			}
			System.out.println();
		}
	}

	public void star1() {
		for (int i = 0; i < 5; i++)
			;
		System.out.print("*");
	}

	public void star2() {
		for (int i = 0; i < 5; i++)
			;
		System.out.println("*");
	}

	public void star3() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

			}
			System.out.println("*");

		}
		System.out.println();
	}

	public void star4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
	}

	public void star5() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}

	public void star6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j + 1) + i);
			}
			System.out.println();
		}
	}

	public void star7() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j + 5) - i);
			}
			System.out.println();
		}
	}

	public void star8() {
		int o = 0;

		for (int i = 0; i < 5; i++) {
			++o;
			for (int j = 0; j < o; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		

	public void star9() {
		int o = 6;

		for (int i = 0; i < 6; i++) {
			--o;
			for (int j = 0; j < o; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void star10() {
		int o = 0;
		int oo = 6;

		for (int i = 0; i < 5; i++) {
			o++;
			--oo;
			for (int j = 0; j < (o - 1); j++) {
				System.out.print(" ");
			}

			for (int jj = 0; jj < oo; jj++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star11() {
		int o = 6;
		int oo = 0;

		for (int i = 0; i < 6; i++) {
			--o;
			++oo;
			for (int j = 0; j < o; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
