package h_inherit_book;

public class Cd extends Item {

	String singer;


	public Cd(){
		super(); //자동으로 super();가 추가되서 부모가 먼저 불러와짐. // super함수도 this함수처럼 제일 위에 줄에 있어야함.
		System.out.println("Cd 기본생성자");

	}
	public Cd(String no, String title, String singer){
		//super.no = no; //부모 멤버에 접근할 때 super로 접근해야함.
		//super.title = title;
		super(no,title); //위에 두 줄을 부모를 호출하는 method의 인자에 넣어서 호출 가능. 이렇게 추가 한경우, 기본생성자에도 super()호출을 해줘야한다.
		this.singer = singer; 

		System.out.println("Cd 인자생성자");
	}
	public void output() {
		System.out.println("노래번호:"+no);
		System.out.println("노래제목:"+title);
		System.out.println("가수:"+singer);
	
		
		
	}

}
