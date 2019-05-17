package emp.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://192.168.0.117:3306/test?serverTimezone=UTC&useSSL=false";
		String user = "scott";
		String pass = "tiger";
		
		Connection con = null;
	
		try {
			
			//  1. 드라이버를 메모리 로딩
			//Class.forName(****) 하면 ****에 해당하는 경로를 찾아서 로딩시켜줌.
			 Class.forName(driver);
			// 2. 연결객체 얻어오기
				con = DriverManager.getConnection(url, user ,pass);
				
				System.out.println("연결성공");
			
			}catch (Exception ex) {
				// TODO Auto-generated catch block
				System.out.println("연결실패:" +ex.getMessage());
			}
		
		try {
			
			// 3. SQL 문장만들기
		
			//입력한 사원정보에서 이름 알아서 연봉은 60000달러 변경
			String sql = "SELECT *FROM temp order by sal desc";
			
			System.out.println(sql); 
			// 4. SQL 전송객체 만들기
			Statement st = con.createStatement(); 
			// 5. 전송하기
			ResultSet rs = st.executeQuery(sql); //sql 연결해서 전송받은것 ResutSet에 저장하기.
			while(rs.next()) {
				System.out.println(rs.getInt("EMPNO")+"/"
						+rs.getString("ENAME")+"/" +rs.getInt("SAL")); //rs.getInt("컬럼명")
			}
			
			
			// 6 . 닫기
			
			st.close();
			con.close();
			
		}catch(SQLException ex) {
			System.out.println("전송실패:" + ex.getMessage());
		}
		
		
		
	}

}
