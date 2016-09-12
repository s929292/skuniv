package kr.capa.acip.dao.reple;

import kr.capa.acip.vo.reple.ReviewreVO;

public interface ReviewreDAO {
	public int insertReviewre(ReviewreVO reviewre) throws RuntimeException;
	public int updateReviewre(ReviewreVO reviewre) throws RuntimeException;
	public int deleteReviewre(int rrenum) throws RuntimeException;

}
