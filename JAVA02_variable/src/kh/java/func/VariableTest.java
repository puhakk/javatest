package kh.java.func;

public class VariableTest {
	public void test1() {
		//기본자료형 8개
		//논리형(boolean), 문자형(char), 정수령(byte,short,int,long), 실수형(float,double)
		//참조자료형
		//문자열(String)
		
		//변수 선언 : 컴푸터의 메모리중 일정영역을 데이터 저장용도로 사용하겠다라고 알림
		//변수 선언하는 방법 -> 자료형 변수 이름;
		//1. 논리형 변수 선언
		boolean bool;
		//2. 문자형 변수 선언
		char ch;
		//변수는 선언하면 최초에 쓰레기 값이 들어있는 상태 -> 바로 사용하는 것이 불가능
		//변수에 데이터를 한번 대입 해줘야 사용이 가능 -> 최초에 한번 데이터를 대입하는 행위를 변수의 초기화
		// =은 이제부터 같다가 아니라 대입연산자
		// A = B; -> B라는 데이터를 A라는 변수에 대입
		//'a' 를 ch 변수에 대입
		ch = 'a';
		System.out.println(ch);
		//논리형 변수에 데이터 대입
	
		bool = true; // 논리형은 사용데이터가 2개 (true/false)
		//System.out.println(num1); // 변수는 선언 이후에 사용해야 함
		//정수형 변수 선언
		int num1;
		//System.out.println(num1); // 변수는 선언 이후에도 초기화를 한 후 사용해야 함
		//num1 변수에 10이라는 데이터를 대입
		num1 = 10;
		System.out.println(num1); // 변수를 사용하면 해당 변수에 들어있는 데이터를 복사해서 가져옴
		num1 = 100;               // 변수에 다른 데이터를 대입하면 해당 데이터로 변경
		System.out.println(num1);
		//대입 연산자 기준으로 오른쪽을 먼저 연산 
		//-> 현재 num1에 저장된 데이터를 복사해서 + 100 연산을 한 결과를 num1 변수에 대입
		num1 = num1 + 100;
		System.out.println(num1);
		//4. 실수형 변수 선언(double), 변수이름은 num2, 값은 3.14로 초기화 후 출력
		double num2;
		num2 = 3.14;
		System.out.println(num2);
	    //4. 실수형 변수 선언(double), 변수이름은 num2, 값은 3.14로 초기화 후 출력
		//변수를 선언하면서 바로 초기화 하는 작업
		double num3 = 3.14;
		
	}
		public void test2() {
			int num1 = 1000;
			long num2 = 200000000000l;
			double num3 = 3.14;
			float num4 = 3.14f;
			System.out.println(num1);
			num1 = 2000;  //일반 변수는 값은 다시 대입하면 새로운 값으로 변경
			System.out.println(num1);
			//변수 선언 시 final 키워드를 앞에 붙이면 일반 변수가 아닌 상수형 변수
			//상수형 변수의 특징은 한번 값을 초기화 하고 난 뒤 값 변경이 불가능
			//일반변수는 변수이름을 카멜표기법으로 작성하지만, 상수형 변수는 구분 위해서 모두 대문자로 작성
			final int NUM5;
			NUM5 = 200;
		    System.out.println(NUM5);
		    //NUM5 = 300; // 초기화 후 값 변경하려고 하면 에러가 발생
	        	
		}
		public void test3() { 
			int num = 2147483647;
			long result = (long)num + 1;
			System.out.println(result); //2147483648
			
			//강제형변환 해야하는 경우(큰 자료형 데이터를 작은자료형에 넣을 때)
			//강제형변환은 데이터의 유실을 체크해야 함
			int num2 = 290;
			byte num3 = (byte)num2;//num2의 데이터를 강제로 byte 타입으로 변환
			System.out.println(num3);
			
			//자동으로 형변환 되는 경우 (작은 자료형을 큰 자료형에 넣을 때)
			byte num4 = 100;
			int num5 = num4;
			System.out.println(num5);	
		}
			
