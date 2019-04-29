package a_sample;

/*
 *  Java GUI
 *  	- AWT - 1.2 ����
 *  	- Swing - 1.2 ����
 *  
 *  Java -Write Once Run Anywhere	
 *  
 */
import java.awt.*;
import javax.swing.*;

public class AwtTest extends Frame{
	// 1. ������� ����.
	Button b1; //��ư�����
	Button b2;
	TextField tf; // ���� �ؽ�Ʈ �Է¹ޱ�
	TextArea ta;  // �������� �ؽ�Ʈ�� ����.
	Checkbox ch1;
	Checkbox ch2;
	
	
	AwtTest(){
		super("���� �ι�° â"); //�θ�����ڸ� �ҷ��ͼ� title�ο�.
		// 2. ��ü ����
		
		b1 = new Button("OK");  //Button b1 = new Button() ó�� ���������� �����ϸ� nullpoint ���� �߻���..����!
		b2 = new Button("Cancel");
		tf = new TextField(30);
		ta = new TextArea(10,50);
		ch1 = new Checkbox("����");
		ch2 = new Checkbox("����");
		
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
		Panel p = new Panel(); // ch1�� ch2�� �ϳ��� �гη� ������ش�.
		p.add(ch1);
		p.add(ch2);
		add(p,BorderLayout.EAST );
	
		
		
		
		
		
		
		
		
		//4. ȭ�鿡 ���
		setSize(600,480);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
	
		AwtTest at = new AwtTest();
		at.addLayout();
		

	}

}
