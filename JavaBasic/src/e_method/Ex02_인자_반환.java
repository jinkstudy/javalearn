package e_method;

public class Ex02_인자_반환 {

	public static void main(String[] args) {
		// 데이터 입력받기
		int a = 10; 
		int b = 20; //main 함수에서 정의된 변수는 main 안에서만 쓴다.
		add(a,b); //a,b를 인자라고 한다.
	}

	static void add(int a, int b) { //int a, int b를 매개변수라고 한다, 매개변수와 인자의 자료형을 맞춰줘야한다.
		//입력받은 데이터의 합을 구해서 출력
		int sum =(a + b);
		System.out.println("합:" + sum);
	}

}
