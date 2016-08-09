package com.bobeneba.designmodel.MulFlyweight;



public class ConcreteFlyweight implements  Flyweight {
	private Character ch = null;
	public ConcreteFlyweight(Character state){
		ch = state;
	}
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("Intrinsic state = "+ this.ch);
		System.out.println("Extrsic status ="+ state);
	}

}
