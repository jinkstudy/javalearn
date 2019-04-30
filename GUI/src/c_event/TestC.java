package c_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 *  Interface를 구현한 클래스 객체를 생성하지 않고, 바로 addActionListener 인자로 넣는 방법.
 */

public class TestC extends JFrame {

	JButton b;
	JTextField tf;


	TestC(){
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
		//		MyEvent evt = new MyEvent();
		//		b.addActionListener(evt);

		//위에 코드 축약. 변수생성 하지 않고 사용한 경우.
		//b.addActionListener( new MyEvent()); 
		b.addActionListener( new ActionListener() { public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "이벤트발생1");
		}
		});
		tf.addActionListener( new ActionListener() { public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "이벤트발생2");
		}
		});


	}



	public static void main(String[] args) {
		TestC t = new TestC();
		t.addLayout();
		t.eventProc();

	}

}
