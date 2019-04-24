package e_method;

public class Ex02_인자_반환3 {

	public static void main(String[] args) {
		int[] arr = add();
	
		// 합을 계산하기
		int sum = arr[0] + arr[1];	
		System.out.println("합:" + sum);

	}
	static int[] add() {
		int a=10, b=20;
		int [] arr = {a,b};
		return arr; //a와 b를 return하고 싶은데, return은 딱 하나만 반환할 수 있기 때문에, 배열로 만들어서 return 해야한다.
	}

}
