package c_control;
/*
 * for(초기값; 조건문; 증가식)
 * {
 * 		반복할 문장들
 * }
 */
public class Ex05_for개념 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100; i++) { //java에서는 for문 안의 i는 for문 안에서만 사용하므로, 다음 for문에서 또 사용가능, C언어는 사용불가능.
			sum += i; // sum = sum + i;
			//System.out.println(i);
		}
		System.out.println("결과:"+sum);
		
		// [연습] 1~100까지 홀수의 합과 짝수의 합
		
		int sum_odd = 0; //홀수합 초기화
		int sum_even= 0; //짝수합 초기화
		
		//홀수 합 결과
		for(int i=1; i<=100; i+=2) {
			sum_odd+=i;
			sum_even+=(i+1);
		}
		System.out.println("홀수 합 결과:"+sum_odd);
		
//		//짝수 합 결과
//		
//		for(int i=0; i<=100; i+=2) {
//					sum_even+=i;
//		}
		System.out.println("짝수 합 결과:"+sum_even);
		
		
				
		int even=0,odd=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) even+=i;
			else odd+=i;
		}
		System.out.println("짝수합:"+even);
		System.out.println("홀수합:"+odd);
		
		//A~Z 출력
		
		for( char c='A'; c<='Z' ;c++ ) {
			System.out.print(c);
		}
		  System.out.println();
		//Z~A 출력
		
		for( char c='Z'; c>='A' ;c-- ) {
			System.out.print(c);
		}
	}
		
	
	
	
	}


