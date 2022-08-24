package api;

public class Accident {

	private String occrrncdt;
	private String occrrncDayCd;
	private int dthDnvCnt;
	private int injpsnCnt;
	
	
	public String getOccrrncdt() {
		return occrrncdt;
	}
	public void setOccrrncdt(String occrrncdt) {
		this.occrrncdt = occrrncdt;
	}
	public String getOccrrncDayCd() {
		return occrrncDayCd;
	}
	public void setOccrrncDayCd(String occrrncDayCd) {
		this.occrrncDayCd = occrrncDayCd;
	}
	public int getDthDnvCnt() {
		return dthDnvCnt;
	}
	public void setDthDnvCnt(int dthDnvCnt) {
		this.dthDnvCnt = dthDnvCnt;
	}
	public int getInjpsnCnt() {
		return injpsnCnt;
	}
	public void setInjpsnCnt(int injpsnCnt) {
		this.injpsnCnt = injpsnCnt;
	}
	
	@Override
	public String toString() {
		return "Accident [occrrncdt=" + occrrncdt + ", occrrncDayCd=" + occrrncDayCd + ", dthDnvCnt=" + dthDnvCnt
				+ ", injpsnCnt=" + injpsnCnt + "]";
	}
	
	
	
	
	
	
	
	
	
}
