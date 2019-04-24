package e_static;

/**
 * 
 * static 변수 : 각 객체에서 공유하려고.
 * 				메모리에 단 하나임.
 * 				*클래스명 접근가능 ( 그래서 static 변수 = 클래스 변수 )
 * 
 *
 */

public class Book {
	//int count;  //static이 없는 경우, class를 초기화 할때마다 count 메모리를 따로 확보한 후 새로 초기화. count = 1
	private static int count; // count = 3 하나의 count를 계속 같이 쓴다. // 메모리를 공유하고싶을 때 static을 쓴다.
	int temp; // static이 아닌 경우, Main에서 객체를 생성하는 순간에 메모리에 올라감. static인 경우 변수 선언 순간 메모리 할당 및 초기화.
	
	public Book() {
		count ++;
		System.out.println("책 한권 생성");
	}
	
	static public int getCount() { //초기 객체 생성 전에 class명으로 접근하고자 하면 getter도 static으로 만들어 줘야한다. 
		return count;
	}

}
