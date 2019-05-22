package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.Customer;
import model.vo.Video;

public class VideoModel implements VideoDao{
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.0.43:1521:orcl";
	String user = "star";
	String pass = "star";
	
	public VideoModel() throws Exception{
		

		// 1. 드라이버로딩
		Class.forName(driver);
	
	}
	
	
	public void insertVideo(Video vo, int count) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user ,pass);
		// 3. sql 문장 만들기
		String sql = "INSERT INTO video(vno,vgen,vtitle,vdir,vact,vdetail) "
				+ " VALUES(sq_vno.nextval,?,?,?,?,?) ";
		// 4. sql 전송객체 (PreparedStatement)	
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, vo.getGenre());
		st.setString(2,vo.getVideoName());
		st.setString(3, vo.getDirector());
		st.setString(4, vo.getActor());
		st.setString(5, vo.getExp());
		
		
				
		for(int i = 0 ; i<count; i++) {
		// 5. sql 전송	
			 st.executeUpdate(); 
		}
		
		// 6. 닫기
		st.close();
		con.close();
	}


	public ArrayList searchVideo(int sel, String word)  throws Exception{
		
		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		
		
		String [] cols= {"Vtitle","Vdir"};
		// 2. 연결객체
		con = DriverManager.getConnection(url, user ,pass);
		// 3. sql 문장
		
		String sql = "SELECT vno,vgen,vtitle,vdir,vact FROM video WHERE " +cols[sel]+" LIKE '%" + word + "%'"
				+ " order by vno";
		System.out.println(sql);
		
		// 데이터가 몇개 있는지 모르므로 arraylist로 만들어준다.
		ArrayList list = new ArrayList();
		
		// 4. sql 전송객체 얻어오기
		st = con.prepareStatement(sql);
		//5. 전송
		rs = st.executeQuery();
		
		//  6. 결과처리


				while(rs.next()) {

					ArrayList data = new ArrayList ();
					
					//data에 각 컬럼에서 얻어 온 값을 추가.
					data.add(rs.getInt("vno"));
					data.add(rs.getString("vtitle"));
					data.add(rs.getString("vgen"));
					data.add(rs.getString("vdir"));
					data.add(rs.getString("vact"));
					list.add(data);
				}

		
		
		rs.close();
		st.close();
		con.close();
		
		return list;
		
	}

	// pk입력 시 해당 내용 불러오기.
	
	public Video selectByPk(int vNum) throws Exception {
		
		//객체 생성
		Video vo = new Video();
		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		
		// 2. 연결객체
		con = DriverManager.getConnection(url, user ,pass);
		// 3. sql 문장
		
		String vno = String.valueOf(vNum) ;
		String sql = "SELECT * FROM video WHERE vno = ?";
		
		//System.out.println(sql);
		
		
		// 4. sql 전송객체 얻어오기
		st = con.prepareStatement(sql);
		st.setString(1, vno);
		//5. 전송
		rs = st.executeQuery();
		
		while(rs.next()) {
		vo.setVideoNo(rs.getInt("vno"));
		vo.setGenre(rs.getString("vgen"));
		vo.setVideoName(rs.getString("vtitle"));
		vo.setDirector(rs.getString("vdir"));
		vo.setActor(rs.getString("vact"));
		vo.setExp(rs.getString("vdetail"));
		}
		rs.close();
		st.close();
		con.close();
		
		return vo;
	}
	

}
