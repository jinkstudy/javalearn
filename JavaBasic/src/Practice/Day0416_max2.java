package Practice;

import java.util.Scanner;

public class Day0416_max2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("1-100가지의 숫자중 세개의 숫자를 입력하세요");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
//		int result = (a-b>0)?  a:b; 
//		int result1 = (b-c>0)? b:c;
//		int result2 = (result-result1>0)? result1:result;
		
		int result3 = ((a>b&&b>c)||(a<b && b<c))? b:((a>c&&c>b)||(a<c && c<b))? c:a;
		
		System.out.println("두번째로 큰 수는 " +result3 + "입니다.");
	}

}
