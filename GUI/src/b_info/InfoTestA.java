package b_info;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.*;

import javax.swing.*;

public class InfoTestA {
	// 1. 멤버변수 선언
	JFrame f;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	//label은 그냥 지역변수로.

	ArrayList<Person> list = new ArrayList<Person>();


	// 2. 멤버 객체 생성
	InfoTestA(){


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

		f.setSize(1000, 580);
		f.setVisible(true);




	}

	// 4. 이벤트 등록
	void eventProc() {
		BtnHdlr bh = new BtnHdlr();
		// 버튼과 이벤트 핸들러 연결
		bAdd.addActionListener(bh);
		bShow.addActionListener(bh);
		bSearch.addActionListener(bh);
		bDelete.addActionListener(bh);
		bCancel.addActionListener(bh);
		bExit.addActionListener(bh);

		//전화번호 텍스트 필드 엔터 이벤트 발생.
		//tfTel.addActionListener(new TfHdler());

		//주민번호 텍스트필드 포커스 이벤트
		tfId.addFocusListener(new IdFocus());

	}

	//class IdFocus implements FocusListener{
	class IdFocus extends FocusAdapter{

//		public void focusGained(FocusEvent arg0) {
// 			FocusListener 인터페이스를 상속받은 경우는 꼭 오버라이딩 해줘야 했지만,
//			FocusAdapter를 상속받는 것으로 변경하면 불필요 메시지 오버라이딩 하지 않았도 된다.
//		}


		public void focusLost(FocusEvent arg0) {
			// 포커스를 잃었을때.
			//주민번호를 입력하면, 성별과 지역,나이가 자동 입력되도록.
			//"801212-1234567"
			String id = tfId.getText();
			//성별자동
			char sung = id.charAt(7);
			if(sung == '1'|| sung=='3') {
				tfSex.setText("남자");
			}
			else tfSex.setText("여자");

			//지역 자동 입력.
			char chul =id.charAt(8);
			
			switch(chul) {

			case '0' : tfHome.setText("서울"); break;
			case '1' : tfHome.setText("인천/부산");break;
			case '2' : tfHome.setText("경기");break;
			case '9' : tfHome.setText("제주");break;	
			default:tfHome.setText("한국인");  //break있는 경우, 해당 case 감지 후 바로 switch문을 나가고
			// break가 없는 경우, 해당 case 감지 후에도 밑에 case를 다 수행한다.

			}
			
			//나이 자동 입력.
			int nai2 = Integer.parseInt(id.substring(0,2)); // String을 Int로 변환("80"-->80), Integer.parseInt() 사용
			
			int age = 0;
			int nai3 = id.charAt(7);// 주민번호의 7번째 문자를 얻어서 
			
			// Calendar 클래스를 이용하여 년도값을 구해서 년도 지정.
			
			Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR)	;	
			
			if(nai3=='1'|nai3=='2') {// 1 이거나 2라면 1900
			// 3 이거나 4라면 2000
				tfAge.setText(String.valueOf(year -(1900+nai2)+1)) ; 
			}else{
				tfAge.setText(String.valueOf(age = year -(2000+nai2)+1));
			}

		}

	}



	class TfHdler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			searchTel();
		}
	}


	class BtnHdlr implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Object obj =e.getSource();

			if(obj == bAdd) {
				//입력 버튼이 눌러졌을때.
				insert();
				clearTextField();

			}else if(obj == bShow) { //전체 보기가 눌려졌을 때.
				show();
			}else if(obj == bSearch) {
				searchTel();
			}else if(obj == bDelete) {
				delete();

			}else if(obj == bCancel) {
				clearTextField();

			}else if(obj == bExit) {
				exit(); // 함수를 밖에 만들어서 사용하는 것이 좋음.
			}

		}

	}

	void searchTel(){
		// (1) 사용자 입력한 전화번호 얻어오기.
		String tel = tfTel.getText();

		// (2) ArrayList의 각 Person의 tel과 비교해서 같은지


		// (3) 해당 Person의 멤버값들을 각각 텍스트필드에 출력

		for(Person p : list) {
			if(p.getTel().equals(tel)) {

				tfName.setText(p.getName());
				tfId.setText(p.getId());
				tfSex.setText(p.getGender());
				tfAge.setText(String.valueOf(p.getAge()));
				tfHome.setText(p.getHome());
			}
		}
	}

	void delete() {
		// (1) 사용자 입력한 전화번호 얻어오기.
		String tel = tfTel.getText();

		for(Person p : list) {
			if(p.getTel().equals(tel)) {
				list.remove(p);
				break;  //비교하고 없으면 더이상 하지 않아도 됨.
			}
		}
		clearTextField();
		show();


	}



	void insert() {
		// (1) 각 텍스트 필드의 입력값을 얻어오기
		// (2) 1번값들을 Person 멤버로 지정(1 -생성자 / 2-setter)

		Person p = new Person();
		p.setName(tfName.getText());
		p.setId(tfId.getText());
		p.setTel(tfTel.getText());
		p.setGender(tfSex.getText());
		p.setAge(Integer.parseInt(tfAge.getText()));
		p.setHome(tfHome.getText());


		// (3) ArrayList에 2번 객체를 추가
		list.add(p);

	}
	void clearTextField() {
		tfName.setText(null);tfId.setText(null);tfTel.setText(null);tfSex.setText(null);tfAge.setText(null);tfHome.setText(null);
	}

	void show() {
		ta.setText("====================전체보기=============\n\n");
		for(Person p: list) {
			ta.append(p.toString()); 
			//setText()메소드는 초기화 후 계속 덮어쓰기 하므로 append를 하면 이어 붙어짐.
			//append에는 string만 들어갈 수 있으므로 toString 해줘야함.
		}
	}
	void exit() {
		int result = JOptionPane.showConfirmDialog(null, "정말로 나갈래여??");
		//종료버튼 눌렀을 때 강제프로그램 종료
		if(result == JOptionPane.OK_OPTION) {
			System.exit(0);
		}

	}


	public static void main(String[] args) {

		InfoTestA it = new InfoTestA();
		it.addLayout();
		it.eventProc();



	}

}
