package b_operator;

/*
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  >> : 오른쪽으로 이동
 *  << : 왼쪽으로 이동
 *  >>> : 오른쪽이동 ( 부호에 0 )
 *  
 */

public class Ex07_Shift {

	public static void main(String[] args) {

		int a = 4;
		System.out.println(a>>2); // 1
		System.out.println(a<<1); // 8
		
		int b = -4;
		System.out.println(b>>2); // 1
		System.out.println(b<<1); // 8
		System.out.println(b>>>1); //>>> 부호에 0이 들어가서 무조건 양수가 나옴.

	}

}
