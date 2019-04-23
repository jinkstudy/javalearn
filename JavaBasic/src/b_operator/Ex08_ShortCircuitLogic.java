package b_operator;
/*
 *  숏서킷로직 : 일반논리에 적용
 */

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {

		int a=3;
		if(a>3 && ++a>3) { // &&인 경우, a>3 이 이미 false 이므로 뒤의 연산을 수행할 필요가 없어서 수행하지 않음 
			System.out.println("조건만족"); //출력안됨
		}
		System.out.println("A="+a); //따라서 A = 3
		
		if(++a>3 && a>3  ) { // &&인 경우, a>3 이 이미 false 이므로 뒤의 연산을 수행할 필요가 없어서 수행하지 않음 
			System.out.println("조건만족"); //출력안됨
		}
		System.out.println("A="+a); //따라서 A = 4
	
		if(a>1 || ++a>3) { // ||인 경우, a>1 이 이미 true 이므로 뒤의 연산을 수행할 필요가 없어서 수행하지 않음
			System.out.println("조건만족2"); //출력
		}
		System.out.println("A="+a); //따라서 A = 4
		
		
		if(a>3 & ++a>3) { // && 대신 이진논리 &를 쓸 경우, 앞 뒤 모두 수행.
			System.out.println("조건만족3"); //출력안됨
		}
		System.out.println("A="+a); //따라서 A = 5
		
		
	
		if(a>1 | ++a>3) { // || 대신 이진논리 |를 쓸 경우, 앞 뒤 모두 수행.
			System.out.println("조건만족4"); //출력
		}
		System.out.println("A="+a); //따라서 A = 6

	}

}
