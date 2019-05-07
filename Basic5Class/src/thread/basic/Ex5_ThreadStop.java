package thread.basic;

public class Ex5_ThreadStop {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("메인쓰레드 :" + Thread.currentThread().getName());
		MakeCar3 mc = new MakeCar3();
		mc.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("쓰레드 종료");
		//mc.stop(); // 쓰레드 멈추게 하는 메소드. 일부러 예외를 발생시켜서 종료시키는 것. 따라서 run()함수에 해당 예외에 대한 예외처리를 하면 종료되지 않고 다시 시작됨
					//stop 메소드를 쓰는 것은 비추! 제어하고 싶다면 boolean 변수로 제어 해줘야한다.
		// mc.start(); //  stop으로 종료한 쓰레드는 start로 시작해도 의미없음.
		mc.flag = true; // 2000초에 멈추게 하고 싶은 경우, 2000초 후에 boolean인  flag를 ture로 변경해서, run()이 종료될 수 있도록 한다.
		

	}

}

class MakeCar3 extends Thread{
	
	boolean flag =false ;
	
	public void run() {
		for(int i=0; i<50; i++) {
			if(flag) return;
			System.out.println(getName()+"작업중");  //getName은 Thread에 포함된 메소드로 thread의 이름을 얻어오는 메소드.
			
			try {
				Thread.sleep(500); // 글씨찍고 0.5초 쉬고 찍고 반복하도록.
				
			} catch (InterruptedException e) {
				
		}
//				catch(ThreadDeath e) { //stop을 하더라도 예외처리를 해서 계속 구동됨.
//				System.out.println("쓰레드 강제 종료됨");
//			}
		}
	}
}