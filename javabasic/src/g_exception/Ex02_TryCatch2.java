package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch2 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			 fis = new FileInputStream("abc.txt"); // FileInputStream - 파일 연결하는 기능
			System.out.println("파일연결");
			fis.read();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 없는 예외:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("입출력 예외:" + e.getMessage());
		} catch (Exception e) { // Exception을 제일 먼저 쓰게 될 경우, 구체적인 에러를 잡을 수 없으므로 Exception은 맨마지막에 써야함. 
			System.out.println("그외 예외처리");
		} finally { 
			try{fis.close();}catch(Exception ex) {}
		}

	}

}
