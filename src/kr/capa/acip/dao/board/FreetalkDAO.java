package kr.capa.acip.dao.board;

import java.util.List;

import kr.capa.acip.vo.board.FreetalkVO;

public interface FreetalkDAO {
	public FreetalkVO selectFreetalk(String mid, int lnum) throws RuntimeException;
	public FreetalkVO selectFreetalk2(String ftitle, int lnum) throws RuntimeException;
	public List<FreetalkVO> selectFreetalklist(FreetalkVO freetalk) throws RuntimeException;
	public int insertFreetalk(FreetalkVO freetalk) throws RuntimeException;
	public int deleteFreetalk(int fnum) throws RuntimeException;
	public int updateFreetalk(FreetalkVO freetalk) throws RuntimeException;
	
}
