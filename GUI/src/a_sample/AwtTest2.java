package a_sample;

/*
 *  Java GUI
 *  	- AWT - 1.2 ����
 *  	- Swing - 1.2 ���� J�� �߰�.
 *  
 *  Java -Write Once Run Anywhere	
 *  
 */
import java.awt.*;
import javax.swing.*;

public class AwtTest2 extends JFrame{
	// 1. ������� ����.
	JButton b1; //��ư�����
	JButton b2;
	JTextField tf; // ���� �ؽ�Ʈ �Է¹ޱ�
	JTextArea ta;  // �������� �ؽ�Ʈ�� ����.
	JRadioButton ch1;
	JRadioButton ch2;
	
	
	AwtTest2(){
		super("���� �ι�° â"); //�θ�����ڸ� �ҷ��ͼ� title�ο�.
		// 2. ��ü ����
		
		b1 = new JButton("OK");  //Button b1 = new Button() ó�� ���������� �����ϸ� nullpoint ���� �߻���..����!
		b2 = new JButton("Cancel");
		tf = new JTextField(30);
		ta = new JTextArea(10,50);
		ch1 = new JRadioButton("����");
		ch2 = new JRadioButton("����");
		
	}
	
	void addLayout() {
		//3. ȭ�鿡 ���̱�
//		FlowLayout f1 = new FlowLayout();
//		setLayout(f1);
		
		// setLayout(new FlowLayout()); //���� ��� �߾ӿ� ��ġ - ������Ʈ�� ũ�Ⱑ ����
		// setLayout(new GridLayout(3,2)); //��� ���� ��ġ - ������Ʈ ũ�Ⱑ �����.
		// setLayout(new BorderLayout()); //NORTH, SOUTH, CENTER, WEST, EAST ������ ��ġ.
		
		
		add(b1, BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(tf,BorderLayout.WEST);
		add(ta,BorderLayout.CENTER);
		//JPanel p = new JPanel(); // ch1�� ch2�� �ϳ��� �гη� ������ش�.
		  ButtonGroup bg = new ButtonGroup();// ch1�� ch2�� �ϳ��� �׷����� ������ش�. ���� ��ư ���� �� �ϳ��� ���õǵ���.
		bg.add(ch1);
		bg.add(ch2);
		//add(p);

		
		//4. ȭ�鿡 ���
		setSize(600,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����Ű��.
		
		
	}

	public static void main(String[] args) {
	
		AwtTest2 at = new AwtTest2();
		at.addLayout();
		

	}

}
