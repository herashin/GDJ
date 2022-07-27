package ex05_method;

public class Car {

	
	// 필드
	int oil;
	int speed;
	
	
	// 메소드
	
	// 1. 기름 넣기
	// 반환타입 : void (반환값이 없다)
	// 메소드명 : addOil
	// 매개변수 : int o
	
	
	void addOil( int o )
	{
		oil += o;
		if ( oil >= 60 )
		{
			oil = 60;
		//	return;
		}
		
		
	}
	
	// 2. 달리기
	// 반환타입 : void
	// 메소드명 : pushAccel
	// 매개변수 : 없음
	/*
	void pushAccel() {
		// 속도는 25씩 증가, 최대 속도 120
		// 기름은 1씩 사용
		if (oil < 0)
		{
			return;
		}
		else {
			 speed += 25;
			 oil --;
			// 내 풀이
		}
	}
		*/
		
	
	void pushAccel() {
		if(oil == 0) // 기름이 0 이라면 
		{
			return; // 반환타입이 void일 때만 사용 가능
		}
		if( speed == 120 )
		{
			oil--;
			return; // 선생님 풀이엔 최고속도와  최고일 때 기름값 소모 추가
		}
		speed += 25;
		if ( speed > 120 )
		{
			speed = 120;
		}
		oil--;
		
	
	
		
	}
	
	
	
	// 3. 멈추기
	// 반환타입 : void
	// 메소드명 : pushVrake
	// 매개변수 : X
	
	void pushBrake() { //선생님 풀이
		if( speed == 0 )
		{
			return;
		}
		speed -= 25;
		if (speed < 0)
		{
			speed = 0;
		}
	}
	
	
	/*
	void pushBrake() {
		if( speed >= 25 )
		{
			speed -= 25;
			return;
		}
		else if(speed == 0)
		{
			System.out.println("정차중 입니다.");
			return;
			
		}
		
	}
	
	
	*/
	
	
	//4. 계기판 (기름 , 속도) 확인
	// 반환타입 : void
	// 메소드명 : panel
	// 매개변수 : x
	void panel() {
		
		System.out.println("기름 "+ oil);
		System.out.println("속도 "+ speed);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}














