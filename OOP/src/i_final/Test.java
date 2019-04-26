package i_final;

/*
 *  final - 변경불가
 * 		final field(변수) - 값 변경 불가  --> 상수처리
 * 		final method -  overriding 불가.
 * 		final class - 상속불가. 
 */
class Parent{
	final String field = "부모님꺼";  
	final public void job() { //final method 오버라이딩 방지
		//field = "진짜내꺼"; //final인 경우 본인 클래스에서도 변경 불가.
		System.out.println("부모님께서 장만");
	}
}

class Child extends Parent{
	Child(){
		//field = "내꺼임";  // final인 경우 자식 class에서 변경 불가
	}
//	public void job() { //부모의 method가 final인 경우 ,자식 클래스에서 오버라이딩 방지
//		System.out.println("물려받아 탕진");
//	}
}
public class Test {

	public static void main(String[] args) {
	
		Parent p = new Child();
		System.out.println(p.field);
		p.job();
	}

}
