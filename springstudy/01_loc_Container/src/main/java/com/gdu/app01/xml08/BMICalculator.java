package com.gdu.app01.xml08;

public class BMICalculator {

	
	
	private Calculator calc;
	private double height; // 키
	private double weight; // 몸무게
	private double bmi; // BMI(몸무게 / 키 * 키
	private String health; // bmi < 20 : 저체중 < 25: 정상, bmi < 30 : 과체중, 나머지 : 비만
	public BMICalculator(Calculator calc, double height, double weight, double bmi, String health) {
		super();
		this.calc = calc;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.health = health;
	}
	
	public void info() {
		System.out.println("BMI: "+ bmi);
		System.out.println("Health: "+ health);
	}
}
