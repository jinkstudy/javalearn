package b_operator;

/*
 * Not : 결과를 반대로 하는 연산자.
 *     - 일반논리(true/false) : !
 *     - 이진논리(비트의 값: 0/1) : ~
 */

public class Ex02_Not {

	public static void main(String[] args) {

		boolean result = 3>4;
		System.out.println(result); //false
		System.out.println(!result); //true
		
		int a= 15;
		System.out.println(~a); // ~는 0을 1로, 1을 0으로 변경.//2의 보수 
		

	}

}
