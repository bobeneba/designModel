package com.bobeneba.designmodel.Facade;

public class MyFacade {
	private static Camara c1,c2;
	private static Light l1,l2;
    
	static 
	{
		c1 = new Camara();
		c2 = new Camara();
		l1 = new Light();
		l2 = new Light();
	}
	public static void activate(){
		c1.turnOn();
		c2.turnOn();
		l1.turnOn();
		l1.turnOn();
	}
	public static void deativate(){
		c1.turnOff();
		c2.turnOff();
		l1.turnOff();
		l2.turnOff();
	}
}
