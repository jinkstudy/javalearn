package h_inherit_book;

// 부모 클래스

public class Item {
	String no;
	String title;
	
	Item(){
		System.out.println("Item 기본생성자");
	}
	
	Item(String no, String title){
		this.no=no;
		this.title = title;	
		System.out.println("Item 인자생성자");
	}
	
	public void output() {	}
	
}
