package thread.basic;

public class Ex2_ThreadTest {

	// 이프로그램에는 thread 3개 돌아감. 메인, mc1,mc2
	public static void main(String[] args) {
		MakeCar1 mc1 = new MakeCar1("차틀만들기");
		mc1.start();
		//mc1.run();  -->run을 쓸때는 순차적으로 나오고 start를 호출하면, 멀티작업 인것처럼 뒤죽박죽 나옴.
		// run은 바로 실행으로 보내고, start는 runnable 대기실에 올린다.
		
		
		MakeCar1 mc2 = new MakeCar1("도색");
		mc2.start();
		//mc2.run();
		
		System.out.println("프로그램 끝");
		
	}

}

class MakeCar1 extends Thread{
	String work;
	MakeCar1(String work){
		this.work = work;
		
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(work+"작업중");
			
			try {
				Thread.sleep(500); // 글씨찍고 0.5초 쉬고 찍고 반복하도록.
			} catch (InterruptedException e) {
				
			} 
		}
	}
}
