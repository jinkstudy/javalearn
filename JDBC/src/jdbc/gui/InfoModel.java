package jdbc.gui;

import java.sql.SQLException;
import java.util.ArrayList;


// 확장성을 윌해 Interface를 만들어서 쓰는 것이 좋다. 

public interface InfoModel {
	
	public void insert(InfoVO vo) throws Exception;
	public ArrayList<InfoVO> selectAllData() throws SQLException;
	public InfoVO selectByTel(String tel) throws SQLException;
	public InfoVO selectById(String Id) throws SQLException;
	public void modify(InfoVO vo) throws SQLException;
	public void delete(InfoVO vo) throws SQLException;
	

}
