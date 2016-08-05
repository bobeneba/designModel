package com.bobenba.designmodel.MethodFactory;

public class PenCreator implements Creator{

	@Override
	public Product factory() {
		// TODO Auto-generated method stub
		return new Pen();
	}

}
