package ex02_thread;

public class Soldier extends Thread{
	
	private String name;
	private Gun gun;
	
	
	public Soldier(String name, Gun gun) {
		super();
		this.name = name;
		this.gun = gun;
	}
	
	public void shoot() {
		
		System.out.print(name + "이 (가) 총을 쐈다! ");
		gun.shoot();
	}
	
	
	@Override
	public void run() {
		
		try {
		// 1초에 한 발씩 쏘기
		while( gun.getBullet() != 0 ) {
			shoot();
			Thread.sleep(1000);
			
			
		}
		}catch( InterruptedException e ) {
			e.printStackTrace();	
			// 은행에서 내 일 봐주다가 전화받아서 내꺼 못해주는 뭐 그런상황
			
		}
		
		
	}
	
	
	
	

}
