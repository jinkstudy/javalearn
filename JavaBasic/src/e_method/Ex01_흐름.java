package e_method;

public class Ex01_흐름 {

	public static void main(String[] args) { //main도 method 임.
		System.out.println("main 시작");
		method(); //method를 생성한 후 main 안에서 호출을 해야 실행이 된다.
		System.out.println("main 끝");

		//실행 순서
		//JVM main 인식 -- >method에게 제어권을 넘겨줌-->method 실행 -- > 다시 main으로 돌아옴.
		//method안에 return이 있는 경우, 끝까지 수행하지 않고 return을 만나면 main으로 돌아감.
		
	}
	// 우선은 java의 main함수가 static이므로  static은 메소드에서 static만 접근 가능한 걸로 이해.
	
	public static void method() { //method 생성 
		System.out.println("method 실행");
	}
	
	

}
