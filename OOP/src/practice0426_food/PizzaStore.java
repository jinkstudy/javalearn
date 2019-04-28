package practice0426_food;

//DeliveryStore 인터페이스 구현.
public class PizzaStore implements DeliveryStore {

	private Food[] food =new Food[7];//Menu 갯수만큼 초기화.
	private String[] orderList; 

	//PizzaStore 생성자 실행 시 메뉴 및 가격 초기화.
	public PizzaStore(){

		String[] menu_list = {"치즈후라이피자","고구마피자","불닭피자","오븐파스타","치킨윙","생맥주","콜라"};
		int[]  price = {13000,14000,10000,8000,6000,7000,2000};

		for (int i = 0; i <7; i++) {
			food[i] = new Food(); //Food배열 안에서 각각 다시  menu_list와  price 배열로 구성되므로 초기화 해줘야한다. 까먹지말것!!!
			food[i].name = menu_list[i];
			food[i].price = price[i];

			//메뉴 및 가격 확인용
			System.out.println(food[i].name+ "      "+ food[i].price);
		}
	}
	//메인에서 사용자에게 입력받은 orderList를 매개변수로 받아서 클래스의 orderList 변수에 저장.
	public void setOrderList(String[] orderList) {

		this.orderList=new String[orderList.length]; 
		
		//최대 주문가능 수량 5개까지 조건.
		if(orderList.length <6){
			for (int i = 0; i < orderList.length; i++) {
				this.orderList[i]=orderList[i];
				//System.out.println(this.orderList[i]); //확인용
			}
		}else {
			System.out.println("최대 5개까지만 주문가능합니다. 다시 시작하세요");
			System.exit(0);
		}

	}
	//orderList에 있는 음식들의 가격을 합해서 총 가격 구하기.
	public int getTotalPrice(){
		int total = 0;
		int[]price=new int[orderList.length];

		// orderList랑 food.name과 비교해서 같은면 해당 index의 food.price를 합해서 총합을 구한다.
		for (int j = 0; j <orderList.length; j++) {
			for (int i = 0; i < food.length; i++) {
				if(food[i].name.equals(orderList[j]) ) {
					total+=food[i].price;

				}
			}
		}
		return total;
	}

}


