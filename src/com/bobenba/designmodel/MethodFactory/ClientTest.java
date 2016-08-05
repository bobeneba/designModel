package com.bobenba.designmodel.MethodFactory;

public class ClientTest {
	private static Creator penCreator, computerCreator;
	private static Product pen, computer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		penCreator = new PenCreator();
	    pen = penCreator.factory();
	    computerCreator = new ComputerCreator();
	    computer = computerCreator.factory();
	    computer.name();
	}

}
