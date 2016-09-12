package kr.capa.acip.dao.reple;

import java.util.List;

import kr.capa.acip.vo.reple.ComplainreVO;

public interface ComplainreDAO {
	public List<ComplainreVO> selectComplainrelist(ComplainreVO complainre) throws RuntimeException;
	public int insertComplainre(ComplainreVO complainre) throws RuntimeException;
	public int updateComplainre(ComplainreVO complainre) throws RuntimeException;
	public int deleteComplainre(int crenum) throws RuntimeException;	    
}
