package ex11_static;

public class MyMath {
	
	
	
	
	// static
	// 1. 정적 요소
	// 2. 객체 생성 이전에 메모리에 미리 만들어 지는 공동 요소
	// 3. 클래스에서 1개만 남들어짐 ㅋㅋㅋㅋㅋ 개졸리네 슈벌
	// 4. 클래스를 이용해서 호출하기 때문에 클래스 변수, 클래스 메소드라고 부름
	
	
	// 핗드
	public static final double PI = 3.141592;

	// 메소드
	public static int abs(int n)
	{
		return (n > 0) ? n:-n;
	}
	
	public static int pow(int a, int b) {
		// a 의 b 제곱 반환
		// for 문 구현
		
		int result = 1;
		for(  int i = 1; i <= b; i++  )
		{
			result *= a;			
		}
		return result;
	}
	

}
