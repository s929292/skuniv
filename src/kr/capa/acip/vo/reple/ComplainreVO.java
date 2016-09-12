package kr.capa.acip.vo.reple;

public class ComplainreVO {
	private int cnum;
	private int crenum;
	private String crecontent;
	private String creregdate;
	private int lnum;
	
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public int getCrenum() {
		return crenum;
	}
	public void setCrenum(int crenum) { 
		this.crenum = crenum;
	}
	public String getCrecontent() {
		return crecontent;
	}
	public void setCrecontent(String crecontent) {
		this.crecontent = crecontent;
	}
	public String getCreregdate() {
		return creregdate; 
	}
	public void setCreregdate(String creregdate) {
		this.creregdate = creregdate;
	}    
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	public String toString() {
	      return "불만댓글 ComplainreVO [cnum= "+cnum+", crenum=" + crenum + ", crecontent=" + crecontent + ", creregdate=" + creregdate + ", lnum=" + lnum + "]\n";
	   }
	

}
