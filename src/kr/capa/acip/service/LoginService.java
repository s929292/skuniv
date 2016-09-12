package kr.capa.acip.service;

import kr.capa.acip.vo.member.MemberVO;

public interface LoginService {
	public boolean login(MemberVO member);
	public int memberjoin(MemberVO member);
}
 