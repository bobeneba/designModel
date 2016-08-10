package com.bobeneba.designmodel.Command;

public class Command02 extends AbstractCommand{
	 private AbstractReceiver receiver = null;  
	 
	    public Command02(AbstractReceiver receiver) {  
	        this.receiver = receiver;  
	    }  
	 
	    public void execute() {  
	              System.out.println("命令02 被发布 ...");  
	        this.receiver.doJob();  
	    }  

}
