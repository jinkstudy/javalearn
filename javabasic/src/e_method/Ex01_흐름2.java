package e_method;

public class Ex01_흐름2 {

	public static void main(String[] args) { //main도 method 임.
		System.out.println("main 시작");
		
		//Class를 선 호출 한 후, ex.method()로 호출해야함.
		Ex01_흐름2 ex = new Ex01_흐름2();
		ex.method(); //method를 생성한 후 main 안에서 호출을 해야 실행이 된다.
		System.out.println("main 끝");

		//실행 순서
		//JVM main 인식 -- >method에게 제어권을 넘겨줌-->method 실행 -- > 다시 main으로 돌아옴.
		//method안에 return이 있는 경우, 끝까지 수행하지 않고 return을 만나면 main으로 돌아감.
		
	}
	//static없이 method 사용하기 위해서는 main안에 객체를 생성해서 호출해야함. 9행 10행 참조할 것.
   void method() { //method 생성 
		System.out.println("method 실행");
	}
}
