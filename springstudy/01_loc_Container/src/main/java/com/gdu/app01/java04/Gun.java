package com.gdu.app01.java04;

public class Gun {
	
	private String model;
	private int bullet;
	public Gun(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}
	
	// info()
	public void iufo() {
		System.out.println("모델명: " + model);
		System.out.println("총알수: "+ bullet);
		
	}
	
}
