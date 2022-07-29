package test;

import java.util.Scanner;

public class prac1 {

	public static void main(String[] args) {
		
//	q1();
//	q2();
//	q3();
//	q4();
	q5();
		
		
		
	}
		
		
		/*************** 1번문제  ***************/
		public static void q1() {
		System.out.println("점수를 입력하세요 ( 0 ~ 100 ) >>>> ");
		
		System.out.println("학년을 입력하세요 (1 ~ 4 ) >>>>");
		
		
		
		Scanner cs = new Scanner(System.in);
		
		int score = cs.nextInt();
		
		int age = cs.nextInt();
		
		
		
		if ( score < 60  ) {
			System.out.println("불합격!");			
		}
		
		else if( score >= 60  ) 
		{
			if ( score < 70 && age == 4)
			{
				System.out.println("불합격!");
				
			}
			else 				
			{
				
				System.out.println("합격!");
			}			
		}
		}
		/*************** 1번문제  ***************/
		
		
		
		
		
		
		/*************** 2번문제  ***************/
		public static void q2() {
		Scanner cs = new Scanner(System.in);
		System.out.println("무슨 커피 드릴까요? >>> ");
		
		
		String coffee = cs.next();
		
		switch (coffee) {
		case "에스프레소": System.out.println("에스프레소는 3500원 입니다.");break;
		case "아메리카노": System.out.println("아메리카노는 2000원 입니다.");break;
		
			

		default: System.out.println(coffee + "는 메뉴에 없습니다.");
			break;
		}
		}
		/*************** 2번문제  ***************/
		
		
		
		
		/*************** 3번문제  ***************/		
		public static void q3() {
			Scanner cs = new Scanner(System.in);	
			System.out.println("금액을 입력하시오 >>>> ");
			int money = cs.nextInt();
			int[]unit={50000,10000,5000,1000,500,100,50,10,5,1};
			int change = 0;			
			
			for(int i = 0; i < unit.length; i ++) {				
				change = money /  unit[i];		
				if (change > 0)
				{
					System.out.println(unit[i] + "원 짜리 : " + change + "개");
				}				
				money = money - unit[i] * change;				
			}		
			
		}		
		/*************** 3번문제  ***************/
		
		
		/*************** 4번문제  ***************/
		public static void q4() {
			Scanner cs = new Scanner(System.in);	
			System.out.println("몇 개의 랜덤을 생성할까요?");
			int Arrnume = cs.nextInt();			
			int[] arr = new int[Arrnume];
			
			
			for ( int i =0; i < Arrnume; i++  )
			{
				int randoms = (int)(Math.random() * 100)+ 1;
				arr[i] = randoms;				
				
				if ( Arrnume > 100 )
				{
					System.out.println("다음에는 1~100 사이로 입력하세요");
					break;
					
				}
				for (int j = 0; j <= i; j++  )
				{
					if (arr[j] ==  randoms )
					{
						continue;
					}
					
				}			
				System.out.println(arr[i] + "\t");
			}			
		}
		/*************** 4번문제  ***************/
		
		
		
		/*************** 5번문제  ***************/
		public static void q5() {
			Scanner cs = new Scanner(System.in);	
			
			System.out.println("피카츄의점수입력 >>>");
			double pikachu = cs.nextDouble();
			
			System.out.println("뽀로로의점수입력 >>>");
			double pororo = cs.nextDouble();
			System.out.println("브레드의점수입력 >>>");
			double bread = cs.nextDouble();
			
			
			
			double total = (pikachu + pororo + bread) / 3;
			System.out.println("평균점수 : " + total);
			
			double[] arr = new double[3];
			arr[0] = pikachu;
			arr[1] = pororo;
			arr[2] = bread;
			
			
			for (int i = 0; i <= arr.length; i++)
			{
				if ( arr[i] >  total )
				{
					System.out.println("1등은 :" + );
				}
				
			}
			
			
		
		}
		/*************** 5번문제  ***************/
}


