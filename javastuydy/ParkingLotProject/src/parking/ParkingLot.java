package parking;

import java.util.Scanner;



public class ParkingLot {

	
	private String name;
	private Car[] carss;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		sc = new Scanner(System.in);
		carss = new Car[10];
	}
	
	
	
	public void addCar() {
		
			System.out.println("현재 등록된 차량" +idx+ "대");			
		if (carss.length == idx ) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		
		System.out.println("차량번호 입력 >>> ");			
		String carNo = sc.next();
		System.out.print("차량 모델 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		carss[idx] = car;
	
		idx++;
		
		System.out.println("차량번호" + carNo  + "차량이 등록되었습니다.");
		System.out.println();
		
	}
	
	public void deleteCar() { 
		
		if ( idx == 0 ) {
			System.out.println("등록된 차량이 없습니다.");	
			return;
		}
	
		System.out.print("제거할 차량 번호 >>>> ");
		String carNumber = sc.next();
		carNumber = carNumber.replaceAll(" ", "");
		
		for ( int i = 0; i < idx; i ++ )
		{
		//	if( carss[i].getCarNo() ==   carNumber)
			if( carNumber.equals(carss[i].getCarNo() ) )
			{
				System.arraycopy(carss, i+1, carss, i, idx - i - 1);
				carss[--idx] = null;
				System.out.println("차량 번호 "+ carNumber + "차량이 삭제되었습니다.");
				System.out.println();
				return;
			}
		}
		System.out.println("대상 차량이 " + carss[idx].getCarNo() + "존재하지 않습니다.");	
		System.out.println();
	}
	
	
	
	 public void printAllCars() { 
		 System.out.println(name + "차량 목록");
		 if ( idx == 0 ) {
				System.out.println("등록된 차량이 없습니다.");	
				System.out.println();
				return;
			}
		 
		 System.out.println("===전체조회===");
			for( int i = 0; i < idx; i++ )
			{
				System.out.println(carss[i]);
				System.out.println();
				
			}		 
	 }
	 
	 
	 public void manage() { 
		 while( true ) {
				System.out.print("1. 추가 2.삭제 3.전체 0.종료 >>> ");
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:addCar();break;
				case 2:deleteCar();break;
				case 3:printAllCars();break;			
				case 0:System.out.println("주차 프로그램을 종료합니다. 행복하세요~ -행복 주차장-");
					return; // 

				default: System.out.println("존재하지 않는 메뉴입니다.");break;
				}
				
			}
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
