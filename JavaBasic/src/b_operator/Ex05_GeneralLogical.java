package b_operator;

import java.util.Scanner;

/*
 *  논리 연산자
 *        -일반논리(true/flase) : && ||
 *        -이진논리(bit에 있는 1/0) : & | ^(서로의 값이 다른 경우 1, ex) 복층의 스위치 같은 경우), AND가 OR보다 우선순위. 
 */
public class Ex05_GeneralLogical {

	public static void main(String[] args) {
		/*
		int 성적 = 75;
		char 태도 = 'A';
		
		
		//성적향상반 조건 - 80점이상이고 태도는 'A' 이여야 함.
		 if (성적>=80 && 태도=='A') {
			 System.out.println("성적향상반");
		}
		// 우등생 조건 - 성적은 80점 이상이거나 태도는 'A'이면 가능.
		 if(성적 >=80 || 태도 =='A') {
			 System.out.println("우등생");
		 }
		 */
		
		//문자 하나를 입력받아
		//(1) 대문자인지 출력
		//(2) 대문자인지 소문자인지 그외인지 출력
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요");
		char ch = input.next().charAt(0); //char 형을 입력받는 scanner 없다.==> string으로 받아서 문자 하나를 뽑는 charAt()함수로 char형으로 변경
		System.out.println("입력값:" + ch);
		
		if(ch>='A' && ch<='Z') { // 또는 if (Character.isUpperCase(ch) == true)
			System.out.println(ch+"는 대문자 입니다.");
		
		}else if(ch>='a' && ch<='z'){// 또는 if (Character.isLowerCase(ch) == true)
			System.out.println(ch+"는 소문자 입니다.");
			
		}else {
			System.out.println(ch+"는 영어가 아닙니다.");
	}
	
	}
	}
