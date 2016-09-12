package kr.capa.acip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.capa.acip.dao.member.MemberDAO;
import kr.capa.acip.vo.member.MemberVO;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public boolean login(MemberVO member) {
		MemberVO vo = memberDAO.selectMember(member.getMid());
	      if(member.getMpassword().equals(vo.getMpassword())){
	    	  System.out.println("ture");
	         return true;
	      }
	      else{
	    	  System.out.println("false");
	         return false;
	      }
	}
	
	@Override
	public int memberjoin(MemberVO member) {
		return memberDAO.insertMember(member);
	}
} 
