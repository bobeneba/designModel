package com.bobeneba.designemodel.Composite;

public interface IFile {
	IFile getComposite();
	void sampleOperation();
	int getDeep();
	void setDeep(int x);
}
