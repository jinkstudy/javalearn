package f_numbergame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


class MyFrame1 extends JFrame implements ActionListener{

	JFrame f;
	int getsu = 4;
	JButton[][] la = new JButton[getsu][getsu];

	char[][] answer = new char[getsu][getsu];

	//ù��° ��ư
	JButton firstClick;
	int firstRow,firstCol;


	public MyFrame1() {
		// ��ü����//��ġ//�̺�Ʈ���
		setLayout(new GridLayout(getsu,getsu));
		for (int j = 0; j < la.length; j++) {
			for (int i = 0; i < la[j].length; i++) {
				la[i][j] = new JButton();
				add(la[i][j]);
				la[i][j].addActionListener(this);
				answer[i][j] = '0'; // ���� �ʱ�ȭ
			}
		}

		setSize(400, 400);
		setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {
		//�̺�Ʈ Ȯ��
		//System.out.println("Ȯ��");
		JButton obj = (JButton)e.getSource();
		
		for (int i = 0; i < la.length; i++) {
			for (int j = 0; j < la[i].length; j++) {
				if(obj == la[i][j]) {
					// ù��° ��ư ����
					if(firstClick == null) {
						
						firstClick =obj;
						firstRow = i;
						firstCol = j;
						obj.setText(String.valueOf(answer[i][j]));
						firstClick.setBackground(new Color(255,0,0)); // red/green/blue
					}else {//�ι�° ��ư ����
						if(answer[firstRow][firstCol] == answer[i][j]) {
							//JOptionPane.showMessageDialog(null, "������");
							firstClick.setBackground(new Color(200,200,200));
							obj.setBackground(new Color(200,200,200));
							//							la[firstRow][firstCol].setText(null);
							//							obj.setText(null);
							obj.setText(String.valueOf(answer[i][j]));


						}else {
							firstClick.setBackground(null);
							firstClick.setText(null);
						}

						firstClick = null;
					}

				}
			}
		}



	}


	void initChar() {
		char alpha = '0';

		DASI:
			for(int i =0; i<getsu*getsu;) { // 
				//������ ���ĺ� �����
				if(i % 2 == 0) {
					alpha = (char)('A'+(int)(Math.random()*26));
					// ������ �̹� �� ���ĺ��� �ִ��� Ȯ��.
					for (int row = 0; row < answer.length; row++) {
						for (int column = 0; column < answer[row].length; column++) {
							if(answer[row][column] ==alpha) {

								continue DASI;
							}
						}
					}
				}

				//������ �ڸ��� ���ĺ� �ֱ�
				boolean ok = false;

				do {
					int row = (int)(Math.random()*(getsu));
					int column = (int)(Math.random()*(getsu));
					if(answer[row][column] =='0') {
						answer[row][column] = alpha;
						i++;
						ok =true;

					}
				}

				while(!ok);
			}


	}

	void showAnswer() {
		//ó�� ���� �����ֱ�
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				la[i][j].setText(String.valueOf(answer[i][j]));
			}
		}

		try {
			Thread.sleep(5000);
		} catch(Exception ex) {}

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				la[i][j].setText(null);
			}
		}




	}


}


public class NumberGame2 {

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();

		f.initChar();
		f.showAnswer();




	}

}
