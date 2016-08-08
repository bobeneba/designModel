package com.bobeneba.designmodel.Builder;

abstract public  class Builder {
	public AutoMessage msg;
	public Builder(){}
	
	public abstract void buildBody();
	public abstract void buildSubject();
	public void buildFrom(String from){
		msg.setFrom(from);
	}
	public void buildTo(String to){
		msg.setTo(to);
	}
	public void send(){
		msg.send();
	}
}
