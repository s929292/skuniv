package kr.capa.acip.dao.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.board.EventVO;

@Repository("EventDAO")
public class EventDAOImpl implements EventDAO {
	@Autowired
	private SqlSession sqlsession;
	
	@Override  
	public List<EventVO> selectEvent(String land) throws RuntimeException {
		return sqlsession.selectList("kr.capa.acip.Event.selectEvent", land);
	}

	@Override
	public int insertEvent(EventVO event) throws RuntimeException {
		return sqlsession.insert("kr.capa.acip.Event.insertEvent", event);
	} 

	@Override
	public int deleteEvent(String evnum) throws RuntimeException {
		return sqlsession.delete("kr.capa.acip.Event.deleteEvent", evnum);
	}

	@Override
	public int updateEvent(EventVO event) throws RuntimeException {
		return sqlsession.update("kr.capa.acip.Event.updateEvent", event);
	}

}
