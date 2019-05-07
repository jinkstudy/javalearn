package thread.basic;

public class Ex2_RunnableTest {

	// 이프로그램에는 thread 3개 돌아감. 메인, mc1,mc2
	public static void main(String[] args) {
		MakeCar2 mc1 = new MakeCar2("차틀만들기");
		Thread t1 = new Thread(mc1); // Runnable 에는 Thread 클래스 포함되어 있지 않으므로, thread 객체 생성해줘야함. 
									 // MakeCar2와 thread 클래스를 연결해줘야함.
		t1.start();
		
		
		
		//MakeCar2 mc2 = new MakeCar2("도색");
		//Thread t2 = new Thread(mc1);
		//t2.start();
		//위 세줄의 코딩을 아래 한줄로 줄일 수 있다.
		
		//Thread t2 = new Thread(new MakeCar2("도색"));
		new Thread(new MakeCar2("도색")).start();
		//mc2.run();
		
		System.out.println("프로그램 끝");
		
	}

}

class MakeCar2 implements Runnable{
	String work;
	MakeCar2(String work){
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
