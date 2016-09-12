package kr.capa.acip.dao.reple;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.reple.ComplainreVO;

@Repository("ComplainreDAO")
public class ComplainreDAOImpl implements ComplainreDAO {
	@Autowired
	private SqlSession sqlsession;

	//불평 댓글 보기
	@Override
	public List<ComplainreVO> selectComplainrelist(ComplainreVO complainre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.selectList("kr.capa.acip.Complainre.selectComplainreAll", complainre);
	}
	
	//불평 댓글 등록
	@Override
	public int insertComplainre(ComplainreVO complainre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.insert("kr.capa.acip.Complainre.insertComplainre", complainre);
	}

	//불평 댓글 수정
	@Override
	public int updateComplainre(ComplainreVO complainre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.update("kr.capa.acip.Complainre.updateComplainre", complainre);
	}

	//불평 댓글 삭제
	@Override
	public int deleteComplainre(int crenum) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.delete("kr.capa.acip.Complainre.deleteComplainre", crenum);
	}
}

