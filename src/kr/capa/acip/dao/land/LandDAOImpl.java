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
	
	//���ο� ���� �߰�
	@Override
	public int insertLand(LandVO land) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.insert("kr.capa.acip.Land.insertLand", land);
		//kr.capa.acip.Land�� mapper�� namespace
		//insertLand�� mapper�� id
	}

	//���� ����
	@Override
	public LandVO selectLand(int lnum) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("kr.capa.acip.Land.selectLand", lnum);
	}
	
	//���� ��ü����
	@Override
	public List<LandVO> selectAll() throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlsession.selectList("kr.capa.acip.Land.selectAll");
	}

}
