package kr.capa.acip.vo.reple;

public class ReviewreVO {
	private int rnum;
	private int rrenum;
	private String mid;
	private String rrecontent;
	private String rreregdate;
	private int lnum;
	
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public int getRrenum() {
		return rrenum;
	}
	public void setRrenum(int rrenum) {
		this.rrenum = rrenum;
	} 
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getRrecontent() {
		return rrecontent;
	}
	public void setRrecontent(String rrecontent) {
		this.rrecontent = rrecontent;
	}
	public String getRreregdate() {
		return rreregdate;
	}
	public void setRreregdate(String rreregdate) {
		this.rreregdate = rreregdate;
	}
	public int getLnum() {   
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	public String toString() {  
	      return "후기댓글 ReviewreVO [rnum= "+rnum+", rrenum=" + rrenum + ", mid=" + mid + ", rrecontent=" + rrecontent + ", rreregdate=" + rreregdate + ", lnum="
	            + lnum + "]\n";
	   }

}
