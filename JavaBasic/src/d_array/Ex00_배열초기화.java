package d_array;

public class Ex00_배열초기화 {

	public static void main(String[] args) {

		int a; //변수선언(기본형) - > 메모리 확보
		a = 10;// 값 지정.
		
		int b = 20; //초기화
		
		//-----------------
		//int [] arr; //변수선언(참조형) -> 메모리확보 x (New를 해야 메모리를 확보함), 현상태는 null
		//arr = new int[3]; // 객체생성 (메모리 확보)
		//arr[0] =10;
		//arr[1] =19;
		
		
		int[] arr;
		arr = new int[] {3,30,13}; //배열 초기화 // int [] arr= {3,30,13} 으로 써도 된다.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
