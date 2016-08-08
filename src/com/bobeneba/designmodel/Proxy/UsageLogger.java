package com.bobeneba.designmodel.Proxy;

public class UsageLogger {
	private String userId;
	public void setUserId(String useId){
		this.userId= useId;
	}
	public void save(){
		System.out.println(userId+"...Saving");
	}
}
