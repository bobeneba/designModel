package com.bobeneba.designmode.Observer;

public class ConcreteObserver implements Observer {

	private String observerState;
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
      observerState = state;
      System.out.println("状态为："+observerState);
	}
	
	
	
	
}
