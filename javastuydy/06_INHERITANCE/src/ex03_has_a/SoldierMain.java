package ex03_has_a;

public class SoldierMain {

	public static void main(String[] args) {
	
		
		Gun gun = new Gun();
		gun.setModel("K2");
		gun.setBullet(9);
		
		
		
		Soldier soldier = new Soldier();
		
		soldier.setGun(gun);
		
		
		// soldier가 총을 쏜다.
		soldier.shoot();
		
		
		
		// soldier가 장전한다.
		soldier.reload(1);
		
		
		
		// 솔져가 가지고 있는 gun의 모델명
		System.out.println("솔져가 가지고 있는 gun의 모델명 : "+  soldier.getGun().getModel());
		System.out.println("솔져의 총의 총알 : " + soldier.getGun().getBullet());
		
		
		
	}

}
