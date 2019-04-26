package practice0426_food;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("메뉴를 확인하세요");
		
		PizzaStore order=new PizzaStore();
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요 ex)파전,막걸리");
		String menu=input.next();
		StringTokenizer sr = new StringTokenizer(menu,",");
		
		String[] orderlist= new String[5];
		for (int i = 0; sr.hasMoreTokens(); i++) {
			orderlist[i] = sr.nextToken();
		}
		
		order.setOrderList(orderlist);
		int total = order.getTotalPrice();
		System.out.println("총 금액은 " + total);
	

	}

}
