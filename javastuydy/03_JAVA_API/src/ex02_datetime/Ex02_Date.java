
package ex02_datetime;

import java.util.Date;

public class Ex02_Date {

	public static void main(String[] args) {
		
		
		// 클래스 명명 규칙
		// 패키지 다음에 마침표(.)를 적고 클래스명을 적는다.
		
		java.lang.System.out.println("Hello");
		
		
		// 예외 규칙
		// java.lang 패키지에 소속된 클래스들은 패키지를 생략한다.
		
		// 1. java.util.Date.
		// 2. import java.util.Date;
		// 	  Date. 
		
		///////////////////////
		
		
		// 클래스와 객체
		// 1. 클래스 : 객체를 만들기 위한 설계도
		// 2. 객체   : 클래스를 이용해서 만든 실제 객체 
		// 3. 일반적인 객체 생성 방법
		// 클래스 객체 = new 클래스();
		
		// 메소드 사용
		// 1. 클래스를 이용해서 호출
		// System.out.println()
		// System.currentTimeMillis()
		// System.nanoTime()
		// Math.rendom()
		// 2. 객체를 만들어서 호출
		// 	String str = new String("Hello"); // 여기서  클래스가  String,  객체는 srt
		//	str.equals('Hello');
		//
		//
		//
		// Date now = new Date();  //클래스 Date, 객체 now
		// now.getMonth()
		//
		//
		// StringBuilder sb = new StringBuilder();  // 클래스 StringBuilder, 객체 sb
		//
		//  붕어빵 붕1 = new 붕어빵();    >> 객체는 붕1 
		//  붕어빵 붕2 = new 붕어빵();    >> 객체는 붕2 
		//  붕어빵 붕3 = new 붕어빵();    >> 객체는 붕3 
		//  붕어빵 붕4 = new 붕어빵();    >> 객체는 붕4
		//  이런게 클래스 하나로 객체를 여러개 만든다는 뜻
		//
		//
		
		
		
		// Date 클래스와 now 객체
		Date now = new Date();
		System.out.println(now);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
