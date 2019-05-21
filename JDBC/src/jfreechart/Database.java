package jfreechart;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:oracle:thin:@192.168.0.117:1521:orcl";
	String USER ="scott";
	String PASS = "tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			// 월별 입사한 인원.
			//String sql = "SELECT COUNT (*) cnt , nvl(To_CHAR(Hiredate,'MM'),'그외') HIREDATE FROM EMP GROUP BY  To_CHAR(Hiredate,'MM') ORDER BY HIREDATE";
			
			
			//***************************************************************
			
//			PreparedStatement stmt = con.prepareStatement( sql );	
//
//			ResultSet rset = stmt.executeQuery();
//
//			
//			while( rset.next() ){
//				ArrayList temp = new ArrayList();
//				temp.add( rset.getInt("cnt"));				//****************
//				temp.add( rset.getString("HIREDATE"));		//****************		
//				data.add(temp);
//				System.out.println(rset);
//			}
			
			//업무별 평균 월급
			String sql ="SELECT ROUND(AVG(SAL)) AVG ,NVL(JOB,'그외') JOB FROM EMP GROUP BY JOB";
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("AVG"));				//****************
				temp.add( rset.getString("JOB"));		//****************		
				data.add(temp);
				System.out.println(rset);
			
			}
			
			// 월급을 많이 받는 10명만 출력
//			String sql ="SELECT * FROM (SELECT NVL(SAL,0) SAL,ENAME FROM EMP ORDER BY sal DESC) WHERE ROWNUM<=10";
//			PreparedStatement stmt = con.prepareStatement( sql );	
//
//			ResultSet rset = stmt.executeQuery();
//
//			
//			while( rset.next() ){
//				ArrayList temp = new ArrayList();
//				temp.add( rset.getInt("SAL"));				//****************
//				temp.add( rset.getString("ENAME"));		//****************		
//				data.add(temp);
//				System.out.println(rset);
//			
//			}
			
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
