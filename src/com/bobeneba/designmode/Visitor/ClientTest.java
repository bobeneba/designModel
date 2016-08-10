package com.bobeneba.designmode.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor v1 = new ConcreteVisitorA();
		List<Visitable> list = new ArrayList<Visitable>();
		list.add(new ConcreteElementA());
		list.add(new ConcreteElementB());
		for(Visitable able:list){
			able.accept(v1);
		}
	
	
	
	}

}
