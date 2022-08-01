package ex06_constroctor;

public class Alba extends Studnet{

	
	private String company;
	
	

	public Alba(String name, String school, String company) {
		super(name, school);
		this.company = company; // 슈퍼의 호출 순서가 바뀌어도 오류남.
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
