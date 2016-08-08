package com.bobeneba.designmodel.Proxy;

public class AcessValidator {
	public boolean vaidateUser(String useID){
		if(useID.equals("Admin")){
			return true;
		}else{
			return false;
		}
	}
	
	
}
