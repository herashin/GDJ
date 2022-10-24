package test;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.Student;
import repository.StudentDao;

public class StudentTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	public void 아아() {
		
		
	}
	
	
	@Test
	public void 목록테스트() {
		assertEquals(6, StudentDao.getInstance().selectAllStudents().size());	
	}
	
	@Test
	public void 상세테스트() {
		assertNull(StudentDao.getInstance().selectStudentByNo(7));
		
	}
	
	public void 수정테스트() {
		Student s= Student.builder()
				.name("테스터2")
				.kor(60)
				.eng(60)
				.math(60)
				.ave(60)
				.grade("D")
				.stuNo(8)
				.build();
		assertEquals(1, StudentDao.getInstance().updateStudent(s));
	}
	
	public void 삭제테스트() {
		
		assertEquals(1, StudentDao.getInstance().deleteStudent(1));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
