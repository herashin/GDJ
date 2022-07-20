package ex03_number;

public class Ex01 {

	public static void main(String[] args) {
		
		// 산술 연산
		int a = 7;
		int b = 2;
		int result1 = a + b;
		int result2 = a - b;
		int result3 = a * b;
		int result4 = a / b; // 몫을 구할 때 
		int result5 = a % b; // 나눈 나머지 값을 구할 때
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		// 연습
		// 25을 2와 5로 나누어라.
		
		
		int n = 25;
		int ten = n / 10;  // 2  
		int one = n % 10;  // 5
		
		System.out.println(ten);
		System.out.println(one);
		
		
		// 연습
		// 90초를 1분30초로 나눠보기
		
		int second = 90;
		int m = second / 60; //1 
		int s = second % 60;  // 30
		
		System.out.println(m);
		System.out.println(s);
		
		
		
		// 연습 
		// a = 7이고 , b = 2이므로 
		// a 나누기 b는 3.5이다. 
		
		double resule = a / (double)b; // 하나만 캐스팅하면 나머지는 자동으로 변경됨.  계산이 안되기 때문에 자동 개꿀이됨 
		// 자바는 실수가 우선.  소숫점이 남아있으면 자바 마음대로 버리지 못함. 
		System.out.println(resule);
		
		
		
	}

}
