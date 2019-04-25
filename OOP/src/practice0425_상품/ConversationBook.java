package practice0425_상품;

//Book의 자식클래스

public class ConversationBook extends Book {
	String lang;
	public ConversationBook(){
		super();
	}
	public ConversationBook(int id, String guide, String producer, int price,
										String autor, String booktitle,int isbn,String lang)
	{
		super(id,guide,producer,price,autor,booktitle,isbn);
		this.lang = lang;
	
	}

	public void showInfo() {
		System.out.println("상품id>>"+id);
		System.out.println("상품 설명>>"+guide);
		System.out.println("생산자>>"+producer);
		System.out.println("가격>>"+price);
		System.out.println("저자>>"+autor);
		System.out.println("책제목>>"+booktitle);
		System.out.println("언어>>"+lang);
		System.out.println("ISBN>>"+isbn);

	}

}
