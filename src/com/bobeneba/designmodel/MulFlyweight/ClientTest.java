package com.bobeneba.designmodel.MulFlyweight;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> composite = new ArrayList<Character>();
		composite.add('a');
		composite.add('b');
		composite.add('c');
		composite.add('d');
		composite.add('d');
		composite.add('d');

		FlyweightFactory factory = new FlyweightFactory();
		Flyweight compositeFly= factory.factory(composite);
		//Flyweight compositeFly1= factory.factory(composite);
		compositeFly.operation("composite call");
		
		

		
	}

}
