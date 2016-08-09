package com.bobeneba.designmodel.MulFlyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
	private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
	
	public Flyweight factory(Character state){
		Flyweight fly = files.get(state);
		if(fly==null){
			fly =  new ConcreteFlyweight(state);
			files.put(state, fly);
			
		}
		return fly;
	}
  public Flyweight factory(List<Character> compositeState){
	  ConcreteComFlyweight comfly = new ConcreteComFlyweight();
	  for(Character state:compositeState ){
		  comfly.add(state, this.factory(state));
		  System.out.println("hehe");
	  }
	  return comfly;
	  
  }
   
}
