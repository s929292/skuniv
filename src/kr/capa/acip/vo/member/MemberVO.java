package kr.capa.acip.vo.member;

public class MemberVO {
	private String mid;
	private String mpassword;
	private String mname;
	private String mbirth;
	private String mgender;
	private String mphone; 
	private String memail;
	private String mregdate; 
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid; 
	}
	public String getMpassword() { 
		return mpassword; 
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname; 
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMbirth() {
		return mbirth;
	}
	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}
	public String getMgender() {
		return mgender;
	}
	public void setMgender(String mgender) {
		this.mgender = mgender;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	} 
	public String getMregdate() {
		return mregdate;
	}
	public void setMregdate(String mregdate) {
		this.mregdate = mregdate;
	} 

	@Override
	public String toString() {
		return "MemberVO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mbirth=" + mbirth
				+ ", mgender=" + mgender + ", mphone=" + mphone + ", memail=" + memail + ", mregdate=" + mregdate
				+  "]";
	}
	
	
	
}
