package thread.basic;

import java.io.IOException;

public class Ex01_Process {

	public static void main(String[] args) {
		// 다른 응용 프로그램을 프로세스 실행
		
		Runtime rt = Runtime.getRuntime(); // getTuntime static 이므로 객체 생성불가.
		
		try {
			rt.exec("C:\\Program Files\\internet explorer\\iexplore.exe"); //경로 설정. 역슬러시 두개해야함.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
