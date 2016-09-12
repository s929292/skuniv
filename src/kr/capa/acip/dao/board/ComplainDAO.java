package kr.capa.acip.dao.board;

import kr.capa.acip.vo.board.ComplainVO;

public interface ComplainDAO {
	public ComplainVO selectComplain(String mid, int lnum) throws RuntimeException;
	public ComplainVO selectComplain2(String ctitle, int lnum) throws RuntimeException;
	public int insertComplain(ComplainVO complain) throws RuntimeException;
	public int deleteComplain(int cnum) throws RuntimeException;
	public int updateComplain(ComplainVO complain) throws RuntimeException;

}
