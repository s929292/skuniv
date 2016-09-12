package kr.capa.acip.dao.board;

import kr.capa.acip.vo.board.QnaVO;

public interface QnaDAO {
	public QnaVO selectQna(String mid, int lnum) throws RuntimeException;
	public QnaVO selectQna2(String qtitle, int lnum) throws RuntimeException;
	public int insertQna(QnaVO Qna) throws RuntimeException;
	public int deleteQna(int qnum) throws RuntimeException;
	public int updateQna(QnaVO Qna) throws RuntimeException;

}
