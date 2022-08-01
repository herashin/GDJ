package quiz02_coffee;

public class Coffee {
	/*
	private String bin;
	private int wather;
	
	
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public int getWather() {
		return wather;
	}
	public void setWather(int wather) {
		this.wather = wather;
	}
	
	public void info() {
		System.out.println(bin + " 원두, 물" + wather);
		
		
	}*/
	
	private String origin;
	
	public Coffee(String origin) {
		super();
		this.origin = origin;
	}

	public void info() {
		System.out.println(origin + "원두");
	}
	
}
