package kr.capa.acip.vo.reple;

public class FreetalkreVO {
	private int fnum;
	private int frenum;
	private String mid;
	private String frecontent;
	private String freregdate;
	private int lnum;
	
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public int getFrenum() {
		return frenum;
	}
	public void setFrenum(int frenum) {
		this.frenum = frenum;
	} 
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getFrecontent() {
		return frecontent;
	}
	public void setFrecontent(String frecontent) {
		this.frecontent = frecontent;
	}
	public String getFreregdate() {
		return freregdate;
	}
	public void setFreregdate(String freregdate) {
		this.freregdate = freregdate;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {    
		this.lnum = lnum;
	}
	public String toString() { 
	      return "잡담댓글 FreetalkreVO [fnum= "+fnum+", frenum=" + frenum + ", mid=" + mid + ", frecontent=" + frecontent + ", freregdate=" + freregdate + ", lnum="
	            + lnum + "]\n";
	   }
	

}
