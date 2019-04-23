package Practice;

import java.util.Scanner;

public class Day0417_for문_도전문제 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("행 수를 입력하세요");
		int row2 = input.nextInt();
	    System.out.println("열 수를 입력하세요");
		int column2 = input.nextInt();
		
		
		for (int i = 1; i <= row2; i++) {
			for (int j = column2*(i-1)+1; j <= column2*i; j++) {
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}
	}

}
