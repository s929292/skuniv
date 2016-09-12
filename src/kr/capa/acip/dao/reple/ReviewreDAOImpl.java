package kr.capa.acip.dao.reple;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.reple.ReviewreVO;

@Repository("ReviewreDAO")
public class ReviewreDAOImpl implements ReviewreDAO {
	@Autowired
	private SqlSession sqlsession;
	
	//이용후기 댓글 등록
	@Override
	public int insertReviewre(ReviewreVO reviewre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.insert("kr.capa.acip.Reviewre.insertReviewre", reviewre);
	}

	//이용후기 댓글 수정
	@Override
	public int updateReviewre(ReviewreVO reviewre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.update("kr.capa.acip.Reviewre.updateReviewre", reviewre);
	}

	//이용후기 댓글 삭제
	@Override
	public int deleteReviewre(int rrenum) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.delete("kr.capa.acip.Reviewre.deleteReviewre", rrenum);
	}

}
