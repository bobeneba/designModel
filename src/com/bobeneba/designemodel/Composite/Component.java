package com.bobeneba.designemodel.Composite;

import java.util.Enumeration;

public interface Component {
	Composite getComposite();
	void sampleOperation();
	void add(Component component);
	void remove(Component component);
	Enumeration components();
	
}
