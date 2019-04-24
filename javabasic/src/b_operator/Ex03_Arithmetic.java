package b_operator;

import java.util.*;

/*
 *  산술연산자 : * / % , + -
 */

public class Ex03_Arithmetic {

	public static void main(String[] args) {
		
		//1. 숫자 하나를 입력 받기 (Scanner - import java.util.*)
		//2. 홀수인지 짝수인지 연산하여 출력( % : 나머지 연산자)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int A = input.nextInt();
		
		if (A % 2 == 0) {
			System.out.println(A + "는 짝수 입니다.");			
		} else {
			System.out.println(A + "는 홀수 입니다.");	
		}
		
	}

}
