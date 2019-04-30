package b_info;

import java.awt.*;
import javax.swing.*;

public class InfoTestB {
	// 1. 멤버변수 선언
	JFrame f;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	//label은 그냥 지역변수로.
	
	// 2. 멤버 객체 생성
	InfoTestB(){
		
		
		f = new JFrame("정보");
		
		bAdd = new JButton("ADD");
		bShow = new JButton("SHOW");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		
		ta = new JTextArea(10,50);
		
		tfName = new JTextField(15);  // 너비 지정 하나만 해줘도 전체 적용
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();

	}
	
	
	// 3. 화면 붙이기 및 화면 출력
	void addLayout() {
		//South 영역
		JPanel p_south = new JPanel();  //기본 flow 레이아웃
		p_south.setLayout(new GridLayout(1,6)); //레이아웃을 변경하고 싶다면 setLayout.
		p_south.add(bAdd);
		p_south.add(bShow);
		p_south.add(bSearch);
		p_south.add(bDelete);
		p_south.add(bCancel);
		p_south.add(bExit);
		
		//West 영역
		JPanel p_west = new JPanel();
		p_west.setLayout(new GridLayout(6,2));  //6행 2열로 붙이겠다.
		p_west.add(new JLabel("이름"));
		p_west.add(tfName);
		p_west.add(new JLabel("ID"));
		p_west.add(tfId);
		p_west.add(new JLabel("전화번호"));
		p_west.add(tfTel);
		p_west.add(new JLabel("성별"));
		p_west.add(tfSex);
		p_west.add(new JLabel("나이"));
		p_west.add(tfAge);
		p_west.add(new JLabel("집"));
		p_west.add(tfHome);
		
		
		
		
		//전체 프레임에 붙이기.
		
		f.setLayout(new BorderLayout());
		f.add(p_south, BorderLayout.SOUTH);
		f.add(p_west, BorderLayout.WEST);
		f.add(ta, BorderLayout.CENTER);
		
		f.setSize(700, 580);
		f.setVisible(true);
		

		
		
	}
	

	public static void main(String[] args) {
		
		InfoTestB it = new InfoTestB();
		it.addLayout();
		
	

	}

}
