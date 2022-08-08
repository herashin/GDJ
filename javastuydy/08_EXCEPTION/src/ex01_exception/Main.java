package ex01_exception;

import java.util.Scanner;

public class Main {

	
	public static void m1() {
	// 이곳에 static을 붙이는 이유는 
	// static 이 static을 부를 수 있다. 
	// static은 먼저 불러온다는 의미??
		
		// NullpointException : null 값이 어떤 메소드를 호출할 때 발생
		String[] hobbies = new String[5];
		
		// [0] 번이 값이 없기 때문에  반복문돌 돌지않고  null 에러가 출력된다. 
		hobbies[1] = "수영";
		hobbies[2] = "골프";
		hobbies[3] = "영화";
		hobbies[4] = "집콕";
		
		
		for( int i = 0; i <  hobbies.length; i++ ) {
			if( hobbies[i].equals("수영")  ) {
				//i 의 초기값은 0.    0에 equals를 실행하기 때문에 null
				System.out.println("취미가 나와 같군요");
				
			}
			
			
		}
		
	}
	
	
	public static void m2() {
		// 이곳에 static을 붙이는 이유는 
		// static 이 static을 부를 수 있다. 
		// static은 먼저 불러온다는 의미??
			
			// NullpointException : null 값이 어떤 메소드를 호출할 때 발생
			String[] hobbies = new String[5];
			
			// [0] 번이 값이 없기 때문에  반복문돌 돌지않고  null 에러가 출력된다. 
			hobbies[1] = "수영";
			hobbies[2] = "골프";
			hobbies[3] = "영화";
			hobbies[4] = "집콕";
			
			
			for( int i = 0; i <  hobbies.length; i++ ) {
				if( hobbies[i] != null && hobbies[i].equals("수영")  ) {
					//i 의 초기값은 0.    0에 equals를 실행하기 때문에 null				
					
					System.out.println("수영 ? 취미가 나와 같군요");
					
				}
				
				
			}
			
		}
	
	
	
	public static void m3() {
		
		// NumberFormatException : String을 Number 타입으로 변경할 때 발생
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력(필수) >>> ");
		String name = sc.nextLine();
		System.out.print(" 나이 입력 (선택) >>> ");
		String strAge = sc.nextLine(); // 입력 없이 Enter만 누르면 strAge는 
		int age = Integer.parseInt(strAge);
		
		System.out.println("이름: " + name + ", 나이: "+ age + "살");
		
	}
	
	
public static void m4() {
		
		// NumberFormatException 회피
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력(필수) >>> ");
		String name = sc.nextLine();
		System.out.print(" 나이 입력 (선택) >>> ");
		String strAge = sc.nextLine(); // 입력 없이 Enter만 누르면 strAge는 
		
		
		
	    int age;
	    if (strAge.isEmpty()) {
			age = 0;
		}
	    else {
	    	age = Integer.parseInt(strAge);
	    }
		
		
		System.out.println("이름: " + name + ", 나이: "+ age + "살");
		
	}
	
	public static void main(String[] args) {
	
		
	//		m1();
		// m2();
		//	m3();
			m4();
	}

}
