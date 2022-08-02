package quiz05_exam;

public class Student {
	
	private String namme;
	private Exam exam;
	
	
	public Student (String name) {
		this.name = name;
		
		
		
	}


	public String getNamme() {
		return namme;
	}


	public void setNamme(String namme) {
		this.namme = namme;
	}


	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	

}
