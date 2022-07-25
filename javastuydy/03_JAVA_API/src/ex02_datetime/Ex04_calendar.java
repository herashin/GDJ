package ex02_datetime;

import java.util.Calendar;

public class Ex04_calendar {

	public static void main(String[] args) {
		
		
		// java.utill.Calendar 클래스
		// 현재 날짜 또는 특정 날자
		// 날짜의 특정 요소 (년, 월, 일, 시, 분, 초, ...)를 쉽게 사용
		
		
		Calendar cal = Calendar.getInstance(); // 객체 cal 은 현재 날짜와 시간으로 구성
		
		
		
		// 년, 월, 일
		int year = cal.get(Calendar.YEAR); // int year = cal.get(1);
		int month = cal.get(Calendar.MONTH) + 1; // 월 : 0 ~ 11 (주의가 필요함)
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int weekNo = cal.get(Calendar.DAY_OF_WEEK); // 요일번호 : 일(1) , 월(2), ......, 토(7)
		
		
		
		System.out.println(year);
		System.out.println(month); 
		System.out.println(day);
		switch(weekNo) {
		
		
		case 1 : System.out.println("일요일" ); break;
		case 2 : System.out.println("월요일" ); break;
		case 3 : System.out.println("화요일" ); break;
		case 4 : System.out.println("수요일" ); break;
		case 5 : System.out.println("목요일" ); break;
		case 6 : System.out.println("금요일" ); break;
		case 7 : System.out.println("토요일" ); break;
		
		
		
		}
		
		
		
		
//		System.out.println(weekNo);
		
		
		// Calendar 안에 들어가 확인하니  final int YEAR   이라고 나온다.
		// final 은 상수.  값이 변하지 않는것
		
		
		
		// 메소드와 함수는 같다.   
		// 클래스 안에 포함되어 있으면 메소드라고 부르며
		// 그렇지 않을경우 함수라고 함.
		
		
		
		
		
		System.out.println();
		
		
		// 시, 분, 초
		
		
		int ampm = cal.get(Calendar.AM_PM);
		
		int hour12 = cal.get(Calendar.HOUR);
		
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		switch( ampm ) {
		
		case 0 : System.out.println("오전"); break;
		case 1 : System.out.println("오후"); break;		
		
		}
		
		System.out.println(hour12);
		System.out.println(hour24);
		System.out.println(minute);
		System.out.println(second);
		
		
		// timestamp
		long timestamp = cal.getTimeInMillis();
		System.out.println(timestamp);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
