package practice0429;

//import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator_new {
	
	JFrame f;
	JButton [] b=new JButton[16];//index�� ���� �����ֱ� ���ؼ� 0�� ������ 16���� �������.
	JTextField tfInput;
	
	Calculator_new(){
		
     f = new JFrame("����2");
     
     tfInput = new JTextField(15);
     
     for (int i = 1; i <=9; i++) {
//    	b[i] = new JButton();
		b[i]= new JButton(String.valueOf(i));
	}
     b[10] = new JButton("+"); b[11] = new JButton("0"); b[12] = new JButton("=");
     b[13] = new JButton("-"); b[14] = new JButton("*"); b[15] = new JButton("/");
	
	}
	void addLayout() {
		
		JPanel p_cal = new JPanel();  //�⺻ flow ���̾ƿ�
		p_cal.setLayout(new GridLayout(5,3)); //���̾ƿ��� �����ϰ� �ʹٸ� setLayout.
		
		for (int i = 1; i <= 15; i++) {
			p_cal.add(b[i]);
		}
	
		//��ü �����ӿ� ���̱�.
		
				f.setLayout(new GridLayout(2,1));
				f.add(tfInput);
				f.add(p_cal);
				
				
				f.setSize(500, 500);
				f.setVisible(true);

	}

	public static void main(String[] args) {
		Calculator_new cal = new Calculator_new();
		cal.addLayout();

	}

}
