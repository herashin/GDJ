package ex04_has_a_inherit;

public class SoldierMain {

	public static void main(String[] args) {
		
		/*
		Gun gun = new Gun();		
		gun.setModel("K2");	
		gun.setBullet(9);
		*/
		
		
		
		
		Soldier soldier = new Soldier();
		
		soldier.reload(10);
		soldier.shoot();
		
		
		System.out.println(soldier.getBullet());
	

	}

}
