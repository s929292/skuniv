package kr.capa.acip.dao.reple;

import java.util.List;

import kr.capa.acip.vo.reple.FreetalkreVO;

public interface FreetalkreDAO {
	public List<FreetalkreVO> selectFreetalkrelist() throws RuntimeException;
	public int insertFreetalkre(FreetalkreVO freetalkre) throws RuntimeException;
	public int updateFreetalkre(FreetalkreVO freetalkre) throws RuntimeException;
	public int deleteFreetalkre(int frenum) throws RuntimeException;

}
