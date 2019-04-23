package c_control;

import java.util.Scanner;
/*
//* do-while과 while의 차이점 *

//do-while과 while의 차이점은 일단 한번 먼저 실행하고, 조건을 판단한다.
// while은 조건은 먼저 판단 후 조건이 맞으면 실행한다.
		
		while(false){   
		         명령문
		}                    ==> 조건이 false인 경우 한번도 실행하지 않고 while문 빠져 나옴.
		              
		----------------
		do{
		       명령문
		}while(false);      ==> 조건비교를 나중에 하기 때문에, false이든 조건을 신경 쓰지 않고, 일단 한번을 실행함.

*/


public class Ex10_do_while {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		char result = '\0'; //문자 초기화. 원래 유니코드 0은 '\u0000'으로 써서 초기화해야하지만 다른 언어처럼 '\0'써도됨.

		do { 
			System.out.println("수를 입력하세요");

			int num = input.nextInt();		
			System.out.println(num+"단");
			int j=1;
			while(j<=9) {
				System.out.println(num+"x"+j+"="+(num*j));
				j++;
			}
			System.out.println("다시할래?(y|Y)");
			result = input.next().charAt(0);
		}
		while(result==('y'|'Y'));

	}

}
