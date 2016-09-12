package kr.capa.acip.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.capa.acip.service.LoginService;
import kr.capa.acip.vo.member.MemberVO;

@Controller
public class MainController {

	@Autowired
	 private LoginService loginservice;
	// 유저 메인 화면 --------------------------------------------
	@RequestMapping("usermain")
	public String usermain() {
		return "0acip/usermain";
	}

	// 관리자 메인 화면 --------------------------------------------
	@RequestMapping("managermain")
	public String managermain() {
		return "0acip/managermain";
	}

	// 로그인 화면 -------------
	@RequestMapping("login")
	public String loginform() {
		String id = "a";
		//로그인 처리를 한다
		
		//로그인 ID에 따라 화면을 다르게 보여줌
		if(id.equals("manager1"))
			return "redirect:managermain";
			
		else
			return "redirect:usermain";
		
	}

	// 회원가입 화면 -------------
	@RequestMapping("registrationform")
	public String registrationform() {
		return "0acip/registration";
	}

	// 회원가입 처리하는 것 -------------
	@RequestMapping("registration")
	public String registration(MemberVO vo) {
		loginservice.memberjoin(vo);
		return "0acip/joincomplete";
		
	}

}
