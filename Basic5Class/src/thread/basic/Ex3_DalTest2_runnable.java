package thread.basic;
import java.awt.*;
import javax.swing.*;


public class Ex3_DalTest2_runnable extends Frame {
	
	Dal1 a, b, c;
	
	public Ex3_DalTest2_runnable()
	{
		setSize( 500, 400 );
		setVisible( true );

		a = new Dal1(this, 0, 50);
		b = new Dal1(this, 0, 100);
		c = new Dal1(this, 0, 150);
		
		// # 
		// 각 객체의 쓰레드 메소드(run) 호출한다 
		
		new Thread(a).start();
		new Thread(b).start();
		new Thread(c).start();
	}	
	


	public void paint( Graphics g )
	{
		g.setColor(Color.red);
		g.drawString("__@", a.x, a.y );

		g.setColor(Color.blue);
		g.drawString("__@", b.x, b.y );

		g.setColor(Color.green);
		g.drawString("__@", c.x, c.y );
			
	}

	public static void main(String args[] )
	{
		Ex3_DalTest2_runnable dal1 = new Ex3_DalTest2_runnable();	
	}

}

/*
# Thread 처리
(1) Thread 클래스나 Runnable 인터페이스 상속
(2) run() 오버라이딩

	- 임의의 수를 speed 값으로 지정		
	- x 값을 위의 임의의 수를 더하기
	- 화면을 다시 그린다 (*) app.repaint() 이용
	- 임의의 수만큼 잠시 쓰레드를 블럭한다
	# 위의 작업을 반복한다
*/
class Dal1 implements Runnable
{
	int x, y;
	int speed;
	Frame app;
	
	public Dal1( Frame _app, int _x, int _y )
	{
		app = _app;
		x = _x;
		y = _y;	
	}
	
	public void run()
	{
		while(true) 
		{
			speed = (int)(Math.random()*10); // 0 ~ 9 임의의 수.
			x += speed;
			app.repaint();
			try {
				Thread.sleep(speed*100);
			} catch (InterruptedException e) {}
			
			
		}

	}	
}