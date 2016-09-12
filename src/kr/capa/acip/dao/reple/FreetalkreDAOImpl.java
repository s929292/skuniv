package kr.capa.acip.dao.reple;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.reple.FreetalkreVO;

@Repository("FreetalkreDAO")
public class FreetalkreDAOImpl implements FreetalkreDAO {
	@Autowired
	private SqlSession sqlsession;
	
	//잡담 댓글 등록
	@Override
	public int insertFreetalkre(FreetalkreVO freetalkre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.insert("kr.capa.acip.Freetalkre.insertFreetalkre", freetalkre);
	}

	//잡담 댓글 수정
	@Override
	public int updateFreetalkre(FreetalkreVO freetalkre) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.update("kr.capa.acip.Freetalkre.updateFreetalkre", freetalkre);
	}

	//잡담 댓글 삭제
	@Override
	public int deleteFreetalkre(int frenum) throws RuntimeException {
		// TODO Auto-generated method stub
		return  sqlsession.delete("kr.capa.acip.Freetalkre.deleteFreetalkre", frenum);
	}
	
	//잡담 댓글 보기
	@Override
	public List<FreetalkreVO> selectFreetalkrelist() throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.selectList("kr.capa.acip.Freetalkre.selectFretalkreAll");
	}



}
