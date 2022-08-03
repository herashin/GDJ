package ex14_interface;

public interface Shape {

	
	// final 상수
	public final static double PI = 3.141592;
	
	
	// 추상 메소드
	public /*abstract*/ double getArea();
	
	
	
	// default 메소드(본문이 있는 메소드)
	public default void message() {
		
		System.out.println("난....난....도형.....도형이야... 뭔가 사람 이름같네 도형  김도형  이도형  박도형 ");
	} 
	
	
}