		public void test4() {
			//System.out.println(); // 괄호 안의 내용을 출력 개행(엔터)
			//System.out.ptint();//괄호 안의 내용을 출력
			System.out.println("안녕하세요.");
			System.out.print("제 이름은 ");
			System.out.println("조하늘 입니다.");
		
		    System.out.println("-----------------------------");
		    //
		    System.out.print("안녕하세요.");
		    System.out.println();
		    //System.out.print(); print의 경우 ()안에 반드시 데이터를 넣어줘야 함
		    System.out.print("제 이름은 ");
		    System.out.print("조하늘 입니다.");
		    System.out.println();
		    //간단실습
		    /*
		     자바의 기본 자료형
		     논리형(boolean), 문자형(char), 정수형(int, long), 실수형(float), 문자열(String)
		     */
		    //실습문제 : 변수를 3개 선언 -> 이름(문자열), 나이(int), 주소(문자열)   
		    //각변수에 본인의 이름,나이,주소를 대입
		    //최종 출력 예 
		    //안녕하세요. 제 이름은 조하늘이고, 나이는 24살 사는 곳은 서초구 태봉로 2길 30 입니다.
		   
		    
		    String name = "조하늘";
		    int age = 24;
		    String address = "서초구 태봉로 2길 30";
		    
		    System.out.print("안녕하세요.");
		    System.out.print(" 제 이름은 ");
		    System.out.print(name);
		    System.out.print("이고, 나이는 ");
		    System.out.print(age);
		    System.out.print("살 사는 곳은 ");
		    System.out.print(address);
		    System.out.println("입니다.");
		}
		    		
		    public void test5() {
		    	String name = "조하늘";
		    	int age = 20;
		    	String address = "서울시 서초구";
		    	System.out.println("안녕하세요 제 이름은 "+name+"이고, 나이는 "+age+"살 사는 곳은 "+address+"입니다.");
		    	//System.out.ptintf();
		    	System.out.printf("안녕하세요 제 이름은 %s이고, 나이는 %d살 사는 곳은 %s입니다.",name,age,address);
		    	
		}
		    public void test6() {
		    	int num = 100;
		    	//-> 정수는 : 100
		    	System.out.print("정수는 : ");
		    	System.out.print(num);
		    	System.out.println();
		    	System.out.println("정수는 : "+num);
		    	System.out.printf("정수는 : %d",num);
		    	System.out.println();
		    	double doubleNum = 3.14;
		    	System.out.printf("실수는 : %f", doubleNum);//%f는 소수 6째 자리까지 출력
		    	System.out.println();
		    	//소수점 자리수를 조절하고 싶은 경우
		    	System.out.printf("실수는 : %.2f", doubleNum);
		    	System.out.println();
		    	System.out.printf("정수는 : %d",200);
		    	System.out.println();
		    	//문자, 문자열 처리
		    	char ch = 'A';
		    	System.out.printf("문자 : %c",ch);
		    	System.out.println();
		    	String str = " Hello";
		    	System.out.printf("문자열 : %s", str);
		    	System.out.println();
		    	
		    	System.out.printf("%c%s%d%f", ch,str,num,doubleNum);
		    	System.out.println();
		    	//오늘 우리반 출석률은 100%입니다.
		    	int number = 100;
		    	System.out.printf("오늘 우리반 출석률은 %d%%입니다.",number);
		    	System.out.println();
		    	//print,println에서는 %는 특별한 의미가 없음
		    	System.out.println("오늘 우리반 출석률은 "+number+"%입니다.");
		    	
		    	//제 이름은 "조하늘" 입니다.
		    	System.out.println("제 이름은 \"조하늘\" 입니다");
		    	System.out.println("제이름은\t조하늘\n입\\니다.");
		    }
		    public void exam1() {
		    	int num1 = 100;
		    	long num2 = 999999999999l;
		    	float num3 = 486.520f;
		    	double num4 = 5697.890123;
		    	char ch = 'A';
		    	String str = "Hello JAVA";
		    	boolean bool = true;
		    	System.out.printf("정수형 %d",num1);
		    	System.out.println();
		    	System.out.printf("정수형 %d",num2);
		    	System.out.println();
		    	System.out.printf("실수형 %f",num3);
		    	System.out.println();
		    	System.out.printf("실수형 %f",num4);
		    	System.out.println();
		    	System.out.printf("문자 %c",ch);
		    	System.out.println();
		    	System.out.printf("문자열 %s",str);
		    	System.out.println();
		    	System.out.printf("논리 %b",bool);
		  
		    }
		    public void exam2() {
		    	String name = "조하늘";
		    	int age = 24;
		    	char gender = '여';
		    	String address = "서울";
		    	String number = "01033334444";
		    	String email = "sksslssn@gmail.com";
		  
		    	String name1 = "이설항";
		    	int age1 = 23;
		    	char gender1 = '여';
		    	String address1 = "인천";
		    	String number1 = "01055556666";
		    	String email1 = "leeeseol6@gmail.com";
		    	
		    	System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		    	System.out.println("----------------------------------------------------------------");
		    	System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,address,number,email);
		    	System.out.println();
		    	System.out.println("-----------------------------------------------------------------");
		    	System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name1,age1,gender1,address1,number1,email1);
		    	
		    	
		    	
		    			
		    	
		    	
		    }
		    
		    	
		    
		    }
