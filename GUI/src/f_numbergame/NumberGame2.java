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

	//첫번째 버튼
	JButton firstClick;
	int firstRow,firstCol;


	public MyFrame1() {
		// 객체생성//배치//이벤트등록
		setLayout(new GridLayout(getsu,getsu));
		for (int j = 0; j < la.length; j++) {
			for (int i = 0; i < la[j].length; i++) {
				la[i][j] = new JButton();
				add(la[i][j]);
				la[i][j].addActionListener(this);
				answer[i][j] = '0'; // 문자 초기화
			}
		}

		setSize(400, 400);
		setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {
		//이벤트 확인
		//System.out.println("확인");
		JButton obj = (JButton)e.getSource();
		
		for (int i = 0; i < la.length; i++) {
			for (int j = 0; j < la[i].length; j++) {
				if(obj == la[i][j]) {
					// 첫번째 버튼 인지
					if(firstClick == null) {
						
						firstClick =obj;
						firstRow = i;
						firstCol = j;
						obj.setText(String.valueOf(answer[i][j]));
						firstClick.setBackground(new Color(255,0,0)); // red/green/blue
					}else {//두번째 버튼 인지
						if(answer[firstRow][firstCol] == answer[i][j]) {
							//JOptionPane.showMessageDialog(null, "딩동댕");
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
				//임의의 알파벳 만들기
				if(i % 2 == 0) {
					alpha = (char)('A'+(int)(Math.random()*26));
					// 기존에 이미 이 알파벳이 있는지 확인.
					for (int row = 0; row < answer.length; row++) {
						for (int column = 0; column < answer[row].length; column++) {
							if(answer[row][column] ==alpha) {

								continue DASI;
							}
						}
					}
				}

				//임의의 자리에 알파벳 넣기
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
		//처음 숫자 보여주기
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
