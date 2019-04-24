package e_method;

public class Ex07_CallByReference { 

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("행복하자");
		StringBuffer b = new StringBuffer("짝꿍님");
		String c = "하이";
		
		add(a,b,c);
		System.out.println("2. A="+a + ",B="+b+c+",C="+c);  //a=행복하자짝꿍님,b=짝꿍님 ,c=하이
		
		// StringBuffer는 참조형이므로 원본이 바뀐다. //CallByReference
		// String의 경우 기본형과 마찬가지로 새로운 메모리를 할당 하므로 원본이 바뀌지 않는다.

	}
	
	static void add(StringBuffer a, StringBuffer b,String c) {
		a.append(b);
		
		c+="안녕";
		System.out.println("1. A="+a+ ",B="+b+ ",C="+c); // a=행복하자 짝꿍님,b=짝꿍님, c=하이안녕
	}

}
