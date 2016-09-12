package kr.capa.acip.dao.reple;

import kr.capa.acip.vo.reple.QnareVO;

public interface QnareDAO {
	public int insertQnare(QnareVO qnare) throws RuntimeException;
	public int updateQnare(QnareVO qnare) throws RuntimeException;
	public int deleteQnare(int qrenum) throws RuntimeException;
}
