package com.bobeneba.designmodel.Builder;

public class GoodbyeBuilder extends Builder{
	  private static final String subject = "GOODbye to phihamony news group";

	 public GoodbyeBuilder() {
		// TODO Auto-generated constructor stub
		  System.out.println("create GoodBuilder");
		  msg = new WelcomeMessage();
	}
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		String body = "goodbye build body";
		msg.setBody(body);
	}

	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject(subject);
	}

}
