package c_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 *  Interface�� ������ Ŭ���� ��ü�� �������� �ʰ�, �ٷ� addActionListener ���ڷ� �ִ� ���.
 */

public class TestC extends JFrame {

	JButton b;
	JTextField tf;


	TestC(){
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

	void eventProc() {
		//		MyEvent evt = new MyEvent();
		//		b.addActionListener(evt);

		//���� �ڵ� ���. �������� ���� �ʰ� ����� ���.
		//b.addActionListener( new MyEvent()); 
		b.addActionListener( new ActionListener() { public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "�̺�Ʈ�߻�1");
		}
		});
		tf.addActionListener( new ActionListener() { public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "�̺�Ʈ�߻�2");
		}
		});


	}



	public static void main(String[] args) {
		TestC t = new TestC();
		t.addLayout();
		t.eventProc();

	}

}
