package test;

public class inprun_study04 {

	
	public static int returnMethod() {
		int ret = 100; 
		
		ret *= 100;
		
		return ret; // 10000
		
	}
	
	
	
	public static void main(String[] args) {
		
		int rst;
		
		rst = returnMethod();
		
		
		
		
		System.out.println("메서드 호출에 따른 리턴된 값은 =" + rst);
	
	}

}
