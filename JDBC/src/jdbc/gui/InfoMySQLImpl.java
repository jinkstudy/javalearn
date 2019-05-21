package jdbc.gui;

import java.sql.SQLException;
import java.util.ArrayList;

public class InfoMySQLImpl implements InfoModel {
	
	public InfoMySQLImpl() {
		//mysql driver 로딩
		
	}

	@Override
	public void insert(InfoVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<InfoVO> selectAllData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfoVO selectByTel(String tel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InfoVO selectById(String Id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(InfoVO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(InfoVO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	// 실제로 mysql DB에 입력을 함
	
	
}
