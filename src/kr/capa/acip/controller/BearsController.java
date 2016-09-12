package kr.capa.acip.controller;

import java.util.HashMap;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.capa.acip.service.AttractionService;
import kr.capa.acip.vo.attraction.AttractionVO;
//import kr.capa.acip.service.LoginService;

@Controller
public class BearsController {

	@Autowired
	private AttractionService attractionservice;
	// private LoginService loginservice;

	// 테스트 부분
	// 메인 화면 --------------------------------------------
	@RequestMapping("bearsmain2")
	public String attlist(Model model) {
		model.addAttribute("totalwaitnum", attractionservice.TotalWaitnum(1));

		// 리스트를 꺼내왔다면...
		// mv.addObject("list", attributeValue);

		return "1bears/mainsoon";
		// System.out.println("bearscontroller의 bearsmain메소드 실행");

	}
	
	@RequestMapping("1map")
	public String map() {
		// System.out.println("bearscontroller의 bearsmain메소드 실행");
		return "1bears/1realtime/map";
	}

	@RequestMapping("1bearsmain2")
	public String main23() {
		// System.out.println("bearscontroller의 bearsmain메소드 실행");
		return "1bears/123";
	}

	// 게시판 화면 --------------------------------------------
	@RequestMapping("boardtest")
	public String bt() {
		// System.out.println("bearscontroller의 bearsmain메소드 실행");
		return "1bears/1board/boardtest";
	}

	// 테스트 끝
	// 메인 화면 --------------------------------------------
	@RequestMapping("bearsmain")
	public String main() {
		// System.out.println("bearscontroller의 bearsmain메소드 실행");
		return "1bears/1bearsmain";
	}

	// 관리자 게시판 들어가는거 --------------------------------------------
	@RequestMapping("1manageboard")
	public String usermain() {

		return "1bears/1board/1boardmain";
	}

	// 관리자 기구 입력 --------------------------------------------
	@RequestMapping("1inputattraction")
	public String managermain() {

		return "1bears/1manager/1input";
	}

	// 관리자가 기구 값 입력하고 처리하는거
	@RequestMapping("attractionupdate")
	public String login(@RequestParam("anum") int anum, @RequestParam("awaitnum") String awaitnum) {
		int num = Integer.parseInt(awaitnum);
		if (attractionservice.AttractionUpdate(1, anum, num) == 1) {
			return "1bears/1manager/1input";
		} else
			return "1bears/1manager/1input";
	}
	// 베어스 메인 페이지에서 컨트롤러
	// ---------------------------------------------------------------

	// 이용정보 부분 --------------------------------------------
	// 이용방법 연결 컨트롤러
	@RequestMapping("1use")
	public String use() {
		return "1bears/mainsoon";
	}

	// 이용요금 연결 컨트롤러
	@RequestMapping("1fee")
	public String fee() {
		return "1bears/1info/1fee";
	}

	// 교통편 연결 컨트롤러
	@RequestMapping("1traffic")
	public String traffic() {
		return "1bears/1info/1traffic";
	}

	// 먹거리 연결 컨트롤러
	@RequestMapping("1food")
	public String food() {
		return "1bears/1info/1food";
	}

	// 먹거리 하나 골랐을 때 연결
	@RequestMapping("1foodclick")
	public String foodclick() {
		return "1bears/1info/1foodclick";
	}

	// ----------------------------------------------------------------------------------

	// 기구 정보 부분
	// 기구별 운영시간(실내) 연결 컨트롤러
	@RequestMapping("1indoor")
	public String indoor() {
		return "1bears/1attraction/1indoor";
	}

	// 기구별 운영시간(실외) 연결 컨트롤러
	@RequestMapping("1outdoor")
	public String outdoor() {
		return "1bears/1attraction/1outdoor";
	}

	// ----------------------------------------------------------------------------------

	// 행사 부분

	// 행사 정보 연결 컨트롤러
	@RequestMapping("1eventlist")
	public String eventlist() {
		return "1bears/1event/1eventlist";
	}

	// 행사 정보 클릭 연결 컨트롤러
	@RequestMapping("1eventinfo")
	public String eventinfo() {
		return "1bears/1event/1eventinfo";
	}

