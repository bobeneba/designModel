package com.bobeneba.designmodel.ChainResponsibility;

public abstract class Handler {
	protected Handler successor =null;
	
	public Handler getSuccessor(){
		return successor;
	}
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	public abstract String handleFeeRequest(String user,double fee);
	
	
}
