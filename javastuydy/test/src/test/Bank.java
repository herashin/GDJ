package test;

public class Bank {
	
	
	
	private String accNo;
	private long balance;
	
	
	public Bank(String accno, long balance) { // Bank b = new Bank( "1234", 50000 );
		
		
		this.accNo = accNo;
		this.balance = balance;		
		
	}
	
	// 1. 입금(마이너스 입금 불가)
	
	public void deposit(long money) { // b.deposit(50000)
		if (money <= 0) {
			return; // 반환타입이 void인 메소드를 종료하는 코드
		}
		balance += money;
		
		
		
	}
	
	
	// 2. 출금(마이너스 출금 + 잔액보다 큰 출금 불가)
	// 실제로 출금된 금액을 반환
	 public long withrawal(long money) { // long 출금액 = b.withdrawal(5000);
		 
		 if(money <= 0 || money > balance) {
			 return 0;
			 
		 }
		 balance -= money;
		 return money;
		 
		 
	 }
	 
	 // 3. 이제(출금 -> 입금)
	 public void transfer(Bank other , long money) {
		 
		 // 내 통장에서 출금된 금액만큼 상대 계좌에 입금한다.
		 long withdrawalMoney = withrawal(money);
		 other.deposit(withdrawalMoney);
		 
		 

		 other.deposit( withrawal(money));
		 
		 	
		 
	 }
	 
	 // 4. 계좌 정보 확인
	 public void accInfo() {
		 System.out.println("계좌번호: " + accNo + " , 잔액 : " + balance + "원");
		 
		 
	 }
	 
	 
	 
	 //5 . 메인
	 
	 
	 
	 public static void main(String[] args) {
		 
		 Bank me= new Bank("1234", 50000);
		 Bank mom = new Bank("4567", 100000);
		 
		 
		 mom.transfer(me, 50000);
		 
		 me.accInfo();
		 mom.accInfo();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}