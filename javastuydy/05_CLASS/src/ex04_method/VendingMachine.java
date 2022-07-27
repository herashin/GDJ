package ex04_method;

public class VendingMachine {
	
	
	
	/*
	String getCoffee(int a, int coffee) {
		double money = a/1000;
		String coffee_result;
		switch (coffee) {
		case 1: coffee_result ="아메리카노"; break;
		case 2: coffee_result = "카페라떼"; break;
			

		default:
			break;
		}
		
		System.out.println(coffee_result + money + "잔");
		return money,coffee_result;
		
		
	}
	*/
	
	
	
	
	String getCoffee(int money, int button) {
		
		/*
		String[] menu = {"아메리카노", "카페라떼"};
		
		return menu[button - 1] + " " + (money/1000) + "잔";
		*/
		
		
		String[] menu = {"" , "아메리카노", "카페라떼"};
		
		return menu[button] + " " + (money/1000) + "잔";
		// 값을 1 과 2로 주니까 
		// 배열에 0값을 빈 문자로 넣어서  실행하는 방법!
		
	}
	
	
	
	
	
	
	
}
