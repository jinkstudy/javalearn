package b_operator;
/*
 * 증가 감소 연산자 : ++ , --
 */

public class Ex01_InDec {

	public static void main(String[] args) {
		/*
		int a=5, b=7;
		
		// System.out.println("A="+a+1+",B=" +b+1); // 결과 6, 8을 원했으나, 이것의 결과는 51,71이 나온다.
		System.out.println("A="+(a+1)+",B=" +(b+1));
		
		a = a+1; 
		b = b-1;
		System.out.println("A="+a+",B="+b);

		a++; //a = a+1; 와 동일
		b--; //b = b-1; 와 동일
		System.out.println("A="+a+",B="+b);
		
		++a;
		--b;
		System.out.println("A="+a+",B="+b);
		
		
		int result = ++a; //a를 먼저 증가 시킨 후 result에 대입.
		System.out.println("Result:" + result + ", A="+ a); //Result :6 A=6 
		
		int result2 = a++; //result에 대입한 후 a를 증가시킨다.
		System.out.println("Result:" + result2 + ", A="+ a); //Result :6 A=7 
		*/
		
		int a=5, b=7;
		System.out.println("A="+ ++a +",B="+ --b); // A=6,B=6
		System.out.println("A="+ a++ +",B="+ b--); // A=6,B=6
		System.out.println("A="+ a +",B="+ b); // A=7,B=5
		
	}

}
