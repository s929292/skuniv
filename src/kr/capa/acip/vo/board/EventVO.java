package kr.capa.acip.vo.board;
 
public class EventVO {
	private String evnum;
	private String evtitle;
	private String evpic;
	private String evregdate;
	private String lnum;
	public String getEvnum() {
		return evnum;
	}
	public void setEvnum(String evnum) {   
		this.evnum = evnum; 
	}
	public String getEvtitle() { 
		return evtitle;
	}
	public void setEvtitle(String evtitle) {
		this.evtitle = evtitle;
	}
	public String getEvpic() {
		return evpic; 
	}
	public void setEvpic(String evpic) {
		this.evpic = evpic;
	}
	public String getEvregdate() {
		return evregdate;
	}
	public void setEvregdate(String evregdate) {
		this.evregdate = evregdate;
	}
	public String getLnum() {
		return lnum;
	}
	public void setLnum(String lnum) {
		this.lnum = lnum;
	}
	@Override
	public String toString() {
		return "EventVO [evnum=" + evnum + ", evtitle=" + evtitle + ", evpic=" + evpic + ", evregdate=" + evregdate
				+ ", lnum=" + lnum + "]";
	}
	
	

}
