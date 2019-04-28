package practice0426_food;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("메뉴를 확인하세요");
		
		//PizzaStore 변수, 객체생성
		PizzaStore order=new PizzaStore();
		System.out.println();System.out.println();
		//사용자 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요 ex)치즈후라이피자,고구마피자");
		String menu=input.next();
		//입력받은 내용 분리하여 orderlist 배열에 저장.
		StringTokenizer sr = new StringTokenizer(menu,",");

		String[] orderlist= new String[sr.countTokens()];//sr.countTokens() Token갯수 반환해주는 메소드.
		for (int i = 0; sr.hasMoreTokens(); i++) {
			orderlist[i] = sr.nextToken();
		}

		System.out.println();
		
		//orderlist를 setOrderList의 매개변수로 저장.수행
		
		order.setOrderList(orderlist);
		
		//getTotalPrice 메소드 수행 반환 값 total변수에 저장.
		int total = order.getTotalPrice();
		System.out.println("선택한 메뉴를 확인하세요");

		for (int i = 0; i < orderlist.length; i++) {
			System.out.println(orderlist[i] + " " );
		}
		System.out.println();
		System.out.println("총 금액은 " + total+"원 입니다.");


	}

}
