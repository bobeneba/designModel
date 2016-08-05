package com.bobeneba.designmodel.singleton;

public class RegSingletonChild extends RegSingleton{
   public RegSingletonChild(){
	   
   }
   static public RegSingletonChild getInstance(){
	   return (RegSingletonChild) RegSingleton.getInstance("com.bobeneba.designmodel.singleton.RegSingletonChild");
   }
   public String about(){
	   return "Hello, i am RegSingletonchild";
   }
}
