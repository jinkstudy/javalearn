package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import model.RentDao;


public class RentModel implements RentDao{
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.0.46:1521:orcl";
	String user = "star";
	String pass = "star";
	Connection con;
	
	public RentModel() throws Exception{
		// 1. 드라이버로딩
		
		Class.forName(driver);
		
				
	}

	@Override
	public void rentVideo(String tel, int vnum) throws Exception {
		//2. 연결객체
		 con = DriverManager.getConnection(url, user ,pass);
		//3. sql 문장
		
		String sql = "INSERT INTO RENT(RNO,MTEL,VNO,RENT_DATE,RETURN_YN)"
				+ "  Values(sq_rno.nextval, ?,?,sysdate,'F')";
		
		
		//4. 전송객체
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		st.setInt(2,vnum);
		//5.전송
		 st.executeUpdate(); 
		//6. 닫기
		 st.close();
		con.close();
	}

	@Override
	public int returnVideo(int vnum) throws Exception {
		// TODO Auto-generated method stub
		
		int result = 0;
			return result;
	}

	@Override
	public ArrayList selectList() throws Exception {
		ArrayList list = new ArrayList();
		
		return list;
	}
	
	
}
