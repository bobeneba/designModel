package com.bobenba.designmodel.SimpleFactory;

public class Grape implements Fruit{
	private boolean seedless;
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		log("Apple is growing");
	}

	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		log("Apple is harvest");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		log("Apple is plant");
	}
	public static void log(String msg){
		System.out.println(msg);
	}
}
