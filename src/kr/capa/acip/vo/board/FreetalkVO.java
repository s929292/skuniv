package kr.capa.acip.vo.board;
 
public class FreetalkVO {
	private int fnum;
	private String mid;
	private String ftitle;
	private String fcontent;
	private String fregdate;
	private int lnum;
	
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	} 
	public String getFtitle() {
		return ftitle;
	}
	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}
	public String getFregdate() {
		return fregdate;
	}
	public void setFregdate(String fregdate) {
		this.fregdate = fregdate;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	@Override
	public String toString() {
		return "FreetalkVO [fnum=" + fnum + ", mid=" + mid + ", ftitle=" + ftitle
				+ ", fcontent=" + fcontent + ", fregdate=" + fregdate
				+ ", lnum=" + lnum + "]";
	}
	
	
	
	

}
