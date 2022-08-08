package ex04_builder;

public class User {
	
	// 필드 (builder 객체가 가진 값을 받아 옴)
	
	private int userNo;
	private String id;
	private String email;
	
	public User(Builder builder) {
		this.userNo = builder.userNo;
		this.id = builder.id;
		this.email = builder.email;
		
	}
	// builder 반환 메소드
	public static Builder builder() {
		return new Builder();
		
	}
	
	
	//  User 클래스 내부에 builder 클래스 생성
	//  User 클래스를 이용해서 호출하기 위해 static 처리
	public static class Builder{
		
		// 내부 필드 (여기에 값을 전달 받아서 User의 필드로 보내는 원리
		private int userNo;
		private String id;
		private String email;
		
		
		// userNo() 메소드 
		public Builder id(String id)
		{
			this.id = id;
			return this;
			
		}
		
		
		
		public Builder userNo(int userNo)
		{
			this.userNo = userNo;
			return this;
			
		}
		
		public Builder email( String email ) {
			this.email = email;
			return this;
			
		}
		
		public User builder() {
			return new User(this);
			
		}
		
	} // static class builder


	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", id=" + id + ", email=" + email + "]";
	}
	
	
	
}
