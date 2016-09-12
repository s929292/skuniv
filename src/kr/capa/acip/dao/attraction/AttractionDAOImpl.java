package kr.capa.acip.dao.attraction;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.capa.acip.vo.attraction.AttractionVO;

@Repository("AttractionDAO")
public class AttractionDAOImpl implements AttractionDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//���ο� �ⱸ �߰�
	@Override
	public int insertAttraction(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.insert("kr.capa.acip.Attraction.insertAttraction", attraction);
		//kr.capa.acip.Attraction�� mapper�� namespace
		//insertAttraction�� mapper�� id
	} 

	//�ⱸ ����
	@Override
	public AttractionVO selectAttraction(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("kr.capa.acip.Attraction.selectAttraction", attraction);
	}
	
	//�ⱸ�� ����ο� ������Ʈ
	@Override
	public int updateWaitnum(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.update("kr.capa.acip.Attraction.updateWaitnum", attraction);
	}

	//�ⱸ�� ���ð� ������Ʈ
	@Override
	public int updateWaittime(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return (int) sqlSession.update("kr.capa.acip.Attraction.updateWaittime", attraction);
	}

	//�ⱸ ��ü����
	@Override
	public List<AttractionVO> selectAll() throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.selectList("kr.capa.acip.Attraction.selectAll");
	}
	
	@Override
	public int totalwaitnum(int lnum) throws RuntimeException {
		return (int) sqlSession.selectOne("kr.capa.acip.Attraction.totalwaitnum", lnum);
	}
	
	@Override
	public AttractionVO recommendwaittime(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("kr.capa.acip.Attraction.recommendwaittime", attraction);
	}
}
