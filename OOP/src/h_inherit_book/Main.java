package h_inherit_book;

public class Main {

	public static void main(String[] args) {
		
//		Book b =  new Book();
//		b.output();
//		
//		System.out.println();
//		
//		Book b2 =  new Book("0001","자바","아무개","엔코아");
//		b2.output();
		
		Item i = null;
		
		System.out.println("항목을 선택하세요(1.Book 2.Dvd 3.Cd)-->");
		
		int sel = 3; //입력값
		
		switch(sel) {
		
		case 1: i = new Book("0001","자바","아무개","엔코아");break;
		case 2: i = new Dvd("0001","자바","배우","감독");break;
		case 3: i = new Cd("0001","자바","가수");break;
		
		}
		
			
		i.output(); // Class의 다형성. i의 자료형에 따라 생성되는 객체가 달라지고 그에 따라 output()값이 달라짐.
		
			// 다형성이 없다면, switch-case문으로 하나하나 출력해줘야함. 
		
		
		
		

	}

}
