package emp.oracle.copy;

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
						
			// 화면에서 입력값 얻어오기
			int empno = 6789;
			String ename = "갓DB";
			int sal = 9000;
			int deptno = 30;
			String job = "IT부서";
			
			// 완성된 sql문으로 작업 하는 경우.
			//String sql = "INSERT INTO emp(empno, ename, sal, deptno, job) "
					//+ " VALUES("+empno+",'"+ename+"',"+sal+","+deptno+",'"+job+"')";
			
			// 4. SQL 전송객체 만들기
			//Statement st = con.createStatement();  // 완성된 sql문
			
			// int result = st.executeUpdate(sql);  //executeUpdate 하면 자동 커밋!  ,Statement인 경우 전송할 시 sql문 끌고감.
			
			
			//미완성된 sql문으로 작업하는 경우
			
			String sql = "INSERT INTO emp(empno, ename, sal, deptno, job) "
					+ " VALUES(?,?,?,?,?)";
			
			System.out.println(sql); 
					
			PreparedStatement st = con.prepareStatement(sql); // 완성되지않은 SQL문
			
			st.setInt(1, empno);
			st.setString(2,ename);
			st.setInt(3,sal);
			st.setInt(4, deptno);
			st.setString(5,job);
			
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
