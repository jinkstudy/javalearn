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

	//String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.0.46:1521:orcl";
	String user = "star";
	String pass = "star";
	Connection con;

	public RentModel() throws Exception{
		// 1. 드라이버로딩

		//Class.forName(driver);
		OracleCon.getInstance();

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
		int result = 0;

		con = DriverManager.getConnection(url, user ,pass);
		String sql = "UPDATE rent SET return_yn = 'T'  WHERE VNO = ? and return_yn = 'F'";

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1,vnum);
		result = st.executeUpdate();

		st.close();
		con.close();


		return result;
	}

	@Override
	public ArrayList selectList() throws Exception {
		
		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;

		con = DriverManager.getConnection(url, user ,pass);
		
		ArrayList list = new ArrayList();

		String sql = "select v.Vno vno,v.vtitle vtitle ,m.Mname mname ,m.Mtel mtel , (to_date(r.Rent_date,'YY-MM-DD')+3) return_date,r.return_yn return_yn" + 
				"  From member m Inner join rent r" + 
				"  on m.mtel=r.mtel " + 
				"  Inner join video v " + 
				"  on v.vno = r.vno " + 
				"  where r.return_yn = 'N' or  r.return_yn = 'F'";
		System.out.println(sql);
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
			data.add(rs.getString("Mname"));
			data.add(rs.getString("Mtel"));
			data.add(rs.getString("return_date"));
			data.add(rs.getString("return_yn"));
			list.add(data);
		}



		rs.close();
		st.close();
		con.close();

		return list;
	}

	public String selectCustName(String tel) throws Exception {

		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		String name = null;
		//2. 연결객체
		con = DriverManager.getConnection(url, user ,pass);
		//3. sql 문장

		String sql = "select mname from member where mtel = ?";
		System.out.println(sql);
		st = con.prepareStatement(sql);
		st.setString(1, tel);
		
		rs = st.executeQuery();
		
		if(rs.next()) {
			name = rs.getString("mname");
		}
		rs.close();
		st.close();
		con.close();

		return name;
	}


}
