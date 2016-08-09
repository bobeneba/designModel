package com.bobeneba.designmode.Observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject(); 
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("改变状态为dengtao");
		
	}

}
