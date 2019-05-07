package thread.basic;


class Count{
	int i;
	void increment() { // -->작업 끝날때까지 다른 thread의 작업이 대기상태로 되도록 만들어서  lock을 걸어줌. 
		synchronized (this){ //객체를 물고 sychronized 해줘야함.
								// synchronized void increment() 메소드 앞에 적어도 됨. 이 경우 메소드 내용이 많은 경우 공유하는 것 외에도 전체 적용되므로
								// 실제 필요한 부분만 적는것이 좋다. 
			i++;
		}
		
	}

}

class ThreadCount extends Thread{
	Count cnt;
	
	public ThreadCount(Count cnt) {
		this.cnt = cnt;
	}
	
	public void run() {
		for (int i = 0; i < 100000000; i++) {
			cnt.increment();
		}
	}
}
// 이론적으로  i = 2억이 나와야 하지만 그렇게 나오지 않는다.
// 그 이유는 lock이 걸려있지 않기 때문에, 똑같은 i값이 덮어써진다.
// 이를 방지 하기 위해서, synchronized를 해줘야한다. -->작업 끝날때까지 다른 thread의 작업이 대기상태로 되도록 만들어서 .
// --> 2억나옴.

public class Ex7_Synch {

	public static void main(String[] args) {
		Count cnt = new Count();
		
		ThreadCount tc1 = new ThreadCount(cnt);
		tc1.start();
		
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
		
		try {
		tc1.join(); 
		tc2.join();
		}
		catch(Exception e) {}
		
		System.out.println("i값=" + cnt.i);

	}

}
