package com.bobeneba.designmodel.abstractFactory;

public class WinCreator implements Creator {

	@Override
	public Button factoryButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public Text factoryText() {
		// TODO Auto-generated method stub
		return new WinText();
	}

}
