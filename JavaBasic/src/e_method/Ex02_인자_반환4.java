package e_method;

public class Ex02_인자_반환4 {

	static int a,b; //멤버변수,전역변수-main 밖에 선언 //main이 static이므로 static 선언 해줘야함.
	static int sum;
	//변수를 method 안에 선언하면 ==>지역변수, method 바깥쪽에 선언하면 ==>전역변수
	//전역변수에 선언하면 어떤 method에서라도 사용함.
	
	public static void main(String[] args) {
		a=10;
		b=20;
		add();
		System.out.println("합:"+sum);
	}
	
	static void add() {
		sum = a + b;
	}

}
