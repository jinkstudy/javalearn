package h_inherit_book.sub;

// 부모 클래스

public class Item {
	 protected String no; // 부모클래스와 다른 패키지일때 자식클래스에게 접근 권한을 주고싶을때. protected
	 protected String title;
	
	public Item(){
		System.out.println("Item 기본생성자");
	}
	
	public Item(String no, String title){
		this.no=no;
		this.title = title;	
		System.out.println("Item 인자생성자");
	}
	
	public void output() {	}
	
}
