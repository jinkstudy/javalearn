package b_operator;

import java.util.Scanner;

/*
 * 삼항연산자
 *   (조건)? A:B
 *   조건이 true이면 A실행하고 false이면  B실행한다. 
 */

public class Ex03_samhang {

	public static void main(String[] args) {

		//int score =75;
		//String result = (score>=80)? "합격" : "불합격" ;
		//System.out.println(result);
		
		// [문제] 두 수를 입력받아 큰 수를 출력 (삼항연산자 이용)
		
		System.out.println("두 수를 입력하세요");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int result = (a>b)? a : b;
		System.out.println(result+"가 크다");
		
		String result1 = (a>b)? a+"가 크다" : b+"가 크다";
		System.out.println(result1);
		
		

	}

}
