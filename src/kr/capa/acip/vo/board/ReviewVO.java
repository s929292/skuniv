package kr.capa.acip.vo.board;
 
public class ReviewVO {
	private int rnum;
	private String mid;
	private String rtitle;
	private String rcontent;
	private String rregdate;
	private int lnum;
	
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getRtitle() {
		return rtitle;
	} 
	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRregdate() {
		return rregdate;
	}
	public void setRregdate(String rregdate) {
		this.rregdate = rregdate;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	
	@Override
	public String toString() {
		return "ReviewVO [rnum=" + rnum + ", mid=" + mid + ", rtitle=" + rtitle
				+ ", rcontent=" + rcontent + ", rregdate=" + rregdate
				+ ", lnum=" + lnum + "]";
	}
	
}
