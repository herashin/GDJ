package ex02_casting;

public class Ex03 {

	public static void main(String[] args) {
		
		String strScore = "100";
		String strMoney = "10000000000";
		String strGrade = "4.5"; 
		
		
		//문자열을 숫자 데이터로 변환하기		
		// 아래 변환은 매우 중요하다.
		int score = Integer.parseInt(strScore);
		
		long Money	= Long.parseLong(strMoney);
		
		double grade = Double.parseDouble(strGrade);
		
		System.out.println(score);
		System.out.println(Money);
		System.out.println(grade);
		
		
		// 100 -> "100"
		
		int age = 100;
		String atrAge = String.valueOf(age);
		
		System.out.println(atrAge);
		
		
	}

}
