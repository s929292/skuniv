package kr.capa.acip.dao.member;

import kr.capa.acip.vo.member.MemberVO;

public interface MemberDAO {
	public MemberVO selectMember(String id) throws RuntimeException;
	public int insertMember(MemberVO member) throws RuntimeException;
	public int deleteMember(String id) throws RuntimeException;
	public int updateMember(MemberVO member) throws RuntimeException;
	  
}
