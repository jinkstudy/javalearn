package c_event;

import java.awt.*;  //*�� �ϸ� �ϳ��� ���� Ŭ���� ������ ã�� , �� �Ʒ��� ã�� �� ����.
import java.awt.event.*;

import javax.swing.*;

/*
 * �̺�Ʈ �ڵ鷯 innerclass�� �����
 */

public class TestA extends JFrame {
	
	JButton b;
	JTextField tf;
	
	
	TestA(){
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
		// 2. �ڵ鷯 ��ü ����
		MyEvent me = new MyEvent();
		
		// 3. �̺�Ʈ �߻��� ���ϴ� ������Ʈ�� ����
		b.addActionListener(me); // button�� �̺�Ʈ�ڵ鷯 ����
		tf.addActionListener(me); // text�ڽ��� �̺�Ʈ�ڵ鷯 ����
		
		// �̺�Ʈ�� ����ڰ� �ش� �̺�Ʈ�� �������� ������ ��ٸ��� �ִٰ� , 
		// �̺�Ʈ�� �߻��ϸ� JVM�� �ν��ؼ� �ش� method�� �����Ŵ. 
		
		
	}
	// 1.�̺�Ʈ �ڵ鷯 �����
	class MyEvent implements ActionListener{

		//�������̵�.
		public void actionPerformed(ActionEvent e) {
			Object obj =e.getSource(); // getSource�� � �ڷ����� ���ؼ� ��ȯ�ؾ��� �� �𸣹Ƿ� �׻� object ������ ��ȯ�Ѵ�.
										//���� �ʿ�� ��ȯ���� �� ����ȯ �ϸ�ȴ�. Event�ҷ�����.
			
			if(obj ==b) {
				String msg = b.getText(); // getText() ��ư�� �����ִ� text�� �����´�.
				JOptionPane.showMessageDialog(null, msg +" �̺�Ʈ�߻�"); // �޽��� â �ϳ� ��ﶧ �θ� �ʿ����. -->null
			} else if (obj == tf) {
				String msg = tf.getText(); //getText() �Էµ� �����͸� �����ͼ� msg��� ������ ����.
				JOptionPane.showMessageDialog(null, msg + "�� �Է��ϼ̽��ϴ�.");
			}

		}
		
	}

	public static void main(String[] args) {
		TestA t = new TestA();
		t.addLayout();
		t.eventProc();

	}

}
