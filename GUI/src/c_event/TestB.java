package c_event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/*
 * class��ü�� �̺�Ʈ �ڵ鷯�� ����ϱ�.
 * 
 */

public class TestB extends JFrame implements ActionListener { // Frame���ҵ� �ϸ鼭 ActionListener ���ҵ� ��.
	
	JButton b;
	JTextField tf;
	
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "�̺�Ʈ�߻�");
		
	}
	
	
	TestB(){
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

	//�̺�Ʈ ó��
	void eventProd() {
		b.addActionListener(this);
		tf.addActionListener(this);// �̺�Ʈ �ڵ鷯�� ���� ��������� �ʰ� �ش�Ŭ���� ��ü�� �̺�Ʈ �ڵ鷯�� ���� ������ this�� �����ָ�ȴ�.
	}
	public static void main(String[] args) {
		TestB t = new TestB();
		t.addLayout();
		t.eventProd();

	}
	

}
