package ex04_condition;

public class Ex03 {

	public static void main(String[] args) {
		
		// 조건 연산자 
		// 조건을 만족하는 경우와 그렇지 않는경우 모두를 처리하는 연산
		// 형식
		//	조건 ? 만족하는 경우 : 만족하지 않는 경우
		
		int score = 59;
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);
		
		
		// 연습 
		// 순위가 1이면 "금메달" , 순위가 2이면 "은메달", 순위가 3이면 "동메달"
		// 나머지 순위는 "없음"
		
		int rank = 4;
		
		String medal = (rank == 1) ? "금메달" : (rank == 2) ? "은메달" : (rank == 3) ? "동메달" : "없음";
		/*
		String medal = (rank == 1 || rank == 2 || rank == 3 ) ? "금메달" : "은메달" : "동메달"; 
		*/
		System.out.println("등수: " + medal);
				
		// 연습
		// 홀수는 "홀수" , 짝수는 "짝수" 
		// 힌트
		// 홀수 - 2 로 나눈 나머지가 1인 수
		// 짝수 - 2 로 나눈 나머지가 0인 수
		
		/*
		int n = 1005;
		String type = (n % 2 == 1) ? "홀수" : "짝수";
		System.out.println(type);
		
		*/
		
		// 연습.
		// 홀수는 "홀수" , 짝수는 "짝수" , 3의 배수는 "3의 배수" 
		// 3의 배수 -  3으로 나눈 나머지가 0인 수(단, 0은 고려하지 않는다.)
		
		int n = 1;
		String type = (n % 3 == 0) ? "3의 배수" : (n % 2 == 1) ? "홀수" : "짝수";
		//String type = (n % 2 == 1) ? "홀수" : "짝수";
		System.out.println(type);
		
		
		// 연습 
		// 주민번호 뒷 7자리중 첫 번째 숫자가 1,3,5 이면 "남자" ,  2,4,6 이면 "여자"
		
		
		int serial = 6234567;
		String gender = ((serial / 1000000) % 2 == 1) ? "남자" : "여자";
	//	String gender = (serial == 1 || serial == 3 || serial == 5 ) ? "남자" : (serial == 2 || serial == 4 || serial == 6 ) ? "여자";
		System.out.println(gender);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
