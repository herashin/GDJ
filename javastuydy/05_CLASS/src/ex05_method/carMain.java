package ex05_method;

public class carMain {

	public static void main(String[] args) {
		
		
		// 객체 생성
		Car car = new Car();
		
		car.addOil(50);
		car.addOil(5);
		car.addOil(50000);
		
		
		car.pushAccel();
		car.pushAccel();
		
		car.pushBrake();
	//	car.pushBrake();
	//	car.pushBrake();


		car.panel();

	}

}