	// 할인 정보 연결 컨트롤러
	@RequestMapping("1discountlist")
	public String discountlist() {
		return "1bears/1info/1discountlist";
	}

	// 행사 정보 연결 컨트롤러
	@RequestMapping("1discountinfo")
	public String discountinfo() {
		return "1bears/1info/1discountinfo";
	}

	// ----------------------------------------------------------------------------------

	// 베어스 게시판
	// ----------------------------------------------------------------------

	// 잡담 부분
	// -----------------------------------------------------------------------
	// 잡담 목록
	@RequestMapping("1freetalklist")
	public String freetalklist() {
		return "1bears/1board/1freetalklist";
	}

	// 잡담 글 하나 클릭하면
	@RequestMapping("1freetalkclick")
	public String freetalkclick() {
		return "1bears/1board/1freetalkclick";
	}

	// 잡담 작성 폼
	@RequestMapping("1freetalkwriteform")
	public String freetalkwriteform() {
		return "1bears/1board/1freetalkwrite";
	}

	// 잡담 작성하고
	@RequestMapping("1freetalkwrite")
	public String freetalkwrite() {
		// 잡담 추가 기능
		return "redirect:1freetalklist";
	}

	// 잡담 수정 폼
	@RequestMapping("1freetalkupdateform")
	public String freetalkupdateform() {
		return "1bears/1board/1freetalkupdate";
	}

	// 잡담 수정
	@RequestMapping("1freetalkupdate")
	public String freetalkupdate() {
		// 잡담 수정하고 목록으로 다시 보여짐
		return "redirect:1freetalklist";
	}

	// 잡담 삭제
	@RequestMapping("1freetalkdelete")
	public String freetalkdelte() {
		// 삭제하는 기능 구현하고 목록으로 돌아감
		return "redirect:1freetalklist";
	}

	// ----------------------------------------------------------------------

	// 이용후기 부분 -----------------------------------------------------------------
	// 이용후기 목록
	@RequestMapping("1reviewlist")
	public String reviewlist() {
		return "1bears/1board/1reviewlist";
	}

	// 이용후기 글 하나 클릭하면
	@RequestMapping("1reviewclick")
	public String reviewclick() {
		return "1bears/1board/1reviewclick";
	}

	// 이용후기 작성 폼
	@RequestMapping("1reviewwriteform")
	public String reviewwriteform() {
		return "1bears/1board/1reviewwrite";
	}

	// 이용후기 작성하고
	@RequestMapping("1reviewwrite")
	public String reviewwrite() {
		// 이용후기 추가 기능
		return "redirect:1reviewlist";
	}

	// 이용후기 수정 폼
	@RequestMapping("1reviewupdateform")
	public String reviewupdateform() {
		return "1bears/1board/1reviewupdate";
	}

	// 이용후기 수정
	@RequestMapping("1reviewupdate")
	public String reviewupdate() {
		// 이용후기 수정하고 목록으로 다시 보여짐
		return "redirect:1reviewlist";
	}

	// 이용후기 삭제
	@RequestMapping("1reviewdelete")
	public String reviewdelte() {
		// 삭제하는 기능 구현하고 목록으로 돌아감
		return "redirect:1reviewlist";
	}

	// ----------------------------------------------------------------------

	// Q&A 부분 -----------------------------------------------------------------
	// Q&A 목록
	@RequestMapping("1qnalist")
	public String qnalist() {
		return "1bears/1board/1qnalist";
	}

	// Q&A 글 하나 클릭하면
	@RequestMapping("1qnaclick")
	public String qnaclick() {
		return "1bears/1board/1qnaclick";
	}

	// Q&A 작성 폼
	@RequestMapping("1qnawriteform")
	public String qnawriteform() {
		return "1bears/1board/1qnawrite";
	}

	// Q&A 작성하고
	@RequestMapping("1qnawrite")
	public String qnawrite() {
		// Q&A 추가 기능
		return "redirect:1qnalist";
	}

	// Q&A 수정 폼
	@RequestMapping("1qnaupdateform")
	public String qnaupdateform() {
		return "1bears/1board/1qnaupdate";
	}

