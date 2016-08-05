package com.bobeneba.designmodel.Prosingleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProperClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Type quit to quit");
      do{
    	  System.out.println("Properties item to read");
    	  String line="a";
		try {
			line = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  if(line.equals("quit")){
    		  break;
    	  }
    	  
   	  System.out.println(ConfigManager.getInstance().getConfigItem(line, "not find"));
      }while(true);
	}

}
