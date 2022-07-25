package ex01_random;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 난수(Random number) 발생
		// Random 클래스, Math 클래스를 주로 활용한다.
		
		
		System.out.println(Math.random());
		
		
		// 0.0 <= Math.random() < 1.0
		// 0%  <= Math.random() < 100%
		
		// 확률 처리하기
		// 10% 확률로 "대박", 90% 확률로 "쪽박"
		
		if( Math.random() < 0.001  )
		{
			System.out.println("대박");
		}
		else {
			System.out.println("쪽박");
			
		}
		
		// 2. 난수 값 생성
		
		// Math.random()		0.0 <= n < 1.0
		// Math.random() * 5	0.0 <= n < 5.0
		// (int) (Math.random() * 5)
		// 괄호 int를  앞에 붙여서 강제 형 변환을 시킨다. >> 소숫점이 사라짐.
		
		// 연습
		// 주사위 2개 던지기
		/*
		int jusa = 1;
		jusa += (Math.random() *6);
		
		System.out.println(jusa);
		*/
		//(int) (Math.random() *5)+1;  <- 1부터 5개의 난수 발생  
		//(int) (Math.random() *5)+3;  <- 3부터 5개의 난수 발생 
		
		for( int n = 0; n < 2; n++ ) {
			int dice = (int)(Math.random() * 6) + 1;
			System.out.println("주사위 "+ dice );
			
			
		}
		
		
		
		// 연습
		// 6자리 숫자 인증번호 만들기
		// String code = "501924"
		
		String code = "";
		for ( int aa = 0; aa < 6; aa++  )
		{
			code += (int)(Math.random()*8)+1;			
			
		}
		System.out.print(code+ "");
		
		
		
		System.out.println();
		
	//	System.out.println((char)((int)(Math.random()* 26)+ 65));
		
		System.out.println((char)((int)(Math.random()* 26)+ 'A'));
		
		
		
		// 연습
		// 6자리 영문(대문자 + 소문자) 인증번호 만들기
		/*
		for ( int hh = 0; hh < 6; hh++    ) {
			
			int ii = (char)((int)(Math.random()* 26)+ 90);
			System.out.print(ii);
			
			if (ii > 90 || ) {}
			
			
		}*/
		
		
		code = "";
		for( int n = 0; n < 6; n++  )
		{
			if( Math.random() < 0.5 )
			{
				code += (char)( (int)(Math.random() * 26) + 'A' );
			}
			else {
				code += (char)( (int)(Math.random() * 26) + 'a' );
				
			}
		}
		System.out.println(code);
		
		

	}

}
