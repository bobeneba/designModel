package com.bobeneba.designmodel.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while(it.hasnext()){
			System.out.println(it.next());
		}
	}

}
