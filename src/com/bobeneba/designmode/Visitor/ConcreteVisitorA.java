package com.bobeneba.designmode.Visitor;

public class ConcreteVisitorA implements Visitor {

	@Override
	public void visit(ConcreteElementB a) {
		// TODO Auto-generated method stub
		 a.operate();
	}

	@Override
	public void visit(ConcreteElementA able) {
		// TODO Auto-generated method stub
		able.operate();
	}

}
