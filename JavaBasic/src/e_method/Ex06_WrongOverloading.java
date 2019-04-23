package e_method;
/*
 * 아래 코드는 컴파일 오류!!
 * 
 * 아래와 같이 두개의 method는 인자의 자료형, 갯수 및  method 이름은 같고 반환 자료형 만 다른 경우 
 * 컴파일 오류가 발생하므로, 오버로딩의 경우가 아니므로 다른이름의 method로 각각 만들어줘야한다.
 * 오버로딩은 인자의 자료형이나 갯수가 다른경우에만 사용가능하다.
 *  
 */
public class Ex06_WrongOverloading {

	public static void main(String[] args) {

		String msg = "안녕";
		output1(msg);
		String result = output2(msg);
		System.out.println(result);
	}
	
	static void output1(String msg) {
		System.out.println(msg);
	}
	
	static String output2(String msg) {
		String result ="맛점"+msg;
		return result;
	}


}
