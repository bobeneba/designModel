package com.bobeneba.designmode.Observer;
/**   
* @Title: file_name 
* @Package package_name 
* @Description: TODO 观察者模式 推模式
* @author bobeneba dengtao139796@gmail.com
* @date 2016年8月9日 下午8:53:43 
* @version V1.0   
*/
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject(); 
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("改变状态为dengtao");
		
	}

}
