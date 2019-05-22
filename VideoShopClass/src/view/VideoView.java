package	 view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.AbstractTableModel; 
import javax.swing.text.TabExpander;


public class VideoView extends JPanel 
{	
	//	member field
	JTextField	tfVideoNum, tfVideoTitle, tfVideoDirector, tfVideoActor;
	JComboBox	comVideoJanre;
	JTextArea	taVideoContent;

	JCheckBox	cbMultiInsert;
	JTextField	tfInsertCount;

	JButton		bVideoInsert, bVideoModify, bVideoDelete;

	JComboBox	comVideoSearch;
	JTextField	tfVideoSearch;
	JTable		tableVideo; // view 역할
	
	VideoTableModel tbModelVideo; // model 역할
	
	

	//##############################################
	//	constructor method
	public VideoView(){
		addLayout(); 	// 화면설계
		initStyle();
		eventProc();
		connectDB();	// DB연결
	}
	
	public void connectDB(){	// DB연결
		
	}
	
	//이벤트 처리
	public void eventProc(){
		//핸들러 객체 생성
		ButtonEventHandler hdlr = new ButtonEventHandler();
		bVideoInsert.addActionListener(hdlr);
		bVideoModify.addActionListener(hdlr);
		bVideoDelete.addActionListener(hdlr);
		tfVideoSearch.addActionListener(hdlr);
		
	}		
	
	// 버튼 이벤트 핸들러 만들기
	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();
			
