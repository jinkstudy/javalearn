package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Day0415_max2 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("1-100가지의 숫자중 세개의 숫자를 입력하세요");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	
	int arr[]= {a,b,c};

	Arrays.sort(arr);
	System.out.println(arr[1]);
	
	
	
	}

}
