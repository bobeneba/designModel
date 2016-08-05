package com.bobeneba.designmodel.singleton;

import java.io.File;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EagerSingleton e_instance =EagerSingleton.getInstance();
     LazySingleton l_instance = LazySingleton.getInstance();
     LazySingleton l_instance_1 = LazySingleton.getInstance();
     System.out.println(System.getProperty("user.dir")+File.separator+"Singleton.properties");
	}

}
