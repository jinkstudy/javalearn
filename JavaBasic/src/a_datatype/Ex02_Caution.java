package a_datatype;
/*
 * 데이터 타입(자료형)
 * 1.기본형(primitive)
 * 		논리형 : boolean
 * 		문자형 : char
 * 		정수형 : int, long
 * 		실수형 : double
 * 		
 * 2.참조형(reference) : 클래스(class), 배열(array)
 * 		-> new 연산자를 이용해서 메모리 할당(확보) but, string의 경우 자주 사용하기 때문에  new를 생략할 수 있다.
 * 		ex) 문자열 : String
 * 
 */
public class Ex02_Caution {

	public static void main(String[] args) {
		
		// 실수형
		//float형  4byte, double 형  8byte--> 그래서 float형 자바에서는 안쓴다.
		// 굳이 쓰고 싶다면 float f; f=3.6F 이런식으로 F 추가 해주면 4byte로 변환해줌.
		double f;
		f= 3.6;
		System.out.println("실수:"+f);
		
		// 문자형- 정수형
		char ch; 
		ch = 65; //문자형에 정수 입력시 아스키 코드 자동 변환하여 보여준다.
		System.out.println("ch값: "+ch);
		
//		int i;
//		i = 'a';
		int i='a'; //정수형에 문자 입력 시 아스키 코드 자동 변환하여 해당 정수형을 보여준다.
		System.out.println("i값:"+i);
		
		long l = 10000000000L; // long형 사용시 소문자 l or 대문자 L을 붙여줘야 long형에 해당하는 8바이트로 변환. 그렇지 않으면 int 4byte로 인식하여 에러.
		System.out.println("l값:"+l);
		
		//형변환 - casting ( 메모리가 큰 자료형을 작은 자료형에 넣는 경우 주로 사용)
		double db = 100;
		System.out.println("db값:"+db); //메모리가 큰 자료형에 메모리가 작은 자료형을 넣는 것은 에러발생안함. 단, 메모리를 낭비할 뿐.
		
		int in =(int)100.1; // (int)와 같이 casting을 추가하여 형변환을 해주면 해당 자료형에 맞는 메모리로 변환해준다.
		System.out.println("in값:"+in);


	}

}
