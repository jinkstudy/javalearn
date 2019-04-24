package b_operator;

public class Ex06_BinaryLogical {

	public static void main(String[] args) {

		int a= 15, b=10;
		
		int and = a & b;
		int or = a | b;
		int xor = a ^b;
		
		System.out.println(and); //10
		System.out.println(or); //15
		System.out.println(xor); //5
	}

}
