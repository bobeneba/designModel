package com.bobeneba.designmodel.Mediatro;

public class ConcreteMediator implements Mediator {

	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;

	@Override
	public void changed(Colleague c) {
		// TODO Auto-generated method stub
		System.out.println("协调和其他对象行为");
	}

}
