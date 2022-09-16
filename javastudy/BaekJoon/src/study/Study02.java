package study;

public class Study02 {

	public static void main(String[] args) {
		// [1] : 숫자끼리의 연산
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("a + b" + c); // 3
		
		// [2] : 문자열끼리의 연산
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println(c1.getClass().getName());
		
		// [3] : 문자열 --> 숫자로 변환 후 연산
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		System.out.println(a2 + b2);
		
		// [4] : 진수지정
		
		System.out.println("-------------[진수지정]");
		System.out.println();
		
		
		
		
		
		
	}

}
