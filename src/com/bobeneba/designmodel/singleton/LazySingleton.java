package com.bobeneba.designmodel.singleton;

public class LazySingleton {
	private static LazySingleton instance = null;
	private LazySingleton(){}
	
	synchronized public static LazySingleton getInstance(){
		if(instance==null){
		    System.out.println("LagerSingleton instance init");
			instance = new LazySingleton();
			return instance;
		}else{
			 System.out.println("LagerSingleton cannot init");
			return instance;
		}
	}
}
