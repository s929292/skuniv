package kr.capa.acip.vo.reple;

public class QnareVO {
	private int qnum;
	private int qrenum;
	private String mid;
	private String qrecontent;
	private String qreregdate;
	private int lnum;
	
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public int getQrenum() {
		return qrenum;
	}
	public void setQrenum(int qrenum) {
		this.qrenum = qrenum;
	}
	public String getMid() { 
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getQrecontent() {
		return qrecontent;
	}
	public void setQrecontent(String qrecontent) {
		this.qrecontent = qrecontent;
	}
	public String getQreregdate() {
		return qreregdate;
	}
	public void setQreregdate(String qreregdate) {
		this.qreregdate = qreregdate;
	}
	public int getLnum() {
		return lnum;
	}     
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	public String toString() {
	      return "Qna댓글 QnareVO [qnum= "+qnum+", qrenum=" + qrenum + ", mid=" + mid + ", qrecontent=" + qrecontent + ", qreregdate=" + qreregdate + ", lnum="
	            + lnum + "]\n";
	   }
}
