package d_array;

public class Ex02_2차원 {

	public static void main(String[] args) {

		int score[][];  //int [][]score; 도 가능  ==>메모리 할당 stack에 null저장.
		score = new int[3][4]; //우리반 3명, 과목 4명 일때  ==>
		
		score[1][2] = 100;
		score[2][3] = 100;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i+"행"+ j+"열"+score[i][j]);
				
			}
			
		} //배열의 차원 수 와 반복문의 수와 같아야함.
		
		

	}

}
