package com.bobenba.designmodel.MethodFactory;

public class ComputerCreator implements Creator {

	@Override
	public Product factory() {
		// TODO Auto-generated method stub
		return new Computer();
	}

}
