package com.bobeneba.designmodel.ChainResponsibility;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1 = new DeptManger();
		Handler h2 = new ProjectManager();
		h2.setSuccessor(h1);
		
		String  test = h2.handleFeeRequest("张三", 700);
		System.out.println(test);		
	}

}
