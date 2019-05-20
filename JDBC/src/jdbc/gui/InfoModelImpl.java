package jdbc.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.0.117:1521:orcl";
	String user = "scott";
	String pass = "tiger";
	
	// 1. 드라이버 로딩
	// 2. 연결객체 얻어오기

	public InfoModelImpl() throws Exception {

		//  1. 드라이버를 메모리 로딩
		Class.forName(driver);

	}

	public void insert(InfoVO vo) throws Exception{
		// 2. 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user ,pass);
		//System.out.println("연결성공");


		//		
		//		3. sql 문장 만들기(*****)
		//		
		String sql = "INSERT INTO dbtest(tf_name,tf_id,tf_tel,tf_gender,tf_age,tf_home) "
				+ " VALUES(?,?,?,?,?,?) ";
		//System.out.println(sql);

		//		
		//		4. sql 전송 객체 얻어오기
		//			- Statement : 완벽한 sql
		//			- PreparedStatement : 미완성 sql
		//			- CallableStatement : pl-sql의 procedure/function 호출시

		// 완성되지않은 SQL문


		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, vo.getName());
		if(vo.getId().length()==14) {
			st.setString(2,vo.getId());
		}else
		
		st.setString(3,vo.getTel());
		st.setString(4, vo.getGender());
		st.setInt(5,vo.getAge());
		st.setString(6, vo.getHome());

		//5. sql 전송
		//			- INSERT/DELETE/UPDATE / DDL : int executeUpdate()
		//			- SELECT : ResultSet executeQuery()
		//
		int result = st.executeUpdate(); 

		//6. 결과처리

		//7. 닫기
		st.close();
		con.close();

		System.out.println(result + "행 SQL 전송 성공");



		//
		//	


	}
	
	public ArrayList<InfoVO> selectAllData() throws SQLException {
		// 2. 연결객체 얻어오기
			Connection	con = null;
			PreparedStatement st= null;
			ResultSet rs =null;
		try {	
			con = DriverManager.getConnection(url, user ,pass);
		//	3. sql 문장 만들기(*****)
			String sql = "SELECT * FROM DBTEST" ; 
		
		//	4. sql 전송객체 얻어오기
			 st = con.prepareStatement(sql);
			
		//  5. sql 전송:
			 rs = st.executeQuery();
			
		//  6. 결과처리
			ArrayList<InfoVO> list = new ArrayList<InfoVO>();
			
			while(rs.next()) {
				
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("tf_name"));
				vo.setId(rs.getString("tf_id"));
				vo.setTel(rs.getString("tf_tel"));
				vo.setGender(rs.getString("tf_gender"));
				vo.setAge(rs.getInt("tf_age"));
				vo.setHome(rs.getString("tf_home"));
				list.add(vo);
				
			}
			return list;
		
		}finally { // 정상이든 비정상이든 con을 무조건 닫아줘야하므로, 무조건 수행될 수 있도록 finally에 써줘야한다.
			//7.닫기
			rs.close();
			st.close();
			con.close();
		}
			
	}

	public InfoVO selectByTel(String tel) throws SQLException {
		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		InfoVO vo= new InfoVO();
	try {	
		con = DriverManager.getConnection(url, user ,pass);
	//	3. sql 문장 만들기(*****)
		String sql = "SELECT * FROM DBTEST WHERE tf_tel =?" ; 
	
	//	4. sql 전송객체 얻어오기
		 st = con.prepareStatement(sql);
		 st.setString(1, tel);
	//  5. sql 전송:
		 rs = st.executeQuery();
		
	//  6. 결과처리
		
		
		while(rs.next()) {
			
			
			vo.setName(rs.getString("tf_name"));
			vo.setId(rs.getString("tf_id"));
			//vo.setTel(rs.getString("tf_tel"));
			vo.setGender(rs.getString("tf_gender"));
			vo.setAge(rs.getInt("tf_age"));
			vo.setHome(rs.getString("tf_home"));
			
			
		}
		return vo;
	
	}finally { // 정상이든 비정상이든 con을 무조건 닫아줘야하므로, 무조건 수행될 수 있도록 finally에 써줘야한다.
		//7.닫기
		rs.close();
		st.close();
		con.close();
	}
		
		
		
	}
	
	public InfoVO selectById(String Id) throws SQLException {
		Connection	con = null;
		PreparedStatement st= null;
		ResultSet rs =null;
		InfoVO vo= new InfoVO();
	try {	
		con = DriverManager.getConnection(url, user ,pass);
	//	3. sql 문장 만들기(*****)
		String sql = "SELECT * FROM DBTEST WHERE TRIM(tf_id) =?" ;  
	// char 형의 경우 정해놓은 자료형 글자수보다 입력된 값이 작은 경우 공백으로 처리한다. 해당 공백을 trim으로 제거 해줘야 검색이 된다.
	
	//	4. sql 전송객체 얻어오기
		 st = con.prepareStatement(sql);
		 st.setString(1, (Id));
	//  5. sql 전송:
		 rs = st.executeQuery();
		
	//  6. 결과처리
		
		
		while(rs.next()) {
			
			
			vo.setName(rs.getString("tf_name"));
			//vo.setId(rs.getString("tf_id"));
			vo.setTel(rs.getString("tf_tel"));
			vo.setGender(rs.getString("tf_gender"));
			vo.setAge(rs.getInt("tf_age"));
			vo.setHome(rs.getString("tf_home"));
			
			
		}
		return vo;
	
	}finally { // 정상이든 비정상이든 con을 무조건 닫아줘야하므로, 무조건 수행될 수 있도록 finally에 써줘야한다.
		//7.닫기
		rs.close();
		st.close();
		con.close();
	}
		
		
		
	}

	public void modify(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
				Connection con = DriverManager.getConnection(url, user ,pass);
				//System.out.println("연결성공");


				//		
				//		3. sql 문장 만들기(*****)
				//		
				String sql = "UPDATE DBTEST SET tf_name = ?,tf_Id = ?, tf_tel = ?,tf_gender = ?,tf_age = ?,tf_home = ? WHERE tf_tel = ? ";
				//System.out.println(sql);

				//		
				//		4. sql 전송 객체 얻어오기
				//			- Statement : 완벽한 sql
				//			- PreparedStatement : 미완성 sql
				//			- CallableStatement : pl-sql의 procedure/function 호출시

				// 완성되지않은 SQL문


				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, vo.getName());
				st.setString(2,vo.getId());
				st.setString(3,vo.getTel());
				st.setString(4, vo.getGender());
				st.setInt(5,vo.getAge());
				st.setString(6, vo.getHome());
				st.setString(7,vo.getTel());

				//5. sql 전송
				//			- INSERT/DELETE/UPDATE / DDL : int executeUpdate()
				//			- SELECT : ResultSet executeQuery()
				//
				int result = st.executeUpdate(); 

				//6. 결과처리

				//7. 닫기
				st.close();
				con.close();

				System.out.println(result + "행 SQL 수정 성공");



				//
				//	
		
	}

	public void delete(InfoVO vo) throws SQLException{
		// 2. 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user ,pass);
		//System.out.println("연결성공");


		//		
		//		3. sql 문장 만들기(*****)
		//		
		String sql = "DELETE FROM DBTEST WHERE tf_tel = ? ";
		//System.out.println(sql);

		//		
		//		4. sql 전송 객체 얻어오기
		//			- Statement : 완벽한 sql
		//			- PreparedStatement : 미완성 sql
		//			- CallableStatement : pl-sql의 procedure/function 호출시

		// 완성되지않은 SQL문


		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1,vo.getTel());
	

		//5. sql 전송
		//			- INSERT/DELETE/UPDATE / DDL : int executeUpdate()
		//			- SELECT : ResultSet executeQuery()
		//
		int result = st.executeUpdate(); 

		//6. 결과처리

		//7. 닫기
		st.close();
		con.close();

		System.out.println(result + "행 SQL 삭제 성공");



		//
		//	
		
	}
}
