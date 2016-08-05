package com.bobeneba.designmodel.abstractFactory;

public class UnixCreator implements Creator {

	@Override
	public Button factoryButton() {
		// TODO Auto-generated method stub
		return new UnixButton();
	}

	@Override
	public Text factoryText() {
		// TODO Auto-generated method stub
		return new UnixText();
	}

}
