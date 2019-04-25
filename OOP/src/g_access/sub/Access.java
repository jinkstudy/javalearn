package g_access.sub; // g.access라는 폴더안에 sub라는 하위폴더 생성됨.

/*
 * 접근지정자
 * - private : 해당 클래스에만 접근 허용
 * - public : 모든 허용
 * - default(아무지정없는 경우) : 해당 패키지에만 허용
 * - protected : 다른패키지인 경우, 상속관계에만 허용
 * 				동일한 패키지는 모두 허용.
 * 
 *  private < default < protected  < public
 *  
 * 
 */

public class Access {
	private String a = "프라이빗 데이터";
	public String b = "퍼블릭 데이터";
			String c = "디폴트 데이터";
	protected String d = "프로텍티드 데이터";
	
	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}


