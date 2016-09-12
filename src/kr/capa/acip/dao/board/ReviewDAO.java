package kr.capa.acip.dao.board;

import kr.capa.acip.vo.board.ReviewVO;

public interface ReviewDAO {
	public ReviewVO selectReview(String mid, int lnum) throws RuntimeException;
	public ReviewVO selectReview2(String rtitle, int lnum) throws RuntimeException;
	public int insertReview(ReviewVO Review) throws RuntimeException;
	public int deleteReview(int rnum) throws RuntimeException;
	public int updateReview(ReviewVO Review) throws RuntimeException;

}
