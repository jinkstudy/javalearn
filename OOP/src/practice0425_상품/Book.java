package practice0425_상품;

//Product의 자식클래스, ConversationBook의 부모클래스

public class Book extends Product {
	int isbn;
	String autor;
	String booktitle;
	
	public Book(){
		super();
	}
	public Book(int id, String guide, String producer, int price, String autor, String booktitle,int isbn){
		super(id,guide,producer,price);
		this.autor = autor;
		this.booktitle = booktitle;
		this.isbn=isbn;
		
	}


	public void showInfo() {
		System.out.println("상품id>>"+id);
		System.out.println("상품 설명>>"+guide);
		System.out.println("생산자>>"+producer);
		System.out.println("가격>>"+price);
		System.out.println("저자>>"+autor);
		System.out.println("책제목>>"+booktitle);
		System.out.println("ISBN>>"+isbn);
		
	}

}
