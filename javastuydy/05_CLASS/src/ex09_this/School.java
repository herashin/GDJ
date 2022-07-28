package ex09_this;

public class School {

	
	private Student[] students;
	private int idx; // students 배열의 인덱스.  students 배열에 저장된 학생수와 같다.
	// 생성자
	public School (int cnt) {
		
		students = new Student[cnt];
		
		
	}
	
	// 메소드 
	
	public void addStudent(Student student ) {
		
		if( idx ==   students.length)
		{
			System.out.println("Full");
			return;
		}		
		students[idx++] = student;
		
		
		/*  코드 스타일로 나뉘지만 보통 일반적으로 위에처럼 작성함. 
		if( idx ==   students.length) {
			System.out.println("Full");
		}
		else {
			students[idx++] = student;
		}
		*/
		
		
	}
	
	public void printStudents() {
		/*
		for( int i = 0; i< idx ; i++  )
		{
			System.out.println(students[i].getName() + "," + students[i].getStuNo());
			
		}
		*/
		// 치명적 오류 발견
		// 배열에 값이 하나라도 비어있으면 
		// null 오류 발생
		//student.lenth 로 for문을 돌렸더니 학생 수가 부족하면 null 에러 발생.
		// idx로 바꾸었다.
		
		
		// 향상 포문 버전. 
		for( Student student : students) {
			if ( student != null ) { //역시 null 오류가 생기기 때문에 if 로 에러를 잡는다.
			System.out.println( student.getName() + ", " + student.getStuNo()  );
			}
		}
		
		
	}
	
	
	
	
}
