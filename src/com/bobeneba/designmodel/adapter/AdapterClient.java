package com.bobeneba.designmodel.adapter;

public class AdapterClient {
	public static void main(String[] args){
		Target target = new ConTarget();
		target.request();
		Target target1 = new adapter();
		target1.request();
	}
}
