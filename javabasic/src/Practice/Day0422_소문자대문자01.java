package Practice;
/*
 * (문제 1) 영문자를 입력하여 이 문자가 소문자이면true 반환 대문자이면 false 반환하는 메소드를 작성하시오. 
  함수명 : checkLower
  인자 : char
  리턴(반환) : boolean

 */

import java.util.Scanner;

public class Day0422_소문자대문자01 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("영문자를 입력하세요.");
		char letter=input.next().charAt(0);

		boolean result=checkLower(letter);
		System.out.println("결과는 "+result+" 입니다.");

	}
	static boolean checkLower(char letter) {


		if (letter>='a' && letter<='z') {
			return true;

		}else  return false;
	}

}




