package com.bobeneba.designmodel.Builder;

public class BuilderClientTest {
	private static Director dw,dg;
	private static Builder bw,bg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bw=new WelcomeBuilder();
		dw=new Director(bw);
		dw.construct("dengtao@qq.com", "liuhao@qq.com");
	} 

}
