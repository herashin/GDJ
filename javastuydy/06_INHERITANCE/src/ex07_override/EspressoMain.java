package ex07_override;

public class EspressoMain {

	public static void main(String[] args) {
		
		
		Espresso espresso = new Espresso();
		espresso.taste();
		
		
		ExtraWater extraWater = new ExtraWater();
		
		extraWater.taste();
		
		Milk milk = new Milk();
		
		milk.taste();
		

	}

}