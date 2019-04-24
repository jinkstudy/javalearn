package e_method;

public class Ex07_CallByString {

	public static void main(String[] args) {
		String a = new String("행복하자");
		String b = new String("짝꿍님");
		
		
		add(a,b);
		System.out.println("2. A="+a + ",B="+b);  //a=행복하자짝꿍님,b=짝꿍님
		}
	//기본적인 논리는 callbyreference 이지만, 형태는 callbyvalue처럼 나옴. 그렇다고 해서 callbyvalue는아니고, 새로운 메모리를 할당함.
	
	static void add(String a, String b) {
		a+=b;
		System.out.println("1. A="+a+ ",B="+b); // a=행복하자 짝꿍님,b=짝꿍님
	}

}

