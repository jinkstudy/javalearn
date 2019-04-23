package c_control;

import java.util.*;
//import java.util.StringTokenizer;

public class Ex08_while개념 {

	public static void main(String[] args) {
		// 1~10까지 합 구하기.
		
		int i=1; //for문의 초기치를 for문 밖으로 빼봄.
		int sum = 0;
		//for(; i<=10; )// for문의 초기치와 증가치를 for문 밖으로 빼면 하기 while문과 동일 하게 사용가능.
		//반복문을 몇번돌아갈지 확실히 아는 경우 for문/ 그렇지 않은 경우 while 쓰는 것이 편리함.
		
		while(i<=10) { 
			sum += i; 
			i++; // 증가치를 for문 밖으로 빼도 결과는 동일.
			
			
		}
		
		System.out.println("결과:"+sum);
		
		//[연습] 수를 입력받아서 해당 수의 구구단을 출력하는 프로그램을 while문을 이용하여 작성하세요.
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int num = input.nextInt();				
		int j=1;
		
		System.out.println(num+"단");
		while(j<=9) {
			System.out.println(num+"x"+j+"="+(num*j));
			j++;
		}
		
		//
		String str = "독도는 대한민국의 아름다운 섬입니다";
		StringTokenizer st = new StringTokenizer(str); // str을 잘라주는 유용한 class
		//System.out.println(st.nextToken()); // 아무것도 지정하지 않으면 공백을 기준으로 분리해서 맨앞에것을 보여줌
		//System.out.println(st.nextToken()); // 두번 실행 시 그다음 문자 set 보여줌. 긴문장의 경우, 몇개의 문자 set가 있는지 모르니까 while문으로 반복.
	    
		
		while(st.hasMoreTokens()) { //st라는 문장이 token을 가지고 있을 때 까지 nextToken을 수행하라.
			System.out.println(st.nextToken());
		}
		
		//알고리즘 문제 예시
		String str1 ="100*3+4/2-5";
		StringTokenizer st1 = new StringTokenizer(str1,"+-*/%"); //+-*/%를 기준으로 분리.
		
		while(st1.hasMoreTokens()) { 
			System.out.println(st1.nextToken());
		}
	}

}
