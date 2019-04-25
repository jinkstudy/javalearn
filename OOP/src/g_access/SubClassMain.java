package g_access; 
// 다른 패키지에 있는 클래스를 실행해보자
// 패키지가 다른 경우 public만 접근 가능.

import g_access.sub.Access;

public class SubClassMain extends Access { //Access가 부모클래스, SubClassMain이 자식클래스로 상속받는것.

	public static void main(String[] args) {
		SubClassMain me = new SubClassMain(); // 상속받은 후 자식클래스로 상속받아야 한다.
		// me.a = "프라이빗 변경"; //동일 클래스에서만 접근가능하므로 에러발생, 나머지는 접근 가능
		me.b = "퍼블릭 변경"; 
		//me.c = "디폴트 변경";  // 패키지가 다를때 상속받아도,접근 불가능
		me.d ="프로텍티드 변경"; // 패키지가 다르지만 상속받았기 때문에 접근 가능
		me.output();

	}

}
