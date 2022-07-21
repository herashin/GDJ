package ex02_loop;

public class Ex05_nested_for {

	public static void main(String[] args) {
		
		
		// 1일차 1교시
		// 1일차 2교시 
		// ...
		// 1일차 8교시
		// 2일차 1교시
		// ....
		// 3일차 8교시
		
		
		
		for ( int day = 1; day <= 3; day++  ) {
			
			for( int hour = 1; hour <=8; hour++  ) {
		//		System.out.println(day + "일차" + hour + "교시");
				
			}
			
			
		}
		
		//연습
		// 2x1= 2
		// 2x2= 4
		// ...
		// 9x9 = 81
		
		for( int gugu = 2; gugu <= 9; gugu++  ) {
			
			for( int dandan = 1; dandan <=9; dandan++   ) {
				
			//	System.out.println(gugu + "x" + dandan + " = " + (gugu*dandan));
				
				
			}
			System.out.println();// ㅋㅋㅋㅋㅋㅋㅋㅋㅋ 개쉽쥬? 별거없쥬? 신주노 개천재쥬? 재능충이쥬? 
			
		}
		
		
		
		// 연습
		// 2x1=2
		// 2x2=4
		// ...
		// 5x5 = 25
		
		/*
		for( int gu = 2; gu <= 5; gu++   )
		{
			
			for( int dan = 1; dan <= 9; dan++   )
			{
				System.out.println(gu + "x" + dan + " = " + (gu*dan));
				
				
				if ( gu == 5 && dan == 5 )
				{
					break; // 정답이죠? 정확했죠? 개빨랐죠?  아 멈출 수 없다 나의재능 아 무섭다 신주노
					
				}
				
			}
			
			
			System.out.println();
			
		}
		
		*/
		
		
		
		// 라벨(label)을 이용한 풀이
		outer: for( int gu = 2; gu <= 9; gu++   )
		{
			
			 for( int dan = 1; dan <= 9; dan++   )
			{
		//		System.out.println(gu + "x" + dan + " = " + (gu*dan));
				
				
				if ( gu == 5 && dan == 5 )
				{
					break outer; // 정답이죠? 정확했죠? 개빨랐죠?  아 멈출 수 없다 나의재능 아 무섭다 신주노
					
				}
				
			}
			/*
			if(gu == 5) {
				
				break;
			}
			*/
			
			System.out.println();
			
		}
		
		
		
		
		
		// 2x1=2   3x1=3 ...... 9x1=9
		// 2x1=4   3x2=6....... 9x2=18
		// .....
		
		
		
		for(int aa = 1; aa <=9; aa++ )
		{
			for (int bb = 2; bb<=9; bb++   )
			{
			System.out.print("   " + bb + "x" + aa + " = " + (bb*aa)+ "\t" );// \t  로  탭을 추가해 결과 정렬이 되었다. 아주 예쁘게 나온다.
			
			}
			
			System.out.println(); // ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 나의 재능. 멈출 수 없다.... 보라..!! 이 경이로운 코드를
			
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
