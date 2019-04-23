package e_method;

public class Ex09_복습 {

	public static void main(String[] args) {
		char[][] letter =input();
		output(letter);
	}
	/*
	 *  함수명 : input
	 *  인자 : none
	 *  리턴형 : char[][]
	 *  역할 : 
	 */
	static char[][] input() {
		// 두 정수와 알파벳 문자 하나를 입력받기
		
		int n=3, m=4;
		char alpha='F';
		char[][]letter=makeSquare(n,m,alpha);
		return letter;
	}
	
	static char[][] makeSquare(int n, int m, char alpha) {
		//입력받은 값을 이용해서 n*m 문자 배열 만들기.
		// F G H I
		// J K L M
		// N O P Q
		char letter[][]=new char[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				letter[i][j]=alpha;
				 alpha+=1;
			}		
		}
		return letter;
		
		
	}
	static void output(char[][] letter) {
		// 문자열 배열을 출력
		for (int i = 0; i < letter.length; i++) {
			for (int j = 0; j < letter[i].length; j++) {
				System.out.print(letter[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}
}
