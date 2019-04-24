package d_array;

public class Ex03_큰값구하기 {

	public static void main(String[] args) {

		int [] arr = {90,15,13,7,35,25};
		
		// 이 중에서 가장 큰 값 구해서 출력
		/*
		 *  1. 이 변수에 배열의 첫번째 값을 입력한다. 
			2. 이 값이 가장 크다고 가정하고 다음번 방에 있는 데이타와 비교를 한다. 
			3. 이 변수에 저장된 값보다 큰 값이 들어오면 더 큰 값으로 바꿔치기를 한다. 
			4. 이 과정을 배열이 끝날때 까지 반복하면 된다.
		 */
	
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max< arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("이 배열의 최대값은 " + max + "입니다.");

		
		

	}

}
