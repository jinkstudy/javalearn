package c_event;

import java.awt.*;  //*를 하면 하나의 하위 클래스 까지만 찾고 , 그 아래는 찾을 수 없음.
import java.awt.event.*;

import javax.swing.*;

/*
 * 이벤트 핸들러 innerclass로 만들기
 */

public class TestA extends JFrame {
	
	JButton b;
	JTextField tf;
	
	
	TestA(){
		b= new JButton("눌러봐버튼");
		tf = new JTextField("입력해봐",20);
	
	}
	void addLayout() {
		
		setLayout(new FlowLayout());
		add(b);
		add(tf);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void eventProc() {
		// 2. 핸들러 객체 생성
		MyEvent me = new MyEvent();
		
		// 3. 이벤트 발생을 원하는 컴포넌트와 연결
		b.addActionListener(me); // button과 이벤트핸들러 연결
		tf.addActionListener(me); // text박스와 이벤트핸들러 연결
		
		// 이벤트는 사용자가 해당 이벤트를 수행했을 때까지 기다리고 있다가 , 
		// 이벤트가 발생하면 JVM이 인식해서 해당 method를 수행시킴. 
		
		
	}
	// 1.이벤트 핸들러 만들기
	class MyEvent implements ActionListener{

		//오버라이딩.
		public void actionPerformed(ActionEvent e) {
			Object obj =e.getSource(); // getSource는 어떤 자료형에 대해서 반환해야할 지 모르므로 항상 object 형으로 반환한다.
										//따라서 필요시 반환받은 후 형변환 하면된다. Event불러오기.
			
			if(obj ==b) {
				String msg = b.getText(); // getText() 버튼에 적혀있는 text를 가져온다.
				JOptionPane.showMessageDialog(null, msg +" 이벤트발생"); // 메시지 창 하나 띄울때 부모가 필요없음. -->null
			} else if (obj == tf) {
				String msg = tf.getText(); //getText() 입력된 데이터를 가져와서 msg라는 변수에 저장.
				JOptionPane.showMessageDialog(null, msg + "를 입력하셨습니다.");
			}

		}
		
	}

	public static void main(String[] args) {
		TestA t = new TestA();
		t.addLayout();
		t.eventProc();

	}

}
