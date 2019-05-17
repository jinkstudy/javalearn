package emp.oracle;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class InsertTest {

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
			//String sql = "INSERT INTO emp(empno, ename, sal, deptno) "
					//+ "VALUES(6858,'갑아무개',12000,30)";
			
			//입력한 사원정보에서 이름 알아서 연봉은 60000달러 변경
			String sql = "UPDATE emp SET sal=60000 WHERE ename = '갑아무개' ";
			
			System.out.println(sql); 
			// 4. SQL 전송객체 만들기
			Statement st = con.createStatement(); 
			
			// 5. 전송하기
			// 6 . 닫기
			st.executeUpdate(sql);
			st.close();
			con.close();
			
		}catch(SQLException ex) {
			System.out.println("전송실패:" + ex.getMessage());
		}
		
			
		
		
		//  

	}

}
