package com.bobeneba.designmodel.Prototype;

public class PrototypeDesign implements Cloneable{
	
	private String name;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public Object clone(){
		try {
			return super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
}
