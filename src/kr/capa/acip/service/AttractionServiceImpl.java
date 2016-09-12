package kr.capa.acip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.capa.acip.dao.attraction.AttractionDAO;
import kr.capa.acip.vo.attraction.AttractionVO;

@Service("AttractionService")
public class AttractionServiceImpl implements AttractionService {
	@Autowired
	private AttractionDAO attractiondao;

	@Override
	public int AttractionUpdate(int lnum, int anum, int awaitnum) {
		// TODO Auto-generated method stub
		AttractionVO attractionvo = new AttractionVO();
		attractionvo.setLnum(lnum);
		attractionvo.setAnum(anum);
		// 변수만들어서 가져온 anum과 lnum값만 넣음 (나머지는 다 null이나 0)

		attractionvo = attractiondao.selectAttraction(attractionvo);
		// anum과 lnum만을 이용해서 select하여 vo변수에 나머지값채우기 (대기인원,대기시간제외)

		int admitnum = attractionvo.getAadmitnum();
		int runtime = attractionvo.getAruntime();
		int waittime = awaitnum / admitnum * runtime;
		// 대기시간 계산식거쳐서 값구하기

		attractionvo.setAwaittime(waittime);
		attractionvo.setAwaitnum(awaitnum);
		// vo변수에 대기인원과 대기시간 set

		attractiondao.updateWaitnum(attractionvo);
		// dao통해 vo변수를 넣어 대기인원 update

		return attractiondao.updateWaittime(attractionvo);
		// dao통해 vo변수를 넣어 대기시간 update
	}
	@Override
	public int TotalWaitnum(int lnum) {
		return  attractiondao.totalwaitnum(lnum);
	}
	
	public AttractionVO RecommendWaittime(int lnum, int anum) {
		AttractionVO attractionvo = new AttractionVO();
		attractionvo.setLnum(lnum);
		attractionvo.setAnum(anum);
		// 변수만들어서 가져온 anum과 lnum값만 넣음 (나머지는 다 null이나 0)
		attractionvo = attractiondao.recommendwaittime(attractionvo);
		
		
		return attractionvo;
	}
}
