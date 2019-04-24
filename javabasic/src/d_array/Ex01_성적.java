package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적 {

	public static void main(String[] args) {

		
		int[] kor = new int[5]; //int [] kor; //int kor[]도 가능. 변수 선언. 
		                        //kor = new int[5]; //heap은 자동 초기화.아무것도 입력하지 않으면 0이 저장되어 있음.
//		kor[0] = 80;
//		kor[1] = 99;
//		kor[2] = 77;
//		kor[3] = 55;
//		kor[4] = 81;
		// kor[5] = 100; 메모리를 5개 잡아놓고 6개를 넣으면, 에러는 안나지만 실행되지 않음.
		
		//입력받기
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력(12 13 14)");
		
//		for(int i=0; i<5; i++) {
//			kor[i] = input.nextInt();
//		}
		
		String score = input.nextLine();
		StringTokenizer st = new StringTokenizer(score);

		for(int i=0; st.hasMoreTokens(); i++) {
			kor[i] = Integer.parseInt(st.nextToken());
		}

		
		// 총점 구하기
		int total = 0 ;
		
		for (int i = 0; i < 5; i++) {
			total+=kor[i];
		}
		
		System.out.println("총점은 " + total);
		

	}

}
