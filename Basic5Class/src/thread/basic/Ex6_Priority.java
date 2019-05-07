package thread.basic;

public class Ex6_Priority {

	public static void main(String[] args) {
		
		//자바가 우선순위를 부여해도, 운영체제 자체가 비선점방식(RoundRobin)이기 때문에 차이가 없다.
		//운영체제 자체는 Queue처럼 차례대로 처리함.
		
		MakeCar mc1 = new MakeCar("차틀",Thread.MAX_PRIORITY);
		mc1.start();
		
		MakeCar mc2 = new MakeCar("도색",Thread.MIN_PRIORITY);
		mc2.start();
		

	}

}

class MakeCar extends Thread{
	String work;
	MakeCar(String work,int prio){
		this.work = work;
		setPriority(prio);
		
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
