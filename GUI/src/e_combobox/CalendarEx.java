package e_combobox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;


public class CalendarEx {
	// 1. ������� ����

	JFrame f;
	JComboBox cbY,cbM,cbD;
	JButton b;
	JLabel la;

	int [] lastDays= {31,28,31,30,31,30,
			31,31,30,31,32,31};
	String [] day_of_week= {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

	// 2. ������� ��ü ����
	CalendarEx(){
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
	void initDate() {
		setDay();
		Calendar c = Calendar.getInstance();
		cbY.setSelectedItem(c.get(Calendar.YEAR));
		cbM.setSelectedItem(c.get(Calendar.MONTH)+1);
		 // �� ���
		cbD.setSelectedItem(c.get(Calendar.DATE));
		//System.out.println(c.get(Calendar.DATE));
		setDate();// ����
	}
	void setDay() {
		// ������ ���, lastDays[1] = 29 �� ����
		// ����̶��  lastDays[1] = 28
		// [Ȯ��] 2016-2 ������ 29��
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
		c.set(year,month-1,date); //set ������ ������ ���ó�¥�� ������ ����.
		//month�� ����Ҷ� 1�� ������ ������, �������� ���ϰ��� ��ȯ�� --> 1��==0, 2�� == 1;

		la.setText(day_of_week[c.get(Calendar.DAY_OF_WEEK)-1]); ;

	}
	// inner class�� �̺�Ʈ ����
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
		c.addLayout(); // ȭ����̱� �� ���
		c.initDate(); // ��¥ �ʱ�ȭ
		c.eventProc(); // �̺�Ʈ ó��
	}

}
