package com.bobeneba.designmodel.Flyweight;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory('a');
		fly.operation("first call");

		fly = factory.factory('b');
		fly.operation("first call");

		fly = factory.factory('b');
		fly.operation("second call");
		fly = factory.factory('b');
		fly.operation("second call");
	}

}
