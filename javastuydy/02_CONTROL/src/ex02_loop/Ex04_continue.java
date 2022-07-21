package ex02_loop;

public class Ex04_continue {

	public static void main(String[] args) {
		
		
		// continue 문
		// 반복문의 시작 지점으로 이동한다.
		// 실행에서 제외할 코드가 있는 경우에 사용한다.
		
		// 1 ~ 100 중에서 3의배수 제외하고 모두 더하기
		
		int a = 0;
		int b = 0;
		while( b < 100 ) {
			b++; 
			
			if ( b % 3 == 0 ) {
				continue;
				
			}
			
			
			a += b;
			
		//	System.out.println(a);
			
		}
		
		
		
		// continue 없이 코드를 만드는건 언제나 가능하다.
		int total = 0;
		
		int n = 0;		
		while( n < 100 ) {
			n++;
			if( n % 3 !=0 ) {
				
				total += n;
				
			}
			
			System.out.println(total);
		}
	
		
		
		

	}

}
