package kr.capa.acip.dao.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.board.QnaVO;

@Repository("QnaDAO")
public class QnaDAOImpl implements QnaDAO {
	@Autowired
	private SqlSession sqlsession;

	@Override
	public QnaVO selectQna(String mid, int lnum) throws RuntimeException {
		return (QnaVO)sqlsession.selectOne("kr.capa.acip.Qna.selectQna", mid);
	}

	@Override
	public QnaVO selectQna2(String qtitle, int lnum) throws RuntimeException {
		return (QnaVO)sqlsession.selectOne("kr.capa.acip.Qna.selectQna", qtitle);
	}

	@Override
	public int insertQna(QnaVO Qna) throws RuntimeException {
		return sqlsession.insert("kr.capa.acip.Qna.insertQna", Qna);
	}

	@Override
	public int deleteQna(int qnum) throws RuntimeException {
		return sqlsession.delete("kr.capa.acip.Qna.deleteRQna", qnum);
	}

	@Override
	public int updateQna(QnaVO Qna) throws RuntimeException {
		return sqlsession.update("kr.capa.acip.Qna.updateQna", Qna);
	}

}
