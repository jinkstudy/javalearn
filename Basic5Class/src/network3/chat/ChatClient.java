package network3.chat;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

class ChatClient implements ActionListener,Runnable {
	JFrame f;

	JTextField connTF, sendTF;
	JButton connB, sendB;
	JTextArea ta;

	Socket s;
	BufferedReader in;
	OutputStream out;

	// 추가0 : 대화명을 바꾸기
	JTextField changeNameTF;
	JButton    changeNameB;

	// 추가2 : 방인원의 대명 보여주기
	// 변수 선언
	JList  memberList;
	Vector list;

	public ChatClient() {
		f = new JFrame("Chat Client");


		connTF = new JTextField();
		sendTF = new JTextField();
		connB = new JButton("접 속");
		sendB = new JButton("확 인");
		ta = new JTextArea(15,40);

		// 추가0: 대화명 바꾸기
		changeNameTF	= new JTextField("guest", 10);
		changeNameB		= new JButton("바꾸기");
		JPanel p_changeName = new JPanel();
		p_changeName.add( new JLabel("대화명 : "),"West" );
		p_changeName.add(changeNameTF, "Center");
		p_changeName.add(changeNameB, "East");

		JPanel p_serverName = new JPanel();
		p_serverName.setLayout( new BorderLayout() );
		p_serverName.add( new JLabel("서버입력 : "),"West" );
		p_serverName.add(connTF, "Center");
		p_serverName.add(connB, "East");

		JPanel p_north = new JPanel();
		p_north.setLayout( new GridLayout(1, 2));
		p_north.add( p_changeName );
		p_north.add( p_serverName );

		JPanel p2 = new JPanel();
		p2.setLayout( new BorderLayout() );
		p2.add( new JLabel("메세지입력 : "),"West" );
		p2.add(sendTF,"Center");
		p2.add(sendB, "East");

		// 추가2 : 방인원의 대명 보여주기
		memberList = new JList();
		list		= new Vector();
		JPanel  p_east = new JPanel();
		p_east.setLayout( new BorderLayout());
		p_east.add("North", new JLabel("   우 리 방 멤 버   "));
		p_east.add("Center", memberList );



		f.getContentPane().add("North", p_north);
		f.getContentPane().add("Center", new JScrollPane(ta));

		f.getContentPane().add("South", p2);
		f.getContentPane().add("East", p_east);

		//f.setSize(500, 300);
		f.pack();
		f.setVisible(true);

		connTF.addActionListener(this);
		connB.addActionListener(this);
		sendTF.addActionListener(this);
		sendB.addActionListener(this);

		//  추가0: 대화명 바꾸기
		changeNameTF.addActionListener(this);
		changeNameB.addActionListener(this);
		
		// 윈도우에 x 버튼 처리
		f.addWindowListener(new WindowAdapter() {


			@Override
			public void windowClosing(WindowEvent arg0) {
				if(s.isConnected()) {
					try {
						out.write("/exit bye\n ".getBytes());
						
						in.close();
						out.close();
						s.close();
						
					} catch (IOException e) {
						
					}
				}
				System.exit(0);
			}

		});
		
	}// 생성자 종료

	public void actionPerformed( ActionEvent e ) {
		Object o = e.getSource();

		if( o == connTF || o == connB ) {
			connProc();
		}

		else if( o == sendTF || o == sendB ) {
			sendProc();
			sendTF.setText(null);
		}

		else if( o == changeNameTF || o == changeNameB ) {
			changeNameProc();
		}
	} // actionPerformed ends


	void changeNameProc(){
		//JOptionPane.showMessageDialog(null, "대화명을 바꿉니다");
		//"/name 대화명\n" 서버에 전송
		String chatName = "/name " + changeNameTF.getText()+"\n";
		try {
			out.write(chatName.getBytes());
		} catch (IOException e) {
			ta.append("대화명 변경 실패");
		}


	}

	void connProc() {
		//JOptionPane.showMessageDialog(null, "서버에 접속합니다");
		//입력된 IP와 연결
		try {
			s.close();  //연결 되어 있다면, 닫고 다시 시작할 수 있도록.
			s=null;
		}catch(Exception ex) {}

		try {
			//1. 소켓 생성
			s= new Socket(connTF.getText(),1234);
			//2. 입출력 스트림 얻어오기
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); 
			//InputStream은 byte형이고 BufferedReader는 char형 이므로, InputStreamReader로 char형으로 변형해줘야함.
			//읽을 때 역슬러시를 인지해서 개행을 인지하기 위해서.
			ta.setText("접속성공");

			new Thread(this).start(); 

			enterRoom();

		} catch (Exception ex) {
			ta.setText("접속실패:" + ex.getMessage());
		}


	} // connProc ends
	void enterRoom() {
		// "/start 대화명\n"
		String chatName = "/start " + changeNameTF.getText()+"\n";
		try {
			out.write(chatName.getBytes());
		} catch (IOException ex) {
			ta.append("실패:"+ex.getMessage());
		}

	}
	//Thread run Method 오버라이딩.  --> 연결되자마자 start 함수 호출. 입력받기 위해서.
	public void run() {
		while(s.isConnected()) {
			try {
				String msg =in.readLine();

				StringTokenizer st = new StringTokenizer(msg);
				String keyword = st.nextToken();
				//list.add(keyword);
				
				//멤버 이면, ta에 표시안되고 list에 저장되도록. 
				if(keyword.equals("/member")) {
					list.removeAllElements(); //목록 지우고 다시 띄우기.
					
					while(st.hasMoreTokens()) {
						list.add(st.nextToken());
						
					}
					memberList.setListData(list);
					continue;
				}
				
				ta.append(msg + "\n");
			} catch (IOException ex) {
				ex.printStackTrace();
				return;
			} // readLine --> 역슬러쉬 만나기 전까지 받아줌.

		}

	}


	void sendProc() {
		//JOptionPane.showMessageDialog(null, "메세지를 전송합니다");
		//메시지 보내기

		String msg = sendTF.getText() + "\n";
		try {
			out.write(msg.getBytes());
		} catch (IOException ex) {
			ta.append("메시지 전송 실패:" + ex.getMessage());
		}  //String을 byte형으로 변환해줘야함 --> getBytes.

	}// sendProc ends



	public static void main(String [] args ) {
		new ChatClient();
	}

}// ChatClient ends





