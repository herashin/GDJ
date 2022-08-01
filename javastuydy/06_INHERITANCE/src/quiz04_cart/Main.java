package quiz04_cart;

public class Main {

	public static void main(String[] args) {
	
		Customer customer = new Customer();
		customer.setMoney(10000);
	
		
		customer.buy(new Snack("불고기", 5000));
		customer.buy(new Snack("홈런볼", 1500));
		customer.buy(new Snack("한우", 5000));
		customer.buy(new Snack("서울우유", 2500));
		
		
		customer.receipt();
	}

}
