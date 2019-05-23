package  view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.RentModel;



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	
	RentTableModel rentTM;
	//*******
	// 비지니스 로직 역할을 하는 모델 클래스 선언
	RentModel db;
	

	
	//==============================================
	//	 생성자 함수
	public RentView(){
		addLayout();	//화면구성
		eventProc();	//DB연결
		connectDB();
		selectNonReturn(); //화면에 뜨자마자 미납목록을 띄울 것.
	}
	
	// DB 연결 --객체생성
	void connectDB(){
		try {
			db = new RentModel();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// 이벤트 등록
	public void eventProc(){
		ActionHandler ah = new ActionHandler();
		// 이벤트가 발생할 객체들을 핸들러와 연결
		
		tfRentTel.addActionListener(ah);
		bRent.addActionListener(ah);
		bReturn.addActionListener(ah);
		                         
	}
	
	// 핸들러 만들기
	class ActionHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			//System.out.println("이벤트확인");
			Object evt = e.getSource();
			if(evt == tfRentTel) {
				selectCustName();
			}else if(evt == bRent) {
				rentVideo();
				selectNonReturn();
			}else if(evt == bReturn) {
				returnVideo();
				selectNonReturn();
			}
			
		}
		
	}
	
	/*	객체 생성 및 화면 구성   */
	void addLayout(){
		//객체 생성
		tfRentTel = new JTextField();
		tfRentCustName = new JTextField();
		tfRentVideoNum = new JTextField();
		bRent = new JButton("대여");
		
		tfReturnVideoNum = new JTextField(15);
		bReturn = new JButton("반납");
		
		rentTM = new RentTableModel();
		tableRecentList = new JTable(rentTM);
		
		//화면 구성
		
		//위쪽
		JPanel p_north = new JPanel();
		p_north.setLayout(new GridLayout(1,2));
		
			//위쪽 - 왼쪽
			JPanel p_north_west = new JPanel();
			p_north_west.setBorder(new TitledBorder("대여"));
			p_north_west.setLayout(new GridLayout(4,2));
			p_north_west.add(new JLabel("전화번호"));
			p_north_west.add(tfRentTel);
			p_north_west.add(new JLabel("고객명"));
			p_north_west.add(tfRentCustName);
			p_north_west.add(new JLabel("비디오번호"));
			p_north_west.add(tfRentVideoNum);
			p_north_west.add(bRent);
			
			//위쪽 - 오른쪽
			JPanel p_north_east = new JPanel();
			p_north_east.setBorder(new TitledBorder("반납"));
			p_north_east.add(new JLabel("비디오 번호"));
			p_north_east.add(tfReturnVideoNum);
			p_north_east.add(bReturn);
			
		// 위쪽 레이아웃	
		p_north.add(p_north_west);
		p_north.add(p_north_east);
		
		
		
		//센터
		JPanel p_center = new JPanel();
		
		p_center.setLayout(new BorderLayout());
		p_center.add(new JScrollPane(tableRecentList),BorderLayout.NORTH);
		
		
		
		//전체 붙이기
		setLayout(new BorderLayout());
		add(p_north,BorderLayout.NORTH);
		add(p_center,BorderLayout.CENTER);
		
		
	}
	// 비디오 반납 시 처리하는 메소드
	
	public void returnVideo() {
		
		int vnum = Integer.parseInt(tfReturnVideoNum.getText());
		try {
			int result = db.returnVideo(vnum);
			JOptionPane.showMessageDialog(null, "반납성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "반납실패"+e.getMessage());
		}
		
	}
	//비디오 대여 시 처리하는 메소드
	public void rentVideo() {
		// 1. 화면에서 필요한 정보를 얻어오기
		String tel =tfRentTel.getText();
		int vnum =Integer.parseInt(tfRentVideoNum.getText());
		// 2. 모델쪽 메소드 호출
		try {
			db.rentVideo(tel, vnum);
			JOptionPane.showMessageDialog(null, "대여성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "입력실패"+e.getMessage());
		}
		// 3. 대여 후 결과처리
	
		
	}
	
	public void selectNonReturn() {
		try {
			rentTM.data = db.selectList();
			rentTM.fireTableDataChanged(); // 목록 가져온 후 데이터 변경됐다는 신호를 줌.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "실패"+e.getMessage());
		}
	}
	
	// 전화번호 입력 후 엔터, 고객명 출력
	public void selectCustName() {
		String tel = tfRentTel.getText();
		try {
			
			tfRentCustName.setText(db.selectCustName(tel)) ;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "검색실패"+e.getMessage());
		}
		
		
		
	}

	class RentTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","고객명","전화번호","반납예정일","반납여부"};

			public int getColumnCount() { 
		        return columnNames.length; 
		    } 
		     
		    public int getRowCount() { 
		        return data.size(); 
		    } 

		    public Object getValueAt(int row, int col) { 
				ArrayList temp = (ArrayList)data.get( row );
		        return temp.get( col ); 
		    }
		    
		    public String getColumnName(int col){
		    	return columnNames[col];
		    }
	}

	

	
}
