package com.bobeneba.designmodel.Mediatro;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      Mediator me = new ConcreteMediator();
      ConcreteColleagueA conA = new ConcreteColleagueA(me);
      conA.operation();
	}

}
