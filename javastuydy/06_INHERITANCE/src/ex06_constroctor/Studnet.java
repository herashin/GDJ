package ex06_constroctor;

public class Studnet extends Person{

	
	private String school;
	
	
	

	public Studnet(String name, String school) {
		super(name);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
		
}
