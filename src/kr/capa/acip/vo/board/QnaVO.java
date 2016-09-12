package kr.capa.acip.vo.board;
 
public class QnaVO {
	private int qnum;
	private String mid;
	private String qtitle;
	private String qcontent;
	private String qregdate;
	private int lnum;
	
	
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	} 
	public String getQtitle() {
		return qtitle;
	}
	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}
	public String getQcontent() {
		return qcontent;
	}
	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}
	public String getQregdate() {
		return qregdate;
	}
	public void setQregdate(String qregdate) {
		this.qregdate = qregdate;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
	@Override
	public String toString() {
		return "QnaVO [qnum=" + qnum + ", mid=" + mid + ", qtitle=" + qtitle
				+ ", qcontent=" + qcontent + ", qregdate=" + qregdate
				+ ", lnum=" + lnum + "]";
	}
	
	

}
