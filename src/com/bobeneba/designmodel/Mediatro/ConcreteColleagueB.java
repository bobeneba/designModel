package com.bobeneba.designmodel.Mediatro;

public class ConcreteColleagueB extends Colleague {
	public ConcreteColleagueB(Mediator mediator){
		super(mediator);
	}
	public void operation(){
		getMediator().changed(this);
	}
}
