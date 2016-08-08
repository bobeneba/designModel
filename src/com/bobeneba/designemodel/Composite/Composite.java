package com.bobeneba.designemodel.Composite;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component {

	private Vector<Component> componentVector = new Vector<Component>() ;
	
	@Override
	public Composite getComposite() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		componentVector.addElement(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		componentVector.removeElement(component);
	}



	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		Enumeration enums = components();
		while(enums.hasMoreElements()){
			System.out.println("Vector sampleOperation...");
			((Composite)enums.nextElement()).sampleOperation();
		}
      
	}
	
	@Override
   public Enumeration components(){
	   return componentVector.elements();
   }
}
