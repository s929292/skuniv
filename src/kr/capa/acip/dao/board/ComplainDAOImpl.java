package kr.capa.acip.dao.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.board.ComplainVO;


@Repository("ComplainDAO")
public class ComplainDAOImpl implements ComplainDAO {
	@Autowired
	private SqlSession sqlsession;

	@Override
	public ComplainVO selectComplain(String mid, int lnum) throws RuntimeException {
		return (ComplainVO)sqlsession.selectOne("kr.capa.acip.Complain.selectComplain", mid);
	}

	@Override
	public ComplainVO selectComplain2(String ctitle, int lnum) throws RuntimeException {
		return (ComplainVO)sqlsession.selectOne("kr.capa.acip.Complain.selectComplain", ctitle);
	}

	@Override
	public int insertComplain(ComplainVO complain) throws RuntimeException {
		return sqlsession.insert("kr.capa.acip.Complain.insertComplain", complain);
	}

	@Override
	public int deleteComplain(int cnum) throws RuntimeException {
		return sqlsession.delete("kr.capa.acip.Complain.deleteComplain", cnum);
	}

	@Override
	public int updateComplain(ComplainVO complain) throws RuntimeException {
		return sqlsession.update("kr.capa.acip.Complain.updateComplain", complain);
	}

}
