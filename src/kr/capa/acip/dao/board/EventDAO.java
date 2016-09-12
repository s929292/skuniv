package kr.capa.acip.dao.board;

import java.util.List;

import kr.capa.acip.vo.board.EventVO;

public interface EventDAO {
	public List<EventVO> selectEvent(String land) throws RuntimeException;
	public int insertEvent(EventVO event) throws RuntimeException;
	public int deleteEvent(String evnum) throws RuntimeException;
	public int updateEvent(EventVO event) throws RuntimeException;
}
