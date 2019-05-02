package e_combobox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CalendarEx_월다른방법 {
	// 1. 멤버변수 선언

	JFrame f;
	JComboBox cbY,cbM,cbD;
	JButton b;
	JLabel la;
	
	int [] lastdays= {31,28,31,30,31,30,
						31,31,30,31,32,31};

	// 2. 멤버변수 객체 생성
	CalendarEx_월다른방법(){
		f = new JFrame("콤보박스 예제");

		// 년 : 2015 ~ 2025
		// 월 : 1~12
		Integer[] year = new Integer[11];
		//for(int i=0; year=2015; i<year.length; i++,year;) //for문안에 변수 가능
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
		b = new JButton("▶");
		la = new JLabel("요일");


	}

	void addLayout() {

		//기본 flow 레이아웃
		f.setLayout(new FlowLayout()); //레이아웃을 변경하고 싶다면 setLayout.
		f.add(cbY);
		f.add(new JLabel("년"));
		f.add(cbM);
		f.add(new JLabel("월"));
		f.add(cbD);
		f.add(new JLabel("일"));
		f.add(b);
		f.add(la);

		f.setSize(400, 300);
		f.setVisible(true);


	}
	//4. 이벤트 등록 및 처리
	void eventProc() {
		CbHdlr cb = new CbHdlr();

		cbY.addActionListener(cb);
		cbM.addActionListener(cb);
		b.addActionListener(cb);

	}

	// inner class로 이벤트 생성
	class CbHdlr implements ActionListener{


		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();

			if(obj == cbY | obj == cbM) {
				setDay();
			}else if(obj == b) setDate();

		}
		void setDay() {
			System.out.println("콤보박스이벤트");

		}
		void setDate() {
			System.out.println("버튼이벤트");
		}

	}


	public static void main(String[] args) {
		CalendarEx_월다른방법 c = new CalendarEx_월다른방법();
		c.addLayout();
		c.eventProc();
	}



}
