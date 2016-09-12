package kr.capa.acip.vo.land;

public class LandVO {
	int lnum;
	String lname;
	
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	public String getLname() {
		return lname;
	} 
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "LandVO [lnum=" + lnum + ", lname=" + lname + "]";
	}
	
}
 