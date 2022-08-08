package ex01_setter;

public class User {

	private int iserNo;
	private String id;
	private String email;
	
	////  게터세터 
	public int getIserNo() {
		return iserNo;
	}
	public void setIserNo(int iserNo) {
		this.iserNo = iserNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	////게터세터 
	@Override
	public String toString() {
		return "User [iserNo=" + iserNo + ", id=" + id + ", email=" + email + "]";
	}
	
	
}
