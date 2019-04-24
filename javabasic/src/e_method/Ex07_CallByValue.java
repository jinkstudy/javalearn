package e_method;

public class Ex07_CallByValue {

	public static void main(String[] args) {
		int a =10, b=20;
		add(a,b);
		System.out.println("2. A="+a + ",B=" +b); //a=10, b=20; 
	}
	static void add(int a, int b) { //main에 선언된 변수를 복사해와서 쓰는 것이지 해당 변수를 그대로 쓰는 것이 아니다.  
		a+=b;
		System.out.println("1. A="+a + ",B=" +b);//a=30, b=20;
	}

}
