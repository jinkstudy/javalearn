package e_method;

public class Ex02_인자_반환2 {

	public static void main(String[] args) {
		int sum = add();
		System.out.println("합:" + sum);
	}
	
	static int add() { //void는 return값이 없다라는 것이므로 return과 함께 쓸 수 없다. 반환하는 값이 있다면 void대신 자료형을 써줘야 한다.
		int a = 10, b = 20;
		int sum= a + b;
		return sum;
	}
	// return : 흐름 main으로 반환
	// return 값 : 호출한 곳으로 딱 하나의 값을 반환

}
