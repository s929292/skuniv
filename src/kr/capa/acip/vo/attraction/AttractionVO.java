package kr.capa.acip.vo.attraction;

public class AttractionVO {
	int anum;
	String aname;
	String alocation;
	int aadmitnum;
	int aruntime;
	int awaitnum;  
	int awaittime;
	int lnum;
	public int getAnum() {
		return anum;
	} 
	public void setAnum(int anum) { 
		this.anum = anum;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAlocation() {
		return alocation;
	}
	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}
	public int getAadmitnum() {
		return aadmitnum;
	}
	public void setAadmitnum(int aadmitnum) {
		this.aadmitnum = aadmitnum;
	}
	public int getAruntime() {
		return aruntime;
	}
	public void setAruntime(int aruntime) {
		this.aruntime = aruntime;
	}
	public int getAwaitnum() {
		return awaitnum;
	}
	public void setAwaitnum(int awaitnum) {
		this.awaitnum = awaitnum;
	}
	public int getAwaittime() {
		return awaittime;
	}
	public void setAwaittime(int awatitime) {
		this.awaittime = awatitime;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	@Override
	public String toString() {
		return "AttractionVO [anum=" + anum + ", aname=" + aname + ", alocation=" + alocation + ", aadmitnum="
				+ aadmitnum + ", aruntime=" + aruntime + ", awaitnum=" + awaitnum + ", awaittime=" + awaittime
				+ ", lnum=" + lnum + "]";
	}
	
}
