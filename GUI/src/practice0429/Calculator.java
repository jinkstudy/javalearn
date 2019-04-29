package practice0429;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	JTextField tfInput;
	
	Calculator(){
		
     f = new JFrame("계산기");
     tfInput = new JTextField(15);
     
     b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3");b4 = new JButton("4");b5 = new JButton("5");
     b6 = new JButton("6");b7 = new JButton("7");b8 = new JButton("8");b9 = new JButton("9"); b10 = new JButton("+");
     b11 = new JButton("0");b12 = new JButton("=");b13 = new JButton("-");b14 = new JButton("*");b15 = new JButton("/");
     

		
	}
	void addLayout() {
		
		JPanel p_cal = new JPanel();  //기본 flow 레이아웃
		p_cal.setLayout(new GridLayout(5,3)); //레이아웃을 변경하고 싶다면 setLayout.
		
		p_cal.add(b1);	p_cal.add(b2);	p_cal.add(b3);	p_cal.add(b4);	p_cal.add(b5);
		p_cal.add(b6);	p_cal.add(b7);	p_cal.add(b8);	p_cal.add(b9);	p_cal.add(b10);
		p_cal.add(b11);	p_cal.add(b12);	p_cal.add(b13);	p_cal.add(b14);	p_cal.add(b15);
		
		//전체 프레임에 붙이기.
		
				f.setLayout(new BorderLayout());
				f.add(tfInput, BorderLayout.NORTH);
				f.add(p_cal, BorderLayout.CENTER);
				
				
				f.setSize(500, 350);
				f.setVisible(true);
				
		
	}



	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addLayout();

	}

}
