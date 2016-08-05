package com.bobenba.designmodel.SimpleFactory;

public class ClientTest {
	public static void main(String[] args){
	 try {
		 Fruit apple =FruitGardener.factory("apple");
		 Fruit grape = FruitGardener.factory("grape");
		 apple.grow();
		 apple.harvest();
	   // FruitGardener.factory("haha");
	    
	} catch (BadFruitException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
}
