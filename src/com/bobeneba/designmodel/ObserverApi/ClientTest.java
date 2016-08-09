package com.bobeneba.designmodel.ObserverApi;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watched watched = new Watched();
		
		Watcher watcher = new Watcher(watched);
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");

	}

}
