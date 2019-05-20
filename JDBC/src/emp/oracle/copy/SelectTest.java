package emp.oracle.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
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
				
				System.out.println("연결성공");
			
			}catch (Exception ex) {
				// TODO Auto-generated catch block
				System.out.println("연결실패:" +ex.getMessage());
			}
		
		try {
			
			// 3. SQL 문장만들기
		
			//입력한 사원정보에서 이름 알아서 연봉은 60000달러 변경
//			int empno = 7788;
//			String sql = "SELECT *FROM emp WHERE empno= ?";
//			
//			System.out.println(sql); 
//			// 4. SQL 전송객체 만들기
//			//Statement st = con.createStatement(); 
//			PreparedStatement st = con.prepareStatement(sql); //완성된 sql문도 preparedstatement 사용 권장.
//			st.setInt(1, empno);
//			
//			
//			// 5. 전송하기
//			ResultSet rs = st.executeQuery(); //sql 연결해서 전송받은것 ResutSet에 저장하기.
//			//pk 검색 시에는 while 대신 if문 쓴다
//			if(rs.next()) {
//				System.out.println(rs.getInt("EMPNO")+"/"
//						+rs.getString("ENAME")+"/" +rs.getInt("SAL")); //rs.getInt("컬럼명")
//			}
			
//			while(rs.next()) {
//				System.out.println(rs.getInt("EMPNO")+"/"
//						+rs.getString("ENAME")+"/" +rs.getInt("SAL")); //rs.getInt("컬럼명")
//			}
			
			// 사원 테이블의 총 사원수와 월급의 평균을 출력하세요.
			
			String sql = "SELECT count(*) cnt,Round(avg(sal)) avg  FROM emp";
			System.out.println(sql); 
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				System.out.println("전체학생수 : "+rs.getInt("cnt")+"명"+"/"
						+"월급 평균: " +rs.getInt("avg")); //rs.getInt("컬럼명")
			}
			// 6 . 닫기
			rs.close();
			st.close();
			con.close();
			
		}catch(SQLException ex) {
			System.out.println("전송실패:" + ex.getMessage());
		}
		
		
		
	}

}
