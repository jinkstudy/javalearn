package practice0425_상품;


// 부모클래스. 
public abstract class Product {

	protected int id;
	protected String guide;
	protected String producer;
	protected int price;

	public Product(){

	}
	public Product(int id, String guide, String producer, int price){
		this.id=id;
		this.guide=guide;
		this.producer = producer;
		this.price = price;
	}


	public abstract void showInfo();
	
}
