package com.bobeneba.designmode.Observer;

public class ConcreteSubject extends Subject{
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String newState){
		state = newState;
		System.out.println("主题状态为："+state);
		this.nodifyObservers(state);
	}
}
