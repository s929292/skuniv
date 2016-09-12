package kr.capa.acip.vo.board;

public class ComplainVO {
	private int cnum;
	private String mid;
	private String ctitle;
	private String ccontent;
	private String cregdate;
	private int lnum;
	
	
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}  
	public String getMid() {
		return mid;
	} 
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getCtitle() {
		return ctitle;
	}
	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public String getCregdate() {
		return cregdate;
	}
	public void setCregdate(String cregdate) {
		this.cregdate = cregdate;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	@Override
	public String toString() {
		return "ComplainVO [cnum=" + cnum + ", mid=" + mid + ", ctitle=" + ctitle
				+ ", ccontent=" + ccontent + ", cregdate=" + cregdate
				+ ", lnum=" + lnum + "]";
	}
	
	
	
	

}
