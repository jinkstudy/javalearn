package h_inherit_book;
import h_inherit_book.sub.Item;
public class Dvd extends Item {

	String actor;
	String producer;

	public Dvd(){
		super(); //자동으로 super();가 추가되서 부모가 먼저 불러와짐. // super함수도 this함수처럼 제일 위에 줄에 있어야함.
		System.out.println("Dvd 기본생성자");

	}
	public Dvd(String no, String title, String actor, String producer){
		//super.no = no; //부모 멤버에 접근할 때 super로 접근해야함.
		//super.title = title;
		super(no,title); //위에 두 줄을 부모를 호출하는 method의 인자에 넣어서 호출 가능. 이렇게 추가 한경우, 기본생성자에도 super()호출을 해줘야한다.
		this.actor = actor; 
		this.producer = producer;
		System.out.println("Dvd 인자생성자");
	}
	public void output() {
		
		System.out.println("Dvd번호:"+no);
		System.out.println("Dvd제목:"+title);
		System.out.println("배우:"+actor);
		System.out.println("감독:"+producer);
		
		
	}

}
