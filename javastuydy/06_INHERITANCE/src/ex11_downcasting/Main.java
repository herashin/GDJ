package ex11_downcasting;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Hybrid();
		
		Car[] carss = new Car[10];
	//	String[] carssName = {"Car", "Ev", "Hybrid"};		
		
		for ( int i = 0; i < carss.length; i++    ) {
			
			if(Math.random() < 0.33)
			{
				carss[i] = new Car();
				
			}
			else if(  Math.random() < 0.66 ) {
				
				carss[i] = new Ev();
			}
			else {
				
				carss[i] = new Hybrid();
			}			
		}
		
		
		/*
		 * 
		 *  car 이면 drive() 호출
		 *  Ev 이면  charge() 호출
		 *  Hybride이면 addOil() 호출
		 * 
		 * */
		
		
		for( int i = 0; i < carss.length; i++   ) {
			
			if( carss[i] instanceof  Hybrid) { // 후손부터 먼저 체크함
				
				
				((Hybrid) car).addOil();
				
			}
			else if( carss[i] instanceof Ev ) {
				
				((Ev) car).charge();
			}

			else if( carss[i] instanceof Car ) {
				carss[i].drive();
				
			}
			
			 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		/*
		
		for(int i = 0; i < carss.length; i++) {
			
			int randoms = (int)(Math.random()*3);
			
		//	System.out.println(carssName[randoms]);	
		//	carssName = carssName[randoms];
			
			if (car instanceof Hybrid) {
				((Hybrid) car).addOil();
			}
			else if(car instanceof Ev) {
				
				((Ev) car).charge();
				
			}
			else {
				car.drive();
				
			}
			
		
			
		}
		
		*/
		
		
		
		
	}

}
