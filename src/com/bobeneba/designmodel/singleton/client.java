package com.bobeneba.designmodel.singleton;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A a = new A();
     B b= new B();
     A c =  new B();
     System.out.println(c.getA());
     B d = (B)c;
     System.out.println(d.getB());
	}

}
