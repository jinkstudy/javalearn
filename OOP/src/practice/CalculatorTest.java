package practice;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		char answer;
		CalculatorExpr cal=new CalculatorExpr();
		Scanner input = new Scanner(System.in);

		do {
			//숫자 2개 입력받기
			System.out.println("첫번째 숫자를 입력하세요");
			cal.setNum1(input.nextInt());
			System.out.println("두번째 숫자를 입력하세요");
			cal.setNum2(input.nextInt());
			// 숫자 2개 출력
			System.out.println("추출된 문자는: "+cal.getNum1()+","+cal.getNum2()+"입니다.");
			//더하기 함수 호출
			
			System.out.println("덧셈 : "+cal.getAddition());
			//빼기 함수 호출
			
			System.out.println("뺄셈 : "+cal.getSubtraction());
			//곱하기 함수 호출
		
			System.out.println("곱셈 : "+cal.getMultiplication());
			//나누기 함수 호출
			
			System.out.println("나눗셈 : "+cal.getDivision());

			System.out.println("계속 하시겠습니까?(Y|N)");
			answer = input.next().charAt(0);
		} while( answer=='Y' );
		
		System.out.println("종료되었습니다.");





	}

}
