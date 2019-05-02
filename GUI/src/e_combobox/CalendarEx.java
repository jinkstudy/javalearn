package e_combobox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;


public class CalendarEx {
	// 1. 멤버변수 선언

	JFrame f;
	JComboBox cbY,cbM,cbD;
	JButton b;
	JLabel la;

	int [] lastDays= {31,28,31,30,31,30,
			31,31,30,31,32,31};
	String [] day_of_week= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

	// 2. 멤버변수 객체 생성
	CalendarEx(){
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
	void initDate() {
		setDay();
		Calendar c = Calendar.getInstance();
		cbY.setSelectedItem(c.get(Calendar.YEAR));
		cbM.setSelectedItem(c.get(Calendar.MONTH)+1);
		 // 일 계산
		cbD.setSelectedItem(c.get(Calendar.DATE));
		//System.out.println(c.get(Calendar.DATE));
		setDate();// 요일
	}
	void setDay() {
		// 윤년인 경우, lastDays[1] = 29 로 지정
		// 평년이라면  lastDays[1] = 28
		// [확인] 2016-2 윤년임 29일
		int year = (Integer)cbY.getSelectedItem();
		if((year%4==0 && year%100!=0)||year%400==0) {
			lastDays[1]=29;
		}else {
			lastDays[1] = 28;
		}

		int month = cbM.getSelectedIndex();
		cbD.removeAllItems();
		for (int i = 1; i < lastDays[month]+1; i++) {
			cbD.addItem(i);		
		}

	}
	void setDate() {

		int year = (Integer) cbY.getSelectedItem();
		int month = (Integer) cbM.getSelectedItem();
		int date = (Integer) cbD.getSelectedItem();

		Calendar c = Calendar.getInstance();
		c.set(year,month-1,date); //set 해주지 않으면 오늘날짜의 요일이 나옴.
		//month를 계산할때 1을 빼주지 않으면, 다음달의 요일값이 반환됨 --> 1월==0, 2월 == 1;

		la.setText(day_of_week[c.get(Calendar.DAY_OF_WEEK)-1]); ;

	}
	// inner class로 이벤트 생성
	class CbHdlr implements ActionListener{


		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();

			if(obj == cbY | obj == cbM) {
				setDay();
			}else if(obj == b) setDate();

		}

	}

	public static void main(String[] args) {
		CalendarEx c = new CalendarEx();
		c.addLayout(); // 화면붙이기 및 출력
		c.initDate(); // 날짜 초기화
		c.eventProc(); // 이벤트 처리
	}

}
