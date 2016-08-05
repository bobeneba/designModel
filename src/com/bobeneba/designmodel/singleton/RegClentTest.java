package com.bobeneba.designmodel.singleton;
/**
*
*                     _oo0oo_
*                    o8888888o
*                    88" . "88
*                    (| -_- |)
*                    0\  =  /0
*                  ___/`---'\___
*                .' \\|     |// '.
*               / \\|||  :  |||// \
*              / _||||| -:- |||||- \
*             |   | \\\  -  /// |   |
*             | \_|  ''\---/''  |_/ |
*             \  .-\__  '-'  ___/-. /
*           ___'. .'  /--.--\  `. .'___
*        ."" '<  `.___\_<|>_/___.' >' "".
*       | | :  `- \`.;`\ _ /`;.`/ - ` : | |
*       \  \ `_.   \_ __\ /__ _/   .-` /  /
*   =====`-.____`.___ \_____/___.-`___.-'=====
*                     `=---='
*
*   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*               佛祖开光  永无bug
/**   
* @Title: file_name 
* @Package package_name 
* @Description: TODO test ReSingleton
* @author bobeneba dengtao139796@gmail.com
* @date 2016年8月5日 上午12:41:49 
* @version V1.0   
*/
public class RegClentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegSingleton rsl = RegSingleton.getInstance(null);
		RegSingleton rsl1 = RegSingleton.getInstance("com.bobeneba.designmodel.singleton.RegSingletonChild");
		RegSingleton rsl2 = RegSingleton.getInstance("com.bobeneba.designmodel.singleton.RegSingletonChild");

		System.out.println(rsl.about());
		System.out.println(rsl1.about());
		System.out.println(rsl2.about());
		
		
	}

}
