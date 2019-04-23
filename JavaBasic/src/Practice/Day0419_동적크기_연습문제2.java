package Practice;

public class Day0419_동적크기_연습문제2 {

	/*
	 *  다음 배열 a에서 합이 가장 큰 행과 열의 번호를 각각 출력하기

 	int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};

 	결과 : 2 1
	 */
	
	public static void main(String[] args) {
		
		int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
		
		int sum[]= new int[a.length];
		int max = sum[0]; //총 합 변수
		
		// 해당 2차원 배열의 길이만큼 반복하여 각 열의 총 합 구하기.
		for (int i = 0; i < a.length; i++) { //2차원 배열의 행 수만큼 반복
		
			for(int j=0; j<a[i].length; j++) {//2차원 배열의 열 수만큼 반복
				sum[i]+=a[i][j];
			}
			
						
			}
		
		// MAX값 찾아서 해당 index 출력해주기.
		
		for (int i = 0; i < sum.length-1; i++) { 
			
			if(max<sum[i+1]) {
				max = sum[i+1];
				System.out.println("총 합이 제일 큰 행: "+i+"번째 행 ");
		}
			
	}
		
		
		
	}

}
