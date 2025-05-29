package kh.java.func;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void test() {
		//1,2,3,4,5 라는 5개 데이터를 각각 저장하고 출력
		//1) 변수를 이용한 처리 -> 데이터가 5개면 변수도 5개
		int num0 = 1;
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		System.out.println("변수를 이용한 값 출력");
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//2) 배열을 이용한 처리
		//배열 >> 동일한 자료형 여러개를 하나로 묶어서 인덱스로 관리
		//정수 5개를 저장할 배열 
		//배열 생성방법 >> 자료형[] 변수이름 = new 자료형[길이];
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("배열을 이용한 값 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("for문을 이용한 출력");
		//for문을 이용한 출력
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
			
		}
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		//길이가 5인 정수형 배열을 선언해서 순서대로1,2,3,4,5를 저장한 후 출력
		//1) 기본형태
		int[] arr1;       //정수형 배열의 주소를 저장할 변수 선언(참조형)
		arr1 = new int[5];//배열에 길이를 지정하는 행위 >> 할당
		//배열은 할당하면 기본값으로 데이터가 초기화 되어있음
		//기본값 : 정수(0), 실수 (0.0), 문자(' '), 논리형(false), 참조형(null >> 주소값이 비어있음)
		for(int i=0;i<5;i++) {
			System.out.println(i + ":" + arr1[i]);
		}
		//for문을 이용한 대입
		for(int i=0;i<5;i++) {
			arr1[i] = (i+1);
		}
		/*
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		*/
		System.out.println("------------------------------------");
		for(int i=0;i<5;i++) {
			System.out.println(i + " : " + arr1[i]);
		}
		System.out.println("-------------------------------------");
		//길이가 5인 정수형 배열을 선언해서 순서대로 데이터를 대입
		int[] arr2 = {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			System.out.println(i + " : " + arr2[i]);
	
	}
		System.out.println("-------------------------------------");
		//길이가 3인 문자열 배열을 만들어서 "hello", "hi", "bye"를 대입 후 출력
		String[] arr3 = new String[3];
		for(int i=0;i<3;i++) {
			System.out.println(i + ":" + arr3[i]);
		}
		arr3[0] = "hello";
		arr3[1] = "hi";
		arr3[2] = "bye";
		System.out.println("----------------------------------------");
		for(int i=0;i<3;i++) {
			System.out.println(i + ":" + arr3[i]);
		}
		System.out.println("----------------------------------------");
		String[] arr4 = {"hello","hi","bye"};
		for(int i=0;i<3;i++) {
			System.out.println(i + ":" + arr4[i]);
		}
	}
		
		public void fruit() {
			String[] arr = new String[5];
			arr[0] = "딸기";
			arr[1] = "복숭아";
			arr[2] = "키위";
			arr[3] = "사과";
			arr[4] = "바나나";
		System.out.println(arr[4]);
		
		String[] arr1 = {"딸기","복숭아","키위","사과","바나나"};
		
		System.out.println("----------------------------------------");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("----------------------------------------");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
		
		public void array() {
			int[] arr = new int[100];
			for(int i=0;i<100;i++) {
			  System.out.println(i+1 + arr[i]);	
			}
		}
		public void exam1() {
			int[] arr = new int[4];
			Scanner sc = new Scanner(System.in);
			String[] subject = {"국어","영어","수학"};
			for(int i=0;i<3;i++) {
				System.out.println(subject[i] + "점수입력 : ");
				arr[i] = sc.nextInt();
				arr[3] += arr[i]; 
			}
			
			/*
			System.out.print("국어 점수 : "+arr[0]);
			int kor = sc.nextInt();
			arr[0] = kor;
			//arr[0] = sc.nextInt();
			
			System.out.print("영어 점수 : "+arr[1]);
			int eng = sc.nextInt();
			arr[1] = eng;
			//arr[1] = sc.nextInt();
			
			System.out.print("수학 점수 : "+arr[2]);
			int math = sc.nextInt();
			arr[2] = math;
			//arr[2] = sc.nextInt();
			*/
			
			//arr[3] = arr[1] + arr[2] + arr[3];
			
			double sum = (double)arr[3]/3;
			
			for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
			}
			System.out.printf("%.2f",sum);
		
		}
	public void motel() { 
		Scanner sc = new Scanner(System.in);
		//방을 관리할 배열 >> 방은 총 10개 >> 길이가 10인 배열 생성
		//난이도 하 : 정수 >> 0이면 빈방, 1이면 손님이 있는 방
		//난이도 상 : 논리형 >> false 빈방, true 손님이 있는 방
		//int[] rooms = new int[10];//배열을 할당하면 기본값으로 세팅(정수 >> 0 >> 모두 빈방인 상태로 세팅)
		boolean[] rooms = new boolean[10]; 
		boolean power = true;
		while(power) {
			System.out.println("\n---------------모텔 관리 프로그램-------------------");
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 방보기");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1 : 
				//구현순서 2
				System.out.println("몇 번 방에 입실하시겠습니까?");
				int inroomno = sc.nextInt();
				//입실 >> 해당 방의 데이터를 1로 변경
				//입실 처리 전 해당 방에 현재 손님이 있는 지 체크 후 빈방이면 입실
				if(rooms[inroomno -1]) {
					System.out.println(inroomno + "번 방에 손님이 있습니다.");
				}else { 
					rooms[inroomno - 1] = true;
					System.out.println(inroomno + "번 방에 입실 했습니다.");
				}
				break;
			case 2 : 
				//구현순서 3
				System.out.print("몇 번 방에서 퇴실 하시겠습니까?");
				int outroom = sc.nextInt();
				if(!rooms[outroom-1]) {
					System.out.println(outroom + "번 방은 빈방입니다.");
				}else {
					rooms[outroom-1] = false;
					System.out.println("번 방에서 퇴실하셨습니다.");
				}
				break;
			case 3 : 
				//구현1순서 1
				for(int i=0;i<10;i++) {
					if(rooms[i]) {
						System.out.println((i+1)+"번 방에 손님이 있습니다");
					}else {
						System.out.println((i+1)+"번 방은 빈방입니다.");
					}
				}
				break;
			case 4 : 
				System.out.println("안녕히가세요.");
				power = false;
				break;
			}
		}
	}
	
	
		public void exam4() {
			Scanner sc = new Scanner(System.in);
			//int [] arr = {5,4,2,1,3};
			
			int[] arr = new int[5];
			//배열.lenght >> 현재 배열의 길이를 정수 형태로 가져옴
			for(int i=0;i<arr.length-1;i++) {
				System.out.print((i+1)+"번째 숫자 입력 : ");
				arr[i] = sc.nextInt();
			}
			
			//배열 0번 인덱스에 있는 수와,배열 1번 인덱스에 있는 수를 비교해서 0번 인덱스의 수가 더 크면 자리르 바꾸는 코드
			for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			  }
			}
			  
			/*
			for(int i=0;i<3;i++) {
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
			/*
			
			if(arr[0] > arr[1]) {
				int tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
			}
			if(arr[1] > arr[2]) {
				int tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
			}
			if(arr[2] > arr[3]) {
				int tmp = arr[2];
				arr[2] = arr[3];
				arr[3] = tmp;
			}	
			if(arr[3] > arr[4]) {
				int tmp = arr[3];
				arr[3] = arr[4];
				arr[4] = tmp;
			*/
				
			for(int i=0;i<5;i++) {
				System.out.print(arr[i]+"\t");
				
			}
		}
    

		
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int arr[] = new int[6];
		int com = r.nextInt();
		System.out.println("=====================로또 프로그램========================");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 번호 입력1(~45) : ");
			arr[i] = sc.nextInt();
			
			//로또번호 입력값 제약조건
			//1) 입력한 숫자가 1~45의 숫자여야 함
			//2) 입력 숫자는 중복 X
			//두 조건 중 입력한 숫자가 정상범위여야 중복체크 진행하는 순서로 작업
			//>> 입력한 숫자가 정상범위가 아니면 중복체크가 의미없음 >> 무조건 중복이 아니라고 나오니까
		if(1<=arr[i]&&arr[i]<=45) {
			//입력 범위가 정상 >> 중복체크
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					i--;
					System.out.println("이미 중복된 숫자입니다.");
					break;
				}
			}
		}else {
			//입력 범위가 비정상 >> 메세지 출력하고 이번회차 다시 입력받기
			i--;
			System.out.println("1~45 범위의 숫자를 입력하세요.");
		}
	}
		int[]comNum = new int[6];
		for(int i=0;i<comNum.length;i++) {
			comNum[i] = r.nextInt();
			for(int j=0;j<i;i++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		//사용자 번호 정렬
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j] > arr[j+1]) {
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
	      }
       }
		//컴퓨터 번호 정렬
		for(int j=0;j<comNum.length-1;j++) {
			if(comNum[j] > comNum[j+1]) {
				int tmp = comNum[j];
				comNum[j] = comNum[j+1];
				comNum[j+1] = tmp;
			}
		}
		System.out.println("===============최종결과================");
		System.out.println("사용자 번호 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("컴퓨터 번호");
		for(int i=0;i<comNum.length;i++) {
			
	
	}
		}
}
	
		
		
		
		
		
		


		
			
			
		
		
	
	

	
				
		
	

		
	 
	
			




