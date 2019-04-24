package e_method;

public class Ex08_Main {
/*
 * 메소드명 :main
 * 인자 : String[] args
 * 리턴형 : void
 * JVM이 찾을 수 있도록 하려면 public static void로 고정되어있어야함.
 * 
 */
	
	/* Test.java  -> Test.class
	 * 		(1) 컴파일: javac Test.java
	 * 		(2) 실행 : java Test 192.168.0.1 scott tiger
	 * 
	 * 접근할때 IP,ID,PASSWORD를 소스 안에 변수로 받는 경우, 내용이 변경될때마다 소스를 수정해야 하므로 비효율적.
	 * main 함수의 인자로 받아오면 접근하면서 변경가능하므로, 더욱 효율적이다.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
