package Practice;

import java.util.Scanner;

public class Day0417_for문_도전문제2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int row2 = input.nextInt();
	    
		
		
		for (int i = 1; i <= row2; i++) {
			for (int j = i; j <= i+row2*(row2-1); j+=row2) {
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}
	}

}
