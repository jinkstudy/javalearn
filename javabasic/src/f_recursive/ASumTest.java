package f_recursive;

public class ASumTest {

//	public static void main(String[] args) {
//		int sum=0;
//		for(int i=1; i<=10; i++) {
//			//sum+=i;
//			
//			int exsum = sum;
//			sum = exsum + i ;
//			System.out.println(sum+"="+exsum+"+"+i);
//		}
//		System.out.println("합:" + sum);
//
//	}
	
	public static void main(String[] args) {
		int sum = 0;
		sum = sumFunc(3);
		System.out.println("총합:"+sum);
	}
	
	static int sumFunc(int i) {
		//재귀호출 : 자기자신을 그 함수안에서 다시 호출하는것.
		if(i==1) return 1; //재귀호출 시 주의해야할 것--> 정지포인트를 주지 않으면 무한실행하므로 언제 끝낼것인지 정의해줘야함.
		return i + sumFunc(i-1); 
	}

}
