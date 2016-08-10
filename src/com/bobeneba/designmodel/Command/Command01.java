package com.bobeneba.designmodel.Command;

public class Command01  extends AbstractCommand{
	private AbstractReceiver receiver =null;

	public Command01(AbstractReceiver rec){
		this.receiver = rec;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("命令01 发布。。。");
        this.receiver.doJob();  

	}

}
