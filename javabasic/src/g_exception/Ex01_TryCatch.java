package g_exception;

/*
 * 오류 
 * 		-에러 : 심각 오류
 * 		-예외 : 심각하지 않은 오류
 * 		
 * 예외처리 - 프로그램을 정상적으로 종료시키기 위해서.
 * 
 * (1) 예외를 잡자 - try ~ catch구문
 * 		try{
 * 			예외 발생할 구문
 * 		}catch(){
 * 			예외가 발생한 후의 구문
 * 		}finally{
 * 			예외발생여부와 상관없이 무조건 실행 구문
 * 		}
 * 
 * 	
 */		

public class Ex01_TryCatch {

	public static void main(String[] args) {

		String [] str = {"맛점","우산","즐거운화요일"};
		try {
			for (int i = 0; i <=str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println("예외가 발생할 여기가 있는 구문");
			return; //정상수행시 return 반환 후 그뒤의 명령 수행 안하지만 finally가 있는 경우, finally로 넘어감.
		}catch(Exception ex) { // 에러 발생 시 발생 시점에서 바로 catch로 넘어감. 그래서 return까지 가지 못함.
			System.out.println("예외발생:" + ex.getMessage()); //ex.toString()
			ex.printStackTrace();
		} finally {
			System.out.println("무조건 실행 구문");  //return이 있어도 finally는 무조건 수행!
		}
		System.out.println("프로그램 정상 종료"); //위에 return이 있는 경우 에러가 없어도 수행안됨.
	}
}
