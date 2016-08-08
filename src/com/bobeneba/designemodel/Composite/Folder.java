package com.bobeneba.designemodel.Composite;

import java.util.Vector;

public class Folder implements IFile {
	
	private String name;
	
	private int deep;
	
	
	private Vector<IFile> componentVector = new Vector<IFile>();
	public Folder(String name){
		this.name =name;
	}
	
	public void add(IFile file){
		componentVector.add(file);
		file.setDeep(this.deep+1);
	}
	
	public void remove(IFile file){
		componentVector.remove(file);
	}
	
	public Vector getAllComponent(){
		return componentVector;
	}
	@Override
	public IFile getComposite() {
		// TODO Auto-generated method stub
		return this;
	}
   
	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
         System.out.println("执行某个方法");
	}

	@Override
	public int getDeep() {
		// TODO Auto-generated method stub
		return deep;
	}

	@Override
	public void setDeep(int x) {
		// TODO Auto-generated method stub
     this.deep=x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
