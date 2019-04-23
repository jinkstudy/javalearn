package e_method;

public class Ex05_overloading {
/*
 * overloading
 * 
 * 		: 동일한 이름의 메소드들
 * 		- 역할이 같은 메소드
 * 		- 인자의 자료형과 갯수가 달라야 한다. 
 * 
 * 	[주의할점] 
 * 		int add(int a, int b){ }
 * 		double add(int x, int b){ }
 * 
 *  위와 같이 메소드명, 인자의 자료형은 다 같고, return형만 다른 경우 컴파일 오류!!!
 */

	static void main(String[] args) {
		int a=5,b=7;
		add(a,b);
		int c= 3;
		double d = 3.6;
		add(c,d);
	}
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	static void add(int c, double d) {
		System.out.println(c+d);
	} 
}


