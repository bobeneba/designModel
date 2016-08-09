package com.bobeneba.designmodel.MulFlyweight;

import java.util.HashMap;
import java.util.Map;

public class ConcreteComFlyweight implements Flyweight {
    
	private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
	public void add(Character key, Flyweight fly){
		files.put(key, fly);
		System.out.println("add"+files.size());
	}
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		Flyweight fly = null;
		for (Object o: files.keySet()){
			fly = files.get(o);
			System.out.println("operation");

			fly.operation(state);
		}
	}

}
