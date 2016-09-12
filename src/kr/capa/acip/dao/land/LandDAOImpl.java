package kr.capa.acip.dao.land;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.land.LandVO;

@Repository("LandDAO")
public class LandDAOImpl implements LandDAO {
	@Autowired
	private SqlSession sqlsession;
	
	//새로운 랜드 추가
	@Override
	public int insertLand(LandVO land) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.insert("kr.capa.acip.Land.insertLand", land);
		//kr.capa.acip.Land는 mapper의 namespace
		//insertLand는 mapper의 id
	}

	//랜드 선택
	@Override
	public LandVO selectLand(int lnum) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("kr.capa.acip.Land.selectLand", lnum);
	}
	
	//랜드 전체선택
	@Override
	public List<LandVO> selectAll() throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.selectList("kr.capa.acip.Land.selectAll");
	}

}
