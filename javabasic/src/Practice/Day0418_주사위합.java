package Practice;

import java.util.Scanner;

public class Day0418_주사위합 {

	public static void main(String[] args) {
		//입력 값
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int sum = input.nextInt();
		
		for(int i=1 ; i<=6; i++) {
			for(int j=1 ; j<=6 ; j++) {
				if(sum == (i+j)) {
					System.out.println(i+" " +j);
				}
				
			}
		}
		

	}

}
