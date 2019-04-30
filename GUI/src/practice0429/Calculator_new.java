package practice0429;

//import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.ForegroundAction;




public class Calculator_new {

	JFrame f;
	JButton [] b=new JButton[16];//index�� ���� �����ֱ� ���ؼ� 0�� ������ 16���� �������.
	JTextField tfInput;
	int first;
	int second;
	char oper;
	int result;

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


	//��ư �̺�Ʈ ����.
	class BtnHdlr implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Object obj =e.getSource();

			//1���� 9������ �ش� ���ڰ� ǥ�� �ǵ���.
			char a = ((JButton)obj).getText().charAt(0);

			if(a>='0' && a<='9') {
				tfInput.setText(String.valueOf(a));
			}else if(a == '=') {
				second = Integer.parseInt(tfInput.getText());
				result();

			}else {
				first = Integer.parseInt(tfInput.getText());
				oper = a;

				clearTextField();


			}

		}

	}





	void result() {
		switch(oper) {

		case '+' : result= first + second; break;
		case '-' : result= first - second; break;
		case '*' : result= first * second; break;
		case '/' : result= first / second; break;

		}
		tfInput.setText(String.valueOf(first)+String.valueOf(oper)+String.valueOf(second)+"="+result);

	}



	void clearTextField() {
		tfInput.setText(null);
	}

	// �̺�Ʈ ���
	void eventProc() {
		BtnHdlr bh = new BtnHdlr();
		// ��ư�� �̺�Ʈ �ڵ鷯 ����
		for (int i = 1; i <=15; i++) {
			b[i].addActionListener(bh);
		}


	}

	public static void main(String[] args) {

		Calculator_new cal = new Calculator_new();
		cal.addLayout();
		cal.eventProc();

	}

}

//��ư �̺�Ʈ ����


