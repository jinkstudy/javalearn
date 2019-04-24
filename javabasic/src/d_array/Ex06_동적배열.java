package d_array;

public class Ex06_동적배열 {

	public static void main(String[] args) {
		
		char [][] star = new char[4][]; //메모리를 먼저 할당하는 것이 아니라 동적으로 할당되도록.
		//메모리의 변동이 있는 경우 for문 안에서 메모리가 할당되도록 지정하는것.
		
		// 값 지정
		for (int i = 0; i < star.length; i++) {
			star[i] = new char[i+1]; //각 행에 담겨있는 열의 길이를 i가 변함에 따라 동적으로 지정하는 것
			for (int j = 0; j <= i; j++) {
				star[i][j] = '*';
			}
		}
		
		// 아래 모양으로 출력
		/*
		 
		 *
		 **
		 ***
		 ****
		  
		 */
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
		System.out.println();
		
		}

	}

}
