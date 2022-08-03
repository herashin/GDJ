package ex15_interface;

public class Main {

	public static void main(String[] args) {
		
		
		//메소드 호출 연습
		
		Phone p1 = new Smartphone();
		p1.call();
		p1.sms();
		
		((Computer)p1).game();
		((Computer)p1).internet();
		
		
		
		Computer p2 = new Smartphone();
		(  ( Phone ) p2 ).call();
		(  ( Phone ) p2 ).sms();
		p2.game();
		
		Smartphone p3 = new Smartphone();
		p3.call();
		p3.game();
		p3.sms();
		p3.internet();

	}

}
