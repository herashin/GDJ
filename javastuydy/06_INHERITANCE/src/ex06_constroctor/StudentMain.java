package ex06_constroctor;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Studnet studnet = new Studnet("tom","goodee");
		
		System.out.println(studnet.getName());		
		System.out.println(studnet.getSchool());
		
		
		System.out.println();
		Alba alba = new Alba("jseeica","seoul nive","Library");
		
		System.out.println(alba.getName());
		System.out.println(alba.getSchool());
		System.out.println(alba.getCompany());
		
	}

}
