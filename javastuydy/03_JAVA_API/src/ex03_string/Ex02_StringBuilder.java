package ex03_string;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		
		// java.lang.StringBuilder 클래스
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(1);
		sb.append(true);
		sb.append("T");
		sb.append(3.14);
		sb.append("hello");
		
		
		System.out.println(sb);
		
		
		// 동등 비교
		// System.out.println(sb.equals("1trueT3.14hello"));
		
		
		//StringBuilder로 만든 문자열은 반드시 마지막에 string으로 변환해야 함
		
		String result = sb.toString();
		System.out.println(result);
		System.out.println(result.equals("1trueT3.14hello"));
		
		
		
		// adcdfodjkldfklsdfjklfklsdjfkld
		
		// String 과 Stringbuilder의 성능 테스트
		// 스트링빌더가 더 빠르다
		
		
		
		String alphabet1 = "";
		long begin1 = System.nanoTime();
		for ( char ch = 'a'; ch <= 'z'; ch++  ) {
			alphabet1 += ch;
		//	System.out.println(alphabet1);			
		}
		long end1 = System.nanoTime();
		
		System.out.println( (end1 - begin1) + alphabet1  );
		
		
		
//		String alphabet2 = "";
		StringBuilder sb2 = new StringBuilder();
		long begin2 = System.nanoTime();
		for( char ch = 'a'; ch <= 'z'; ch++   ) {
			sb2.append(ch);			
		}
		
		long end2 = System.nanoTime();
		String alphabet2 = sb2.toString();
		System.out.println( (end2 - begin2) + alphabet2 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
