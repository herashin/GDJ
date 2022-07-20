package ex03_number;

public class Ex03 {

	public static void main(String[] args) {
		
		
		// 대입 연산
		int score = 100;  // 등호(=)가 대입 연산자이다.
		
		System.out.println(score);
		
		// 연습
		// x 에 10이 있고, y 에 20이 있다.
		// x와 y에 저장된 값을 서로 교환하시오.
		
		int x = 10;
		int y = 20;
		
		int temp = x; // 10
		
		x = y; // 20
		y = temp; // 10 
		System.out.println(x);
		System.out.println(y); //ㅋㅋ 개쉽쥬? 쉬운거하니까 하나도 안졸리쥬? 배고프쥬? 오늘 식당메뉴 뭔지 궁금하쥬? 

		
		
		// 복합대입 연산자 
		// += , -+ , *=, /=, %= 등
		
		int wallet = 0;
		wallet = wallet + 5000;
		wallet += 5000; // wallet = wallet + 5000;
		
		wallet -= 3000; // wallet = wallet - 3000;
		System.out.println(wallet);
		
		
		
		// 연습
		// 통장 잔액(balance)에서 이자 5%를 받았음을 나타내자.
		
		long balance = 10000;
		
		
		balance *= 1.05; // balance는 long 이고  뒤는 실수라 double 이지만 개꿀자바라 자동으로 변환계산됨
		// balance를 double로 promotion해서 처리한다.
		System.out.println(balance);
		
		
		
		
		// balance = balance * 1.05; 실패.  
		// balance * 1.05 결과는 double이기 때문에 long balance에 저장할 수 없다.
		// balance = (long)(balance * 1.05); 성공.  balance *1.05 결과를 long으로 casting 해서 저장할 수 있다. 
	
		
		
		// balance = balance + balance * 0.05; 실패. balance + balance +balance * 0.05는 double이기 때문에 long balance에 저장할 수 없다.
		// balance = (long)(balance + balance * 0.05); 성공. balance + balance * 0.05 결과를 long으로 ㅊ
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
