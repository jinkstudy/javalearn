package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao{

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.0.36:1521:orcl";
	String user = "star";
	String pass = "star";

	public CustomerModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName(driver);

	}

	public void insertCustomer(Customer vo) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user ,pass);
		// 3. sql 문장 만들기
		String sql = "INSERT INTO member(mname,mtel,msubtel,maddr,memail) "
				+ " VALUES(?,?,?,?,?) ";
		// 4. sql 전송객체 (PreparedStatement)	
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1,vo.getCustName());
		st.setString(2, vo.getCustTel1());
		st.setString(3, vo.getCustTel2());
		st.setString(4, vo.getCustAddr());
		st.setString(5, vo.getCustEmail());
		// 5. sql 전송
	    st.executeUpdate(); 



		//6. 닫기
		st.close();
		con.close();

		


	}

	public Customer selectByTel(String tel) throws Exception{

		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		Customer vo = new Customer();

		try {	
			con = DriverManager.getConnection(url, user ,pass);
			//	3. sql 문장 만들기(*****)
			String sql = "SELECT * FROM member WHERE mtel =?" ; 

			//	4. sql 전송객체 얻어오기
			st = con.prepareStatement(sql);
			st.setString(1, tel);
			//  5. sql 전송:
			rs = st.executeQuery();

			//  6. 결과처리


			while(rs.next()) {


				vo.setCustName(rs.getString("mname"));
				vo.setCustTel1(rs.getString("mtel"));
				vo.setCustTel2(rs.getString("msubtel"));
				vo.setCustAddr(rs.getString("maddr"));
				vo.setCustEmail(rs.getString("memail"));


			}
			return vo;

		}finally { // 정상이든 비정상이든 con을 무조건 닫아줘야하므로, 무조건 수행될 수 있도록 finally에 써줘야한다.
			//7.닫기
			rs.close();
			st.close();
			con.close();
		}

	}

	public Customer selectByName(String name) throws Exception{

		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		Customer vo = new Customer();

		try {	
			con = DriverManager.getConnection(url, user ,pass);
			//	3. sql 문장 만들기(*****)
			String sql = "SELECT * FROM member WHERE mname =?" ; 

			//	4. sql 전송객체 얻어오기
			st = con.prepareStatement(sql);
			st.setString(1, name);
			//  5. sql 전송:
			rs = st.executeQuery();

			//  6. 결과처리


			while(rs.next()) {


				vo.setCustName(rs.getString("mname"));
				vo.setCustTel1(rs.getString("mtel"));
				vo.setCustTel2(rs.getString("msubtel"));
				vo.setCustAddr(rs.getString("maddr"));
				vo.setCustEmail(rs.getString("memail"));


			}
			return vo;

		}finally { // 정상이든 비정상이든 con을 무조건 닫아줘야하므로, 무조건 수행될 수 있도록 finally에 써줘야한다.
			//7.닫기
			rs.close();
			st.close();
			con.close();
		}

	}
	public int updateCustomer(Customer vo) throws Exception{

		int result = 0;

		Connection	con = null;
		PreparedStatement st= null;
		
		

		try {	
			con = DriverManager.getConnection(url, user ,pass);
			//	3. sql 문장 만들기(*****)
			String sql = "UPDATE member SET mname = ?,mtel = ?, msubtel = ?,maddr = ?,memail = ? WHERE mtel = ?";

			//	4. sql 전송객체 얻어오기
			st = con.prepareStatement(sql);
			st.setString(1,vo.getCustName());
			st.setString(2, vo.getCustTel1());
			st.setString(3, vo.getCustTel2());
			st.setString(4, vo.getCustAddr());
			st.setString(5, vo.getCustEmail());
			st.setString(6, vo.getCustTel1());
			// 5. sql 전송
			 result = st.executeUpdate(); 


		}finally { // 정상이든 비정상이든 con을 무조건 닫아줘야하므로, 무조건 수행될 수 있도록 finally에 써줘야한다.
			//7.닫기
			
			st.close();
			con.close();
		}

		return result;
	}
}
