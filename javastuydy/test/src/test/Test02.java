package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		// 문제4. 0부터 Scanner 클래스를 이용해서 입력 받은 정수까지 모두 더한 뒤 평균을 출력하시오.
		// 만약, 0보다 작은 정수가 입력되면 평균은 그냥 0을 출력하시오.
		// 예시1
		// 마지막 정수 입력 >>> 5
		// 0부터 5사이 모든 정수의 평균 : 3.0
		// 예시2
		// 마지막 정수 입력 >>> -5
		// 평균 : 0
		
		
		Scanner sc = new Scanner( System.in  );
		int begin = 0;  // 0
		int end = 0;    // 입력 받은 정수
		
		
		end = sc.nextInt();
		
		if ( end > 0  )
		{
			int total = 0;
			
			for (  int i = begin; i <= end; i++ )
			{
				total += i;
				
				
				
				
			}			
			System.out.println(begin + "부터" + end + "사이 모든 정수의 평균 : " + (double)total / end );
		}
		else {
			System.out.println("정수 평균은 0");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
