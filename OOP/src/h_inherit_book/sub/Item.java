package h_inherit_book.sub;

// 부모 클래스

public abstract class Item {
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
	
	//public void output() {	}
	public abstract void output(); //{ } : 함수표시는 아무일도 하지 않지만 완벽한 함수 구현. 
									//	아무일도 하지 않으므로 {}없이 사용하려면 미완성 함수라는 정보를 주기위해 abstract를 붙여준다.
									// abstract 메소드를 하나라도 가지고 있으면, 클래스도 abstract가 되어야한다.
									// abstract 메소드는 자식클래스에 무조건 오버라이딩 되어야한다. 해당 메소드를 오버라이딩하고 싶지 않다면, 자식클래스 자체를 abstract로 만들어줘야함. 
									// 부모 클래스가 abstract일때 꼭 abstract 메소드를 가지고 있어야 하는 것은 아니다.
	
}
