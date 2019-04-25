package practice0425_상품;

public class CompactDisc extends Product {
	String albumtitle;
	String singer;

	public CompactDisc(){
		super();
	}
	public CompactDisc(int id, String guide, String producer, int price, String albumtitle, String singer){
		super(id,guide,producer,price);
		this.albumtitle = albumtitle;
		this.singer = singer;
		
	}

	public void showInfo() {
		System.out.println("상품id>>"+id);
		System.out.println("상품 설명>>"+guide);
		System.out.println("생산자>>"+producer);
		System.out.println("가격>>"+price);
		System.out.println("저자>>"+albumtitle);
		System.out.println("책제목>>"+singer);

	}


}
