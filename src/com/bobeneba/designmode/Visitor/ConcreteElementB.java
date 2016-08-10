package com.bobeneba.designmode.Visitor;

public class ConcreteElementB implements Visitable{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this );
	}
	public void operate(){
		System.out.println("ConcreteElementB");
	}
}
