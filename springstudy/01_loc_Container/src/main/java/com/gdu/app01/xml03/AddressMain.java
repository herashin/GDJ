package com.gdu.app01.xml03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gdu.app01.xml02.Car;
import com.gdu.app01.xml02.Engine;

public class AddressMain {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("xml03/appCtx.xml");
		
		Person junho = ctx.getBean("personss", Person.class);
		System.out.println(junho.getAge());
		System.out.println(junho.getName());
		Person person = junho.getAddr();
		System.out.println();
		
		
		
		System.out.println(myCar.getModel());
		System.out.println(myCar.getMaker());
		Engine engine = myCar.getEngine();
		System.out.println(engine.getFuel());
		System.out.println(engine.getEfficency());
		System.out.println(engine.getCc());

	}

}
