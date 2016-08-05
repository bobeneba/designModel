package com.bobeneba.designmodel.abstractFactory;

public class ClientTest {
	static Creator winCre,unixCre;
	static Button winBu,unixBu;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     winCre = new WinCreator();
     winBu = winCre.factoryButton();
     winBu.click();
	}

}
