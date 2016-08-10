package com.bobeneba.designmodel.Memento;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("start 状态");
		System.out.println("初始状态"+originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		System.out.println("保存状态");
		originator.setState("run 状态");
		System.out.println("改变后状态："+originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后状态："+originator.getState());


	
	
	
	}

}
