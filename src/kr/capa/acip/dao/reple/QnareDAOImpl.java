package kr.capa.acip.dao.reple;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.reple.QnareVO;

@Repository("QnareDAO")
public class QnareDAOImpl implements QnareDAO {
	@Autowired
	private SqlSession sqlsession;
	
	//Q&A 댓글 등록
	@Override
	public int insertQnare(QnareVO qnare) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.insert("kr.capa.acip.Qnare.insertQnare", qnare);
	}

	//Q&A 댓글 수정
	@Override
	public int updateQnare(QnareVO qnare) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.update("kr.capa.acip.Qnare.updateQnare", qnare);
	}

	//Q&A 댓글 삭제
	@Override
	public int deleteQnare(int qrenum) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.delete("kr.capa.acip.Qnare.deleteQnare", qrenum);
	}

}
