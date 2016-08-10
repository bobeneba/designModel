package com.bobeneba.designmodel.Mediatro;

public class ConcreteColleagueA extends Colleague{
	public ConcreteColleagueA(Mediator mediator){
		super(mediator);
	}
	public void operation(){
		getMediator().changed(this);
	}
}
