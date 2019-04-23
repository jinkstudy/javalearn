package e_method;

import java.util.Scanner;

public class Ex04_연습 {


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

			}else return false;
		}

	}