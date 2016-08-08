package com.bobeneba.designmodel.Prototype;

public class ProClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypeDesign pro = new ConcretePrototype("张三");
		PrototypeDesign pro1 = (PrototypeDesign)pro.clone();
		System.out.println(pro.getName());
		System.out.println(pro1.getName());

	}

}
