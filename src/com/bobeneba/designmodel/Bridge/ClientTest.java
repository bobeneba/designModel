package com.bobeneba.designmodel.Bridge;

public class ClientTest {
	public static void main(String[] args){
		Manager manger = new Manager(new MysqlDriver());
		manger.getConnetct();
	}
}
