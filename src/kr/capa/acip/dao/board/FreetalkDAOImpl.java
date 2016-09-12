package kr.capa.acip.dao.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.board.FreetalkVO;

@Repository("FreetalkDAO")
public class FreetalkDAOImpl implements FreetalkDAO {
	@Autowired
	private SqlSession sqlsession;

	//select시 id별 검색
	@Override
	public FreetalkVO selectFreetalk(String mid, int lnum) throws RuntimeException {
		return (FreetalkVO)sqlsession.selectOne("kr.capa.acip.Freetalk.selectFreetalk", mid);
	}
	
	//select시 제목별 검색
	@Override
	public FreetalkVO selectFreetalk2(String ftitle, int lnum) throws RuntimeException {
		return (FreetalkVO)sqlsession.selectOne("kr.capa.acip.Freetalk.selectFreetalk", ftitle);
	}
	
	@Override
	public List<FreetalkVO> selectFreetalklist(FreetalkVO freetalk) throws RuntimeException {
		return sqlsession.selectList("kr.capa.acip.Freetalk.selectFreetalkAll", freetalk);
	}

	@Override
	public int insertFreetalk(FreetalkVO freetalk) throws RuntimeException {
		return sqlsession.insert("kr.capa.acip.Freetalk.insertFreetalk", freetalk);
	}

	@Override
	public int deleteFreetalk(int fnum) throws RuntimeException {
		return sqlsession.delete("kr.capa.acip.Freetalk.deleteFreetalk", fnum);
	}

	@Override
	public int updateFreetalk(FreetalkVO freetalk) throws RuntimeException {
		return sqlsession.update("kr.capa.acip.Freetalk.updateFreetalk", freetalk);
	}

}
