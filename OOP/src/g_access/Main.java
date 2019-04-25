package g_access; 
// 다른 패키지에 있는 클래스를 실행해보자
// 패키지가 다른 경우 public만 접근 가능.

import g_access.sub.Access;

public class Main {

	public static void main(String[] args) {
		Access me = new Access();
		// me.a = "프라이빗 변경"; //동일 클래스에서만 접근가능하므로 에러발생, 나머지는 접근 가능
		me.b = "퍼블릭 변경";
		//me.c = "디폴트 변경";  // 패키지가 다른 경우접근불가

		//me.d ="프로텍티드 변경";// 패키지가 다른 경우접근불가
		me.output();

	}

}
