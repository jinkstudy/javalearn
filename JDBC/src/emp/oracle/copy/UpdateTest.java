package emp.oracle.copy;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class UpdateTest {

	public static void main(String[] args)  {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@192.168.0.117:1521:orcl";
		String user = "scott";
		String pass = "tiger";
		
		Connection con = null;
	
		try {
			
			//  1. 드라이버를 메모리 로딩
			//Class.forName(****) 하면 ****에 해당하는 경로를 찾아서 로딩시켜줌.
			 Class.forName(driver);
			// 2. 연결객체 얻어오기
				con = DriverManager.getConnection(url, user ,pass);
				//System.out.println("연결성공");
			
			}catch (Exception ex) {
				// TODO Auto-generated catch block
				System.out.println("연결실패:" +ex.getMessage());
			}
		
	
		try {
			
			// 3. SQL 문장만들기
						
			// 화면에서 입력값 얻어오기
			int empno = 6789;
			String ename = "홍숙자";
			int sal = 12000;
			int deptno = 20;
			String job = "개발";
			
			
			//(1) sql 문장 변경
			String sql = "UPDATE emp SET ename = ?,sal = ?, deptno = ?, job = ? WHERE empno = 6789 ";
			
			System.out.println(sql); 
					
			PreparedStatement st = con.prepareStatement(sql); // 완성되지않은 SQL문
			//(*) ? 지정
			
			
			st.setString(1,ename);
			st.setInt(2,sal);
			st.setInt(3, deptno);
			st.setString(4,job);
			// 5. 전송하기
			// 6 . 닫기
			
			
			int result = st.executeUpdate(); // 완성되지 않은 SQL문의 경우 sql을 앞에서끌고가므로, 전송할때는 안끌고감.
			con.close();
			System.out.println(result + "행 SQL 전송 성공");
		}catch(SQLException ex) {
			System.out.println("전송실패:" + ex.getMessage());
		}
		
			
		
		
		//  

	}

}
