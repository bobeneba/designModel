package com.bobeneba.designmodel.Decorator;

public class Mike extends CondimentDecorator{

	public Mike(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		System.out.println("println milk");
		return beverage.getDescription()+",milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.23;
	}

}
