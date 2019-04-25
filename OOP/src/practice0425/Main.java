package practice0425;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		do {
		System.out.println("언어를 선택하세요(1.한국어 2.영어  3.일본어)");
		Scanner input = new Scanner(System.in);
		
		// 부모 class 변수 선언
		Language lang= null;
		char answer;
		
		int choice1 = input.nextInt();
		input.nextLine();
		
		//대답이 y이면 계속 반복하도록.
		
			//선택 옵션에 따라 어떤 자식클래스의 객체를 생성할지.
			switch(choice1){
			case 1: lang = new Kor(); break;
			case 2: lang = new Eng(); break;
			case 3: lang = new Japan(); break;
			}
			
			System.out.println("메시지를 선택하세요 (1.인사말 2.자기소개 3.하고싶은 말)");
			
			int choice2 = input.nextInt();
			
			//선택 옵션에 따라 어떤 메소드를 생성할지.
			switch(choice2) {
			case 1 : lang.greeting(); break;
			case 2 : lang.selfIntro(); break;
			case 3 : lang.saying(); break;
			}
			
			// 다시할 것인지 확인.
			
			System.out.println("다시 하시겠습니까?(Y/N)");
			 answer = input.next().charAt(0);
		}while(answer=='y');
		
	
	}

}