			if(o==bVideoInsert){  
				registVideo();					// 비디오 등록
			}
			else if(o==bVideoModify){  
				modifyVideo();					// 비디오 정보 수정
			}
			else if(o==bVideoDelete){  
				deleteVideo();					// 비디오 정보 삭제
			}
			else if(o==tfVideoSearch){
				searchVideo();					// 비디오 검색
			}
		}
	}
	
	// 입고 클릭시  - 비디오 정보 등록
	public void registVideo(){
		 JOptionPane.showMessageDialog(null, "입고");
	
	}
	
	public void initStyle(){   // 입력하지 못하게 만듬.
		tfVideoNum.setEditable(false); // setEditable 편집불가 , setEnabled은 값도 받아올 수 없음.
		tfInsertCount.setEditable(false); 		
		tfInsertCount.setHorizontalAlignment(JTextField.RIGHT); // 글자 오른쪽 정렬
	}
	
	// 수정 클릭시 - 비디오 정보 수정
	public void modifyVideo(){
		JOptionPane.showMessageDialog(null, "수정");
	}
	
	// 삭제 클릭시 - 비디오 정보 삭제
	public void deleteVideo(){
		
		JOptionPane.showMessageDialog(null, "삭제");
	}
	
	// 비디오현황검색
		public void searchVideo(){
			JOptionPane.showMessageDialog(null, "검색");
		}
		
	
	//  화면설계 메소드
	public void addLayout(){
		//멤버변수의 객체 생성
		tfVideoNum = new JTextField();
		tfVideoTitle = new JTextField();
		tfVideoDirector = new JTextField();
		tfVideoActor = new JTextField();
		
		String []cbJanreStr = {"멜로","엑션","스릴","코미디"};
		comVideoJanre = new JComboBox(cbJanreStr);
		taVideoContent = new JTextArea();
		
		cbMultiInsert = new JCheckBox("다중입고");
		tfInsertCount = new JTextField("1",5);
	
		bVideoInsert = new JButton("입고");
		bVideoModify = new JButton("수정");
		bVideoDelete = new JButton("삭제");
		
		String []cbVideoSearch = {"제목","감독"};
		comVideoSearch = new JComboBox(cbVideoSearch);
		tfVideoSearch = new JTextField(15);
		
		tbModelVideo = new VideoTableModel();
		tableVideo = new JTable(tbModelVideo); // videotavlemodel과 Jtable연동해줘야함.

		//*********************************************************************
		// 화면 구성
		
		
		// 왼쪽 영역
		JPanel p_west = new JPanel();
		//p_west.setBorder(new TitledBorder("비디오정보입력"));
		
		p_west.setLayout(new BorderLayout());
			// 왼쪽 - 메인 영역
			JPanel p_west_c = new JPanel();
			p_west_c.setLayout(new BorderLayout());
				
				// 왼쪽 -메인 -센터
				JPanel p_west_c_c = new JPanel();
				p_west_c_c.setBorder(new TitledBorder("비디오 정보 입력"));
				//p_west_c_c.setLayout(new GridLayout(2,1));
				p_west_c_c.setLayout(new BorderLayout());				
					//왼쪽 - 메인 - 센터 - 북쪽 (비디오 정보부분)
					JPanel p_west_c_c_n = new JPanel();
					p_west_c_c_n.setLayout(new GridLayout(5,2));
					//비디오 번호
					p_west_c_c_n.add(new JLabel("비디오번호"));
					p_west_c_c_n.add(tfVideoNum);
						
					//장르
					p_west_c_c_n.add(new JLabel("장르"));
					p_west_c_c_n.add(comVideoJanre);
					
					//제목
					p_west_c_c_n.add(new JLabel("제목"));
					p_west_c_c_n.add(tfVideoTitle);
					//감독
					p_west_c_c_n.add(new JLabel("감독"));
					p_west_c_c_n.add(tfVideoDirector);
					//배우
					p_west_c_c_n.add(new JLabel("배우"));
					p_west_c_c_n.add(tfVideoActor);
				
					//왼쪽 -메인 - 센터  - 센터 (설명부분)
					JPanel p_west_c_c_c = new JPanel();
					p_west_c_c_c.setLayout(new BorderLayout());
					p_west_c_c_c.add(new JLabel("설명"),BorderLayout.WEST);
					p_west_c_c_c.add(taVideoContent,BorderLayout.CENTER);
				
					
//				p_west_c_c.add(p_west_c_c_n);
//				p_west_c_c.add(p_west_c_c_c);
				p_west_c_c.add(p_west_c_c_n,BorderLayout.NORTH);
				p_west_c_c.add(p_west_c_c_c,BorderLayout.CENTER);	
				
			p_west_c.add(p_west_c_c, BorderLayout.CENTER);
			
			
			
			
			
			
			 	// 왼쪽 -메인 -남쪽
			
			JPanel p_west_c_s = new JPanel();
			p_west_c_s.setBorder(new TitledBorder("다중입력시 선택하시오"));	
			p_west_c_s.add(cbMultiInsert);
			p_west_c_s.add(tfInsertCount);
			p_west_c_s.add(new JLabel("개")); //이벤트 처리 없으므로 생성 후 바로.
			p_west_c.add(p_west_c_s, BorderLayout.SOUTH);
			
							
			
		
		p_west.add(p_west_c, BorderLayout.CENTER);
			// 왼족 - 버튼 영역
			JPanel p_west_south = new JPanel();
			p_west_south.setLayout(new GridLayout(1,3));
			p_west_south.add(bVideoInsert);
			p_west_south.add(bVideoModify);
			p_west_south.add(bVideoDelete);
			
		p_west.add(p_west_south, BorderLayout.SOUTH);
		
		
		
		
		// 오른쪽 영역
		JPanel p_east = new JPanel();
		p_east.setBorder(new TitledBorder("비디오검색"));
		
		p_east.setLayout(new BorderLayout());
		p_east.add(new JScrollPane(tableVideo),BorderLayout.CENTER); 
		
		// JTable은 JScrollPane에 붙인후 덧붙여야 뜬다.
			JPanel p_east_north = new JPanel();
			p_east_north.add(comVideoSearch);
			p_east_north.add(tfVideoSearch);
		p_east.add(p_east_north,BorderLayout.NORTH);	
		
		// 전체영역에 붙이기
		setLayout(new GridLayout(1,2));
		add(p_west);
		add(p_east);
		
		
	}
	
	//화면에 테이블 붙이는 메소드 
	class VideoTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","장르","감독","배우"};

		//=============================================================
		// 1. 기본적인 TabelModel  만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

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


