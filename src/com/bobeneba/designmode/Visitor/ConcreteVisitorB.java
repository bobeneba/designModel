package com.bobeneba.designmode.Visitor;

public class ConcreteVisitorB implements Visitor {

	@Override
	public void visit(ConcreteElementB able) {
		// TODO Auto-generated method stub
		able.operate();
	}

	@Override
	public void visit(ConcreteElementA able) {
		// TODO Auto-generated method stub
		able.operate();
	}

}
