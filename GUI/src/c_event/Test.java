package c_event;

import java.awt.FlowLayout;

import javax.swing.*;

public class Test extends JFrame {
	
	JButton b;
	JTextField tf;
	
	
	Test(){
		b= new JButton("��������ư");
		tf = new JTextField("�Է��غ�",20);
		
		
	}
	void addLayout() {
		
		setLayout(new FlowLayout());
		add(b);
		add(tf);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.addLayout();

	}

}
