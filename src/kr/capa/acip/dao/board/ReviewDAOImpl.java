package kr.capa.acip.dao.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.board.ReviewVO;

@Repository("ReviewDAO")
public class ReviewDAOImpl implements ReviewDAO {
	@Autowired
	private SqlSession sqlsession;

	@Override
	public ReviewVO selectReview(String mid, int lnum) throws RuntimeException {
		return (ReviewVO)sqlsession.selectOne("kr.capa.acip.Review.selectReview", mid);
	}

	@Override
	public ReviewVO selectReview2(String rtitle, int lnum) throws RuntimeException {
		return (ReviewVO)sqlsession.selectOne("kr.capa.acip.Review.selectReview", rtitle);
	}

	@Override
	public int insertReview(ReviewVO Review) throws RuntimeException {
		return sqlsession.insert("kr.capa.acip.Review.insertReview", Review);
	}

	@Override
	public int deleteReview(int rnum) throws RuntimeException {
		return sqlsession.delete("kr.capa.acip.Review.deleteReview", rnum);
	}

	@Override
	public int updateReview(ReviewVO Review) throws RuntimeException {
		return sqlsession.update("kr.capa.acip.Review.updateReview", Review);
	}

}
