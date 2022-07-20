package ex01_branch;

public class Ex03_else_if {

	public static void main(String[] args) {
		
		// else if 문
		// 조건이 여러 개 사용되는 경우에 각 조건을 처리한다.
		// if(조건){
		//    실행문
		//  } else if (조건){
		//    실행문
		//  } else if (조건){
		//    실행문
		// }
		
		
		
		// 나이에 따른 결과 출력
		// 0 ~ 7   : 미취학 아동
		// 0 ~ 13  : 초등학생
		// 14 ~ 16 : 중학생
		// 17 ~ 19 : 고등학생
		// 20 ~    : 성인
		
		
		int age = 59;
		if( age < 0 || age > 100 ) {
			System.out.println("잘못된 나이");
			
		}
		else if( age <= 7 ) {
			System.out.println("미취학 아동");
			
		} 
		else if( age <= 13 ) {
			System.out.println("초등학생");
			
		}
		else if( age <= 16 ) {
			System.out.println("중학생");
			
		}
		else if( age <= 19 ) {
			System.out.println("고등학생");
			
		}
		else {
			System.out.println("성인");
			
		}
		
		
		
		// 연습
		// 월에 따른 계절 출력
		// 봄   : 3 ~ 5
		// 여름 : 6 ~ 8
		// 가을 : 9 ~ 11
		// 겨울 : 12, 1 ~ 2
		
		
		int month = 8;
		
		
		/*
		if ( month >= 3 || month <= 5   ) {
			System.out.println("봄");
			
			
		}
		else if( month >= 6 || month <= 8  ) {
			System.out.println("여름");
			
		}
		else if( month >= 9 ) {
			System.out.println("가을");
			
		}
		else {
			System.out.println("겨울");
			
		}
		
		
		*/
		/*
		
		if ( month < 1 || month > 12 ) {
			System.out.println("잘못된 월");
			
		}
		else if( month == 12 || month <= 2 ) {
			System.out.println("겨울");
			
		}
		else if ( month <= 5 ) {
			System.out.println("봄");
			
		}
		else if ( month <= 8 ) {
			System.out.println("여름");
			
		}
		else {
			
			System.out.println("가을");
		}
		*/
		
		// 나머지 연산을 활용한 modular 연산
		
		int mod = month % 12;
		if ( month < 1 || month > 12 ) {
			System.out.println("잘못된 월");
			
		}
		
		else if ( mod <= 2 ) {
			System.out.println("겨울");
			
		}
		else if ( mod  <= 5 ) {
			System.out.println("봄");
			
		}
		else if ( mod <= 8 ) {
			System.out.println("여름");
			
		}
		else {
			System.out.println("가을");
		}
		
		
		
		
		
		
		// 연습 
		// 점수에 따른 학점
		// score  grade
		// 100 ~ 90 A 
		// 89 ~ 80  B 
		// 79 ~ 70  C
		// 69 ~ 60  D
		// 59 ~ 0   F
		
		int score = 1100;
		char grade;
		/*
		if ( score == 0 || score <= 59 ) {
			grade = 'F';
			
		}
		else if (score <= 69) {
			grade = 'D';
			
		}
		else if (score <= 79) {
			grade = 'C';
			
		}
		else if (score <= 89) {
			grade = 'B';
			
		}
		
		else {
			
			grade = 'A';
		}
		System.out.println(grade);
		
		*/
		
		
		if ( score == 0 || score > 100 ) {
			grade = 'X';
			
		}
		else if (score >= 90) {
			grade = 'A';
			
		}
		else if (score >= 80) {
			grade = 'B';
			
		}
		else if (score >= 70) {
			grade = 'C';
			
		}
		else if (score >= 60) {
			grade = 'D';
			
		}
		
		else {
			
			grade = 'F';
		}
		
		System.out.println("점수는 " + score + "점");
		System.out.println("학점은 " + grade + "학점");
		
		
		
		
		
		
		// 연습
		// 오직 일 수만 고려
		// 1일이 수요일이다.
		// n일 후 무슨 요일인지 출력하기.
		
		// 나머지를 구해서 연산하는것을 모듈러 연산이라 한다.
		
		int day = 1;
		int n = 2;
		String weekName;

		/*
		if ( (n % 7) = 1  ) {
			
			weekName = '수';
		}
		else if ( (n % 7) = 2 ) {
			
			weekName = '목';
		}
		else if ( (n % 7) = 3 ) {
			
			weekName = '목';
		}
		*/
		
		day += n;
		
		if (day % 7 == 0) {
			weekName = "화";
			
		}
		else if ( day % 7 == 1 ) {
			weekName = "수";
			
		}
		else if ( day % 7 == 2 ) {
			weekName = "목";
			
		}
		else if ( day % 7 == 3 ) {
			weekName = "금";
			
		}
		else if ( day % 7 == 4 ) {
			weekName = "토";
			
		}
		else if ( day % 7 == 5 ) {
			weekName = "일";
			
		}
		else {
			weekName = "월";
			
		}
	
		System.out.println(weekName + "요일");
		
		
		
		
		
		
		
		
		

	}

}
