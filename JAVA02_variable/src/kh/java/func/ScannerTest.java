package kh.java.func;

import java.util.Scanner;

public class ScannerTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해보세요 : ");
		// 사용자 콘솔에 키보드 값을 입력하는 것을 기다림, 입력하고 엔터를 치면 입력한 내용을 정수형태로 가져옴
		int num = sc.nextInt();
		System.out.println("입력한 정수는 : " + num);
		System.out.print("실수를 입력하세요 : ");
		double dNum = sc.nextDouble();
		System.out.println("입력한 실수는 :" + dNum);
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		// 스캐너를 이용한 문자, 문자열 입력받기
		// 문자열 입력받을 때 : sc.next(), sc.nextLine() -> 두개 차이는 띄어쓰기 포함 여부
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();// 이름은 띄어쓰기 없이 입력할 예정으로 sc.next() 사용
		System.out.println("입력한 이름은 : " + name);
		System.out.print("주소를 입력하세요 : ");
		// sc.nextLine()은 반드시 버퍼를 비운 상태로 사용해야 함!!
		sc.nextLine();// 버퍼에 남아있는 엔터를 처리하는 목적
		String address = sc.nextLine();// 주소는 띄어쓰기를 포함해서 입력해야 하므로 sc.nextLine()
		System.out.println("입력한 주소 : " + address);

		// sc.nextLine() 사용할 때 확인사항
		// 1. 스캐너를 그 전에 사용한 적이 있는지
		// 직전에 사용한 스캐너가 sc.nextLine()이면 버퍼에 엔터가 없으므로 바로 사용
		// 직전에 사용한 스캐너가 sc.nextLine()이 아닌 경우 버퍼에 엔터가 있으므로 버퍼 비우고 사용
		// 2.스캐너를 사용한 적이 없으면 바로 사용

		// 문자 입력 받을 때 -> 문자를 직접 입력하는 방법은 없음
		// 문자열로 먼저 입력받고 -> 저장된 문자열에서 문자를 추출
		System.out.print("문자를 입력하세요 : ");
		String str = sc.next();
		System.out.println(str);
		str.charAt(1);
		// 문자열.charAt(숫자) : 문자열에서 숫자번째에 해당하는 글자를 문자타입으로 가져옴
		// 글자 위치를 셀때는 0부터 세야함!
		char ch1 = str.charAt(1);
		System.out.println(ch1);

	}
}
