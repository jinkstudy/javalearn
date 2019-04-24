package Practice;
/*
 * 
(문제 2) 영문자를 입력하여 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
  함수명 : checkUpper
  인자 : char
  리턴(반환) : char
 * 
 */

import java.util.Scanner;

public class Day0422_소문자대문자02 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("영문자를 입력하세요.");
		char letter=input.next().charAt(0);
		System.out.println(letter);
	}
	static char checkLower(char letter) {


		if (letter>='a' && letter<='z') {
			letter-=32;
			return letter;
			
		}else return letter;

	}

}
