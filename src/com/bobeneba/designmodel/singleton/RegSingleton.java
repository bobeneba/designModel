package com.bobeneba.designmodel.singleton;
/**   
* @Title: file_name 
* @Package package_name 
* @Description: TODO
* @author bobeneba dengtao139796@gmail.com
* @date 2016年8月5日 上午12:03:40 
* @version V1.0   
*/
import java.util.HashMap;

public class RegSingleton {
	static private HashMap m_registry = new HashMap();

	static {
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}

	protected RegSingleton() {

	}

	static public RegSingleton getInstance(String name) {
		if (name == null) {
			name = "com.bobeneba.designmodel.singleton.RegSingleton";
			System.out.println("name is null");
		}
		if (m_registry.get(name) == null) {
			try {
				System.out.println("name is not reg ,new instance");
				m_registry.put(name, Class.forName(name).newInstance());
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
       return (RegSingleton)(m_registry.get(name));
	}
	public String about(){
		return "Hello , I am RegSingleton";
	}
}


