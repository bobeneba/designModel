package com.bobeneba.designmodel.Mulsingleton;

import java.util.ArrayList;

public class MulSingleton {
	private static ArrayList<MulSingleton> mulSinArr = new ArrayList<MulSingleton>();
	private static final int MAX_NUM =5;
	
	static {
		for(int i=0; i<MAX_NUM;i++){
			mulSinArr.add(new MulSingleton());
		}
	}
	
	private  MulSingleton(){}
	
	public static MulSingleton getInstance(final int index){
		 if(index<MAX_NUM&&index>=0){  
	            return mulSinArr.get(index);  
	        }else{
	        	System.out.println("[error]::index outofindex");
	        return null;  
	        }
	}
}
