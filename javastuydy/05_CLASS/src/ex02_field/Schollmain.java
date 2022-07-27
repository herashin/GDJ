package ex02_field;

public class Schollmain {

	public static void main(String[] args) {
		
		School school = new School();
		
		school.name = "연광엘리멘트리스쿨";
		
		Student student1 = new Student();
		
		
		student1.name = "신준호";
		student1.stuNo = "20220810";
		
		Student student2 = new Student();
		
		student2.name = "정우성";
		student2.stuNo = "20201234";
		
		
		school.students[0] = student1;
		school.students[1] = student2;
		
		for( int i = 0; i < school.students.length; i++ )
		{
			System.out.println(school.students[i].stuNo);
			System.out.println(school.students[i].name);
			
		}
		
		
		

	}

}
