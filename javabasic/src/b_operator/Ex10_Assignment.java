package b_operator;

/*
 * 대입연산자: = 
 *        -축약대입연산자 (산술/이진논리/쉬프트) 
 */

public class Ex10_Assignment {

	public static void main(String[] args) {
	
		int a = 10, b=7;
		a+=b; //a=a+b;
		System.out.println("A=" + a);// A=17
		a-=b; //a=a-b;
		System.out.println("A=" + a); // A=10
		a*=b; //a=a*b;
		System.out.println("A=" + a); // A=70
		a%=b; //a=a%b;
		System.out.println("A=" + a); // A=0
		a/=b; //a=a/b;
		System.out.println("A=" + a); // A=0
	}

}
