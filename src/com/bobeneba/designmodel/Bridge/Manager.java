package com.bobeneba.designmodel.Bridge;

public class Manager {
	private Driver driver;
	public Manager(Driver driver){
		this.driver = driver;
	}
	public void getConnetct(){
		driver.getConnetct();
	}
	public void setDriver(Driver driver){
		this.driver=driver;
	}
}
