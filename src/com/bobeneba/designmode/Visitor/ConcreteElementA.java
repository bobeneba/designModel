package com.bobeneba.designmode.Visitor;

public class ConcreteElementA implements Visitable{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		//重点关注，起点
		v.visit(this );
	}
	public void operate(){
		System.out.println("ConcreteElementA");
	}
}
