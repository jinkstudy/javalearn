package model.dao;

public  class OracleCon {
	static OracleCon con = null;
	
	// driver 하나만 쓰도록 추상 class를 만들어줌.
	//생성자함수
	private OracleCon() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//1. 드라이버 로딩
		Class.forName(driver);
		System.out.println("단 한번");
	}
	
	public static void getInstance() throws Exception{
		//처음에만 객체 생성하도록.
		if(con == null) {
			con =new OracleCon();
		}
		
	}

}

// 각각의 tab이 db와 연동 될때 하나의 driver만 필요하다.
// 단 한번만 driver로딩되도록 하기 위해 드라이버 로딩을 위한 class를 생성한다.
// OracleCon() 객체를 생성

