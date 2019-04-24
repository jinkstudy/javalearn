package g_exception;

public class Ex04_throw {

	public static void main(String[] args) {

		try {
			readArray();
			
		}catch(Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}
		try {
			readArray1();
			
		}catch(Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}
		
		
		System.out.println("정상종료");
	}

	static void readArray() throws Exception{
		String str[]= {"우리는한배","공부즐기시기","스터디"};

		try {
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		}catch(Exception ex) {
			throw new MyException(); //일부러 예외 발생. 어느 부분에서 예외발생했는지 알수있도록 정보를 주기위해서.
		}
	}
	static void readArray1() throws Exception{
		String str[]= {"우리는한배","공부즐기시기","스터디"};

		try {
			for (int i = 0; i <= str.length; i++) {
				System.out.println(str[i]);
			}
		}catch(Exception ex) {
			throw new MyException1(); //일부러 예외 발생. 어느 부분에서 예외발생했는지 알수있도록 정보를 주기위해서.
		}
	}
}
