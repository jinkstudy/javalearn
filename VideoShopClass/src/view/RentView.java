package  view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	
	RentTableModel rentTM;
	

	
	//==============================================
	//	 생성자 함수
	public RentView(){
		addLayout();	//화면구성
		eventProc();	//DB연결
		connectDB();
	}
	
	// DB 연결
	void connectDB(){
		
	}
	
	
	// 이벤트 등록
	public void eventProc(){

		                         
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
