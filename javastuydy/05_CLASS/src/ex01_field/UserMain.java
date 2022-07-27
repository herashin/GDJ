package ex01_field;

public class UserMain {
	
//	static int a;
	public static void main(String[] args) {
		
		
	//	System.out.println(a);
		// 클래스 User : 데이터타입
		// 객체 user   : 변수
		
		
//		int a = 10;
		// 변수는  변수로 끝이기 때문에  기능을 끄집어 낼 수 없다. 
		// a.   이렇게 시도하면 아무일도 없음
		//String s = "hi";
		// 객체.   객체는 기능이 있다.
		
		
		// 동일한 패키지에 있으면 임폴트가 안생긴다!!!
		
		//객체 선언
	//	User user = null; // 동일한 글자가 아님.  첫글자가 대문자는 클래스다.
		
		// 객체 생성
		User user = new User();
		// 객체 선언과 생성을 한번에
		/*
		 *  int[] arr;
		 *  arr = new int[5]
		 * 
		 * 
		 * Date now = new Date();
		 * */
		// 모든 유저 객체는 필드값을 가지고 있따.
		// 마침표(.)를 이용해서 필드값을 호출한다.
		System.out.println(user.id);
		System.out.println(user.password);
		System.out.println(user.email);
		System.out.println(user.point);
		System.out.println(user.isVip);
		
		
		
		// 필드값 변경
		user.id = "admin";
		user.password = "123456";
		user.email = "admin@web.com";
		user.point = 100000;
		user.isVip = (user.point >= 10000);
		
		System.out.println();
		System.out.println();
		
		System.out.println(user.id);
		System.out.println(user.password);
		System.out.println(user.email);
		System.out.println(user.point);
		System.out.println(user.isVip);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
