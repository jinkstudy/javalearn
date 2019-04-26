package practice0426_food;

import java.util.Scanner;
import java.util.StringTokenizer;

import c_array.Student;

public class PizzaStore implements DeliveryStore {

	Food[] food =new Food[7];
	int n;
	String[] orderList=null;

	public PizzaStore(){

		String[] menu_list = {"김치찌개","된장찌개","파전","불고기","소주","맥주","막걸리"};
		int[]  price = {5000,5000,10000,15000,4000,4000,5000};

		for (int i = 0; i <7; i++) {
			food[i] = new Food();
			food[i].name = menu_list[i];
			food[i].price = price[i];
			System.out.print(food[i].name+",");
		}

	}



	public void setOrderList(String[] orderList) {
	
		for (int i = 0; i < orderList.length; i++) {
			this.orderList[i]=orderList[i];
		}
	}

	public int getTotalPrice(){
		int total = 0;
		int[]price=new int[n];

		for (int j = 0; j <n; j++) {
			for (int i = 0; i < food.length; i++) {
				if(food[i].name == orderList[j]) {
					total+=price[i];
				}
			}
		}
		return total;
	}





	//
	//	public String[] orderList(int n, String[] menu) {
	//		String[] list = new String[n];
	//
	//
	//
	//		return list; 
	//	}









}
