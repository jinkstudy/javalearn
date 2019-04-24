package Practice;
/*
 * 문제2)  문자열처리하기
문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
N이 대문자이면 문자 N부터  Z까지 출력하라 
그 밖의 문자가 입력되면 Error 를 출력하라

입력  출력
f       abcdef
X       XYZ
6       Error
 */

import java.util.Scanner;

public class Day0417_for문_연습 {

	public static void main(String[] args) {
		
		// 문자 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("영문자를 입력하세요");
		char cha = input.next().charAt(0);
		
		System.out.print("출력값은 ");
		// 입력된 문자가 대문자인지, 소문자인지, 그외 인지 판단.
		if(cha >= 'a' && cha <= 'z') {
			
			for (char c = 'a'; c <= cha; c++) { // 소문자라면 a부터 해당문자까지 출력되도록.
				System.out.print(c);
			}
		}else if(cha>='A' && cha<= 'Z') {
			
			for (char c = cha; c <= 'Z'; c++) {// 대문자라면 해당문자부터 Z까지 출력되도록.
				System.out.print(c);
			}
		}else {
			System.out.println("Error"); // 그외라면 Error가 표시되도록.

		}
/*
 * 문제) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오. 
   
     입력 
     3  4   
     
     출력
     1 2 3 4
     2 4 6 8
     3 6 9 12		
 */		System.out.println(); 
 
   // 행과 열수 입력받기.
		System.out.println("행 수를 입력하세요");
		int row = input.nextInt();
	    System.out.println("열 수를 입력하세요");
		int column = input.nextInt();
		
		
		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= column*i; j+=i) {
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}
	/*
		//도전 문제
		// 사각형의 높이 n과 너비m을 입력 받은 후 n행 m열의 사각형 형태로
		//1부터 n*m번 까지 숫자가 차례대로 출력되는 프로그램을 작성하시오.
		*
		*/
		
		System.out.println("행 수를 입력하세요");
		int row2 = input.nextInt();
	    System.out.println("열 수를 입력하세요");
		int column2 = input.nextInt();
		
		
		for (int i = 1; i <= row2; i++) {
			for (int j = column2*(i-1)+1; j <= column2*i; j++) {
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}


	}
}


