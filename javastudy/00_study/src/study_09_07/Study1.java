package study_09_07;

public class Study1 {
	
	public static void plusMethod(int a,int b) {
		System.out.printf("인자로 넘겨받은 2개의 값은 %입니다.",a,b);
		int rst = a+b;
		
		System.out.println(" 두 수를 더한 값은 =" + rst);
	}
	
	
	public static void main(String[] args) {
		
		
		int a;
		int b;
		
		a = 10;
		b = 20;
		
		
		plusMethod(a,b);
		

	}

}
