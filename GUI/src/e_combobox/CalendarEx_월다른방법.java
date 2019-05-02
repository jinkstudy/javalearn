package e_combobox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CalendarEx_���ٸ���� {
	// 1. ������� ����

	JFrame f;
	JComboBox cbY,cbM,cbD;
	JButton b;
	JLabel la;
	
	int [] lastdays= {31,28,31,30,31,30,
						31,31,30,31,32,31};

	// 2. ������� ��ü ����
	CalendarEx_���ٸ����(){
		f = new JFrame("�޺��ڽ� ����");

		// �� : 2015 ~ 2025
		// �� : 1~12
		Integer[] year = new Integer[11];
		//for(int i=0; year=2015; i<year.length; i++,year;) //for���ȿ� ���� ����
		for (int i = 0; i < year.length; i++) {
			year[i] = 2015+i;
		}


		Integer[] month = new Integer[12];

		for (int i = 0; i < month.length; i++) {
			month[i]=i+1;
		}
//
//		Integer[] date;
//		int month_get = cbM.get
//		for (int i = 0; i < month.length; i++) {
//			if (month_get == 1| month_get==3 |month_get==5 |month_get==7 |month_get==8 |
//					month_get==10 |month_get==12 ) {
//				date = new Integer[31];
//				for (int j = 0; j < 31; j++) {
//					date[j]=j;
//				}
//			}
//			else if(month[i]==2) {
//
//			}else {
//				date = new Integer[30];
//				for (int j = 0; j < 30; j++) {
//					date[j]=j;
//				}
//
//			}
//		}



		cbY = new JComboBox(year);
		cbM = new JComboBox(month);
		cbD = new JComboBox();
		b = new JButton("��");
		la = new JLabel("����");


	}

	void addLayout() {

		//�⺻ flow ���̾ƿ�
		f.setLayout(new FlowLayout()); //���̾ƿ��� �����ϰ� �ʹٸ� setLayout.
		f.add(cbY);
		f.add(new JLabel("��"));
		f.add(cbM);
		f.add(new JLabel("��"));
		f.add(cbD);
		f.add(new JLabel("��"));
		f.add(b);
		f.add(la);

		f.setSize(400, 300);
		f.setVisible(true);


	}
	//4. �̺�Ʈ ��� �� ó��
	void eventProc() {
		CbHdlr cb = new CbHdlr();

		cbY.addActionListener(cb);
		cbM.addActionListener(cb);
		b.addActionListener(cb);

	}

	// inner class�� �̺�Ʈ ����
	class CbHdlr implements ActionListener{


		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();

			if(obj == cbY | obj == cbM) {
				setDay();
			}else if(obj == b) setDate();

		}
		void setDay() {
			System.out.println("�޺��ڽ��̺�Ʈ");

		}
		void setDate() {
			System.out.println("��ư�̺�Ʈ");
		}

	}


	public static void main(String[] args) {
		CalendarEx_���ٸ���� c = new CalendarEx_���ٸ����();
		c.addLayout();
		c.eventProc();
	}



}