	// Q&A 수정
	@RequestMapping("1qnaupdate")
	public String qnaupdate() {
		// Q&A 수정하고 목록으로 다시 보여짐
		return "redirect:1qnalist";
	}

	// Q&A 삭제
	@RequestMapping("1qnadelete")
	public String qnadelte() {
		// 삭제하는 기능 구현하고 목록으로 돌아감
		return "redirect:1qnalist";
	}

	// ----------------------------------------------------------------------

	// 불만 부분 -----------------------------------------------------------------
	// 불만 목록
	@RequestMapping("1complainlist")
	public String complainlist() {
		return "1bears/1board/1complainlist";
	}

	// 불만 글 하나 클릭하면
	@RequestMapping("1complainclick")
	public String complainclick() {
		return "1bears/1board/1complainclick";
	}

	// 불만 작성 폼
	@RequestMapping("1complainwriteform")
	public String complainwriteform() {
		return "1bears/1board/1complainwrite";
	}

	// 불만 작성하고
	@RequestMapping("1complainwrite")
	public String complainwrite() {
		// 불만 추가 기능
		return "redirect:1complainlist";
	}

	// 불만 수정 폼
	@RequestMapping("1complainupdateform")
	public String complainupdateform() {
		return "1bears/1board/1complainupdate";
	}

	// 불만 수정
	@RequestMapping("1complainupdate")
	public String complainupdate() {
		// 불만 수정하고 목록으로 다시 보여짐
		return "redirect:1complainlist";
	}

	// 불만 삭제
	@RequestMapping("1complaindelete")
	public String complaindelte() {
		// 삭제하는 기능 구현하고 목록으로 돌아감
		return "redirect:1complainlist";
	}

	// ----------------------------------------------------------------------

	// 실시간 운행정보 부분 ---------------------------------------------------------

	// 대기시간 연결 컨트롤러
	@RequestMapping("1waittime")
	public String waittime() {
		return "1bears/1realtime/1waittime";
	}

	// 테마별 추천코스 연결 컨트롤러
		@RequestMapping("1themecourse")
		public String themecourse() {
			return "1bears/1realtime/1themecourse";
		}
		
	// 실시간 추천코스 선택 연결 컨트롤러
	@RequestMapping("1recommendform")
	public String recommendform() {
		return "1bears/1realtime/1recommendform";
	}

	// 추천코스 선택 결과 컨트롤러
	@RequestMapping("1recommendmain")
	public String recommendmain(@RequestParam("checkbox") String[] anum2, Model model) {
		AttractionVO vo = new AttractionVO();
		
		int[] anum; //결과를 순서대로 해줌 
		int temp = 0;
		anum = new int[5];
		int[] awaittime = new int[5];
		int tmp = 0;
		String tmp2 = null;
		String[] aname = new String[5];
		// awaittime 배열에 대기시간을 넣어줌
		for (int i = 0; i < anum2.length; i++) {
			anum[i] = Integer.parseInt(anum2[i]);
			vo = attractionservice.RecommendWaittime(1, anum[i]);
			awaittime[i] = vo.getAwaittime();
			aname[i] = vo.getAname();

		}
		// 오름차순 정렬해줌 가나다라마 54321이면 마라다나가 12345가 되야함 
		
		// i는 0부터 갯수까지 
		for (int i = 0; i < awaittime.length; i++) {
			// j = i+1부터 길이까지
			for (int j = i + 1; j < awaittime.length; j++) {
				// 숫[0] > 숫[1]
				if (awaittime[i] > awaittime[j]) {
					
					temp = awaittime[i];
					awaittime[i] = awaittime[j];
					awaittime[j] = temp;
					tmp2 = aname[i];
					aname[i] = aname[j];
					aname[j] = tmp2;
					tmp = anum[i];
					anum[i] = anum[j];
					anum[j] = tmp;
							
				}
				
			}
		}	
		model.addAttribute("aname",aname);
		model.addAttribute("awaittime", awaittime);
		model.addAttribute("anum",anum);
		return "1bears/1realtime/1recommendmain";
	}

	// ----------------------------------------------------------------------

}
