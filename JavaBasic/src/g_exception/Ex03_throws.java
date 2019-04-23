package g_exception;

import java.io.FileInputStream;

public class Ex03_throws {

	public static void main(String[] args) { //Main 함수에서는 throws는 잘하지 않고, try catch로 예외를 처리하는 것을 권장함.
		try { 
			readFile();
			System.out.println("파일처리");
		}catch(Exception ex) {
			System.out.println("예외발생");
		}
	}
	static void readFile() throws Exception { //모든 예외에 대해서 던짐.
		FileInputStream fis = new FileInputStream("xxx.txt");
		System.out.println("파일연결");
	}

}
