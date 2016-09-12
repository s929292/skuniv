package kr.capa.acip.dao.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.capa.acip.vo.member.MemberVO;

@Repository("MemberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlsession;
  
	@Override 
	public MemberVO selectMember(String id) throws RuntimeException {
		return (MemberVO) sqlsession.selectOne("kr.capa.acip.Member.selectMember", id);
	}

	@Override
	public int insertMember(MemberVO member) throws RuntimeException {
		return sqlsession.insert("kr.capa.acip.Member.insertMember", member);
	}
 
	@Override
	public int deleteMember(String id) throws RuntimeException {
		return sqlsession.delete("kr.capa.acip.Member.deleteMember", id);
	}

	@Override
	public int updateMember(MemberVO member) throws RuntimeException {
		return sqlsession.update("kr.capa.acip.Member.updateMember", member);
	}

}
