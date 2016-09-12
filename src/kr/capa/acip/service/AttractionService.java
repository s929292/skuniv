package kr.capa.acip.service;

import kr.capa.acip.vo.attraction.AttractionVO;

public interface AttractionService {
	public int AttractionUpdate(int lnum,int anum,int awaitnum);
	public int TotalWaitnum(int lnum);
	public AttractionVO RecommendWaittime(int lnum, int anum);
	 
}
 