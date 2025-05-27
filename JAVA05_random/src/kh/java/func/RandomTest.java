package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void test() {
		//Random : 무작위
		//자바에서 무작위 데이터를 제공하는 클래스 : Random
		//1.import java.util.Random;
		//2.Random r = new Random;
		Random r = new Random();
		int num1 = r.nextInt();//int 범위 내에서 무작위 숫자 1개르 가져옴
		System.out.println(num1);
		//r.nextInt()를 사용하면 정수 전체범위에서 무작위로 1개 
		//약 -21억 ~ 21억 사이의 무작위 수를 받음
		//->경우의 수가 너무 많아서 활용이 어려움 -> 경우의 수를 조절가능
		//r.nextInt(정수); : 해당 숫자 갯수만큼 범위에서 랜덤수 1개를 가져옴
		int num2 = r.nextInt(5);
		System.out.println(num2);

		int num3 = r.nextInt(13); //0~12
		System.out.println(num3);
		
		//0~26 사이의 랜덤수를 추출해서 num4에 저장한 후 출력
		
		int num4 = r.nextInt(27);
		System.out.println(num4);
		
		//1~10사이의 랜덤수를 추출해서 num5에 저장한 후 출력
		int num5 = r.nextInt(10) + 1;
		//범위 설정하는 방법
		//r.nextInt(숫자1)+숫자2
		//숫자 1 : 랜덤 경우의 수
		//숫자 2 : 랜덤 시작 숫자
		
		//10~30 사이의 랜덤 수를 추출해서 num6에 저장한 후 출력
		int num6 = r.nextInt(21) + 10;
		System.out.println(num6);
		
		//알파벳 소문자 중 랜덤한 문자 1개를 저장해서 출력
		char ch = (char)(r.nextInt(26) + 97);
		System.out.println(ch);
	}

	public void coin() {
		//동전 앞/뒤 맞추기 게임
		//컴퓨터가 동전을 던져서 앞/뒤 중에 하나의 값을 갖고있음 -> 사용자가 그걸 맞추는 게임
		Random r = new Random();//컴퓨터의 앞/뒤를 랜덤으로 결정하기 위해서 사용
		Scanner sc = new Scanner(System.in); //사용의 선택을 입력받기 위해 사용
		
		boolean power = true;
		int win = 0;
		int lose = 0;
		while(power) {
			System.out.println("========================동전 앞/뒤 맞추기=======================");
			System.out.println("1. 게임시작");
			System.out.println("2. 전적 보기");
			System.out.println("0. 게임 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				//컴퓨터가 동전을 던진다 -> 앞/뒤 중에 1개의 값을 가지면 됨 -> 경우의 수 2개
				//-> 앞면이면 1 / 뒷면이면 2 -> 필요한 랜덤수는 1~2
				int coin = r.nextInt(2)+1;
				System.out.print("골라보시오(1. 앞면) / 2. 뒷면) : ");
				int user = sc.nextInt();
				System.out.println("정답 : "+(coin==1?"앞" : "뒤"));
			  /*
				if(coin == 1) {
					System.out.println("정답 : 앞");
				}else {
					System.out.println("정답 : 뒤");
				}
			
				//System.out.println("정답 : "+coin);
				*/
				
				if(coin == user) {
					win++;
					System.out.println("정답입니다!!");
				}else {
					lose++;
					System.out.println("풉 킥ㅋ 그것도 못 맞추냐?");
				}
			
				break;
			case 2 : 
				System.out.println("WIN : "+win);
				System.out.println("LOSE : "+lose);
				break;
			case 0 : 
				power = false; //반복문을 멈추기 위한 변수 데이터 변경
				break;
			default : 
				System.out.println("잘못 입력하셨습니둥");
				break;
			}//switch
		}//while
	}//coin()

	public void coin2() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean power = true;
		int win = 0;
		int lose = 0;
		int draw = 0;
		while(power) {
			
			System.out.println("=================가위 바위 보 게임===================");
			System.out.println("1. 게임시작");
			System.out.println("2. 전적보기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				int com = r.nextInt(3) + 1;
				System.out.print("숫자를 선택하세요(1. 가위/2. 바위/3. 보)");
				int user = sc.nextInt();
				System.out.println("=================결과===================");
				
				
				if(user == 1) {
					System.out.println("당신은 가위를 냈습니다.");
				}else if (user == 2) {
					System.out.println("당신은 바위를 냈습니다.");
			    }else if (user == 3) {
			    	System.out.println("당신은 보를 냈습니다.");
			    }
		
				if(com == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다.");
				}else if (com == 2) {
					System.out.println("컴퓨터는 바위를 냈습니다.");
				}else if (com == 3) {
					System.out.println("컴퓨터는 보를 냈습니다.");
				}
					System.out.println("====================================");
				
				if(user == com) {
					++draw;
					System.out.println("비겼습니다.");
				}else if (user == 1 && com == 3) {
					++win;
					System.out.println("당신이 이겼습니다.");
				}else if (user == 2 && com == 1) {
					++win;
					System.out.println("당신이 이겼습니다.");
				}else if (user == 3 && com == 2) {
					++win;
					System.out.println("당신이 이겼습니다.");
				}else if (user == 1 && com == 2) {
					++lose;
					System.out.println("컴퓨터가 이겼습니다.");
				}else if (user == 2 && com == 3) {
					++lose;
					System.out.println("컴퓨터가 이겼습니다.");
				}else if (user == 3 && com == 1) {
					++lose;
					System.out.println("컴퓨터가 이겼습니다.");
				}
			    
				System.out.println();
				break;
			case 2:
				System.out.println("WIN : "+win);
				System.out.println("LOSE : "+lose);
				System.out.println("DRAW : "+draw);
				break;
			case 0:
				System.out.println("게임을 종료합니다.");
				power = false;
				break;
			default :
				System.out.println("잘못 입력하셨네여^^^^^^^");
				break;
			}
		}
	}


	public void game1() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean rep = true;
		boolean power = true;
		int num = 0;
		
		while(power) {
			System.out.println("========Up & Down Game=======");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				int num1 = 1;
				int com = r.nextInt(100)+1;
				System.out.println("<<<Game Start!>>>");
		
		 while(rep) {		
				System.out.printf("%d 회차 번호 입력 : ",num1);
				int user = sc.nextInt();
				if(com<user) {
					num++;
					System.out.println("<< DOWN >>");
				}else if (com>user) {
					num1++;
					System.out.println("<< UP >>");
				}else {
					System.out.println("<< 정답 >>");
					rep = false;
				}
				break;
		 }
			case 2:
				
				break;
			case 3:
				System.out.println("bye bye~~");
				power = false;
				break;
			default:
				System.out.println("잘못 입력하셨는뎁쇼????");
			}
	     }
	  }
   }















