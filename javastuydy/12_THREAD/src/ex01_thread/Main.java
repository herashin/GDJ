package ex01_thread;

public class Main {

	public static void main(String[] args) {

		System.out.println("main 시작");
		
	    Process	process = new Process("연산");
		
	    process.start(); // Process 클래스의 오버라이드된 run() 메소드가 호출
	    // 프로세스 내부 처리는 프로세스에서 함.  main에서 처리하는것이 아니기 때문에
	    //  메인은  ㅇㅋ 너 start 하셈  하고 자기 할거 실행함.
	    
	    
	    Process process2 = new Process("제어");
	    process2.run();
	    
	    
	    
	    System.out.println("종료");
	    
	    
	    

	}

}
