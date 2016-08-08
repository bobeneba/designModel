package com.bobeneba.designmodel.Builder;

public class WelcomeBuilder extends Builder {
  private static final String subject = "Welcome to phihamony news group";
  public WelcomeBuilder(){
	  System.out.println("create WelcomeBuilder");
	  msg = new WelcomeMessage();
  }

@Override
public void buildBody() {
	// TODO Auto-generated method stub
	String body = "Congratulations for making the righet choice";
	msg.setBody(body);
}

@Override
public void buildSubject() {
	// TODO Auto-generated method stub
	msg.setSubject(subject);
	
}
}
