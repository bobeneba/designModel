package com.bobeneba.designmodel.Decorator;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverate = new DarkRoast();
		System.out.println(beverate.getDescription()+"$"+beverate.cost());
		
		Beverage beverate1 = new HouseBlend();
		beverate1 = new Mike(beverate1);
		System.out.println(beverate1.getDescription()+"$"+beverate1.cost());
		beverate1 = new Mike(beverate1);
		System.out.println(beverate1.getDescription()+"$"+beverate1.cost());
		beverate1 = new Mike(beverate1);
		System.out.println(beverate1.getDescription()+"$"+beverate1.cost());
	}

}
