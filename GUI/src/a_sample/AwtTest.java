package a_sample;

/*
 *  Java GUI
 *  	- AWT - 1.2 이전
 *  	- Swing - 1.2 이후
 *  
 *  Java -Write Once Run Anywhere	
 *  
 */
import java.awt.*;
import javax.swing.*;

public class AwtTest extends Frame{
	// 1. 멤버변수 선언.
	Button b1; //버튼만들기
	Button b2;
	TextField tf; // 한줄 텍스트 입력받기
	TextArea ta;  // 여러줄의 텍스트를 받음.
	Checkbox ch1;
	Checkbox ch2;
	
	
	AwtTest(){
		super("나의 두번째 창"); //부모생성자를 불러와서 title부여.
		// 2. 객체 생성
		
		b1 = new Button("OK");  //Button b1 = new Button() 처럼 지역변수로 지정하면 nullpoint 에러 발생함..주의!
		b2 = new Button("Cancel");
		tf = new TextField(30);
		ta = new TextArea(10,50);
		ch1 = new Checkbox("남자");
		ch2 = new Checkbox("여자");
		
	}
	
	void addLayout() {
		//3. 화면에 붙이기
//		FlowLayout f1 = new FlowLayout();
//		setLayout(f1);
		
		// setLayout(new FlowLayout()); //윗줄 상단 중앙에 배치 - 컴포넌트의 크기가 고정
		// setLayout(new GridLayout(3,2)); //행과 열에 배치 - 컴포넌트 크기가 변경됨.
		// setLayout(new BorderLayout()); //NORTH, SOUTH, CENTER, WEST, EAST 영역에 배치.
		
		
		add(b1, BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(tf,BorderLayout.WEST);
		add(ta,BorderLayout.CENTER);
		Panel p = new Panel(); // ch1과 ch2를 하나의 패널로 만들어준다.
		p.add(ch1);
		p.add(ch2);
		add(p,BorderLayout.EAST );
	
		
		
		
		
		
		
		
		
		//4. 화면에 출력
		setSize(600,480);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
	
		AwtTest at = new AwtTest();
		at.addLayout();
		

	}

}
