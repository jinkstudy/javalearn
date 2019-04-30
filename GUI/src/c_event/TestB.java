package c_event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/*
 * class자체를 이벤트 핸들러로 사용하기.
 * 
 */

public class TestB extends JFrame implements ActionListener { // Frame역할도 하면서 ActionListener 역할도 함.
	
	JButton b;
	JTextField tf;
	
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "이벤트발생");
		
	}
	
	
	TestB(){
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

	//이벤트 처리
	void eventProd() {
		b.addActionListener(this);
		tf.addActionListener(this);// 이벤트 핸들러를 따로 만들어주지 않고 해당클래스 자체를 이벤트 핸들러로 쓰기 때문에 this를 적어주면된다.
	}
	public static void main(String[] args) {
		TestB t = new TestB();
		t.addLayout();
		t.eventProd();

	}
	

}
