package quiz05_exam;

import quiz03_bus.Student;

public class Main {

	public static void main(String[] args) {
	

		
		
		
		Exam exam = new Exam("중간고사");
		exam.setScore(); // 국, 영 , 수학 점수 0~100사이 랜덤생성		


		
		
		
		
		Student student = new Student("emily");
		
		
		student.setExam(exam);

		
		student.info();
		// 학생이름 : emily
		// 중간고사 성적
		// 국어 : 50, 영어 :50, 수학 : 50, 총첨 150점 
		
			
	}

}
