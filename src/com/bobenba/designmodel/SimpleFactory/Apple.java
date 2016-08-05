package com.bobenba.designmodel.SimpleFactory;

public class Apple implements Fruit{
	private int treeAge;

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		log("Apple is growing");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		log("Apple is harvest");
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
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
