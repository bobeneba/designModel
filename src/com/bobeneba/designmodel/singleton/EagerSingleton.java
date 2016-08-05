package com.bobeneba.designmodel.singleton;

public class EagerSingleton {
	
 private static final EagerSingleton instance = new EagerSingleton();
 
 private EagerSingleton(){ }
 
 public static EagerSingleton getInstance(){
	 System.out.println("EagerSingleton instance init");
	 return instance;
 }
} 

