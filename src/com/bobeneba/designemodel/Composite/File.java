package com.bobeneba.designemodel.Composite;

public class File implements IFile {
	private String name;
	private int deep;
	
	public File(String name ){
		this.name= name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public IFile getComposite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		System.out.println("执行了 file  的方法");
	}

	@Override
	public int getDeep() {
		// TODO Auto-generated method stub
		return deep;
	}

	@Override
	public void setDeep(int x) {
		// TODO Auto-generated method stub
		this.deep = deep;
	}

}
