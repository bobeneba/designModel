package com.bobeneba.designmodel.Command;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker = new Invoker();
		AbstractCommand command01 = new Command01(new Receiver01());
		invoker.setCommand(command01);
		invoker.action();
		
	}

}
