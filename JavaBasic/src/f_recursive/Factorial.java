package f_recursive;

public class Factorial {

	// 5! = 5*4*3*2*1 = 120
	public static void main(String[] args) {

		int value = factorial(5);
		System.out.println(value);

	}
	
	static int factorial(int i) {

		if(i==1) return 1;
		return i*factorial(i-1);
	}
}
