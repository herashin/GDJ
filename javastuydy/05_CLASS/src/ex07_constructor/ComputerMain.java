package ex07_constructor;

public class ComputerMain {

	public static void main(String[] args) {
		
		
		Computer myCom = new Computer("gram", 150);
										// 메소드에 전달값을 인수  라고 함
		
		myCom.printComputerStatus();
		
		Computer yourCom = new Computer();
		
		yourCom.printComputerStatus();
	}

}
