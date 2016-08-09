package com.bobeneba.designmodel.ObserverApi;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

	public Watcher(Observable o){
		o.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("状态发生改变： "+((Watched)o).getData());
	}

	
	

}
