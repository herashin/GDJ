package ex09_this;

public class Student {
	
	
	
	// this
	// 1. 현재 객체의 참조값
	// 2. 현재 객체의 멤버(필드, 메소드)를 호출할 때 사용
	// 3. 생성자 내부에서 다른 생성자를 호출할 때 this() 형태로 사용
	
	
	// 필드
	private String stuNo;  // this.stuNo
	private String name;   // this.name
	
	
	public Student() {};
	
	
	public Student(String stuNo, String name) {
		this.stuNo = stuNo;
		this.name = name;
		
	}
	
	
	
	
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 생성자
	//
	/*
	public Srdent(){}
	
	public Student(Spring) {
		this.stuNo =  stuNo;
		th
		
	};
	*/
	
	// 자동만들기 >> 상단 소스 >> 제너레이트 게터 앤 세터
	
	
	// 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
